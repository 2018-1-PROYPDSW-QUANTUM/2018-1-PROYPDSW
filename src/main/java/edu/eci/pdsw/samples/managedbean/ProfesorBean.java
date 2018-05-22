/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil, jonnhi
 */
@ManagedBean(name = "monitoriaProfesor")
@SessionScoped
public class ProfesorBean {

    @ManagedProperty("#{loginBean}")
    private ShiroLoginBean shiro;
    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private Profesor profesor;
    private Grupo grupoSelected;
    private List<Asistente> asistentes;

    public ProfesorBean() {
    }

    public void asistentesXGrupo(Grupo g) throws ExcepcionServiciosMonitoria {
        if (grupoSelected == null) {
            throw new ExcepcionServiciosMonitoria("Debe seleccionar un Curso!");
        }
        try {
            List<Asistente> asis = sm.consultarAsistentesXGrupo(g);
            setAsistentes(asis);
        } catch (ExcepcionServiciosMonitoria ex) {
            Logger.getLogger(ProfesorBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ShiroLoginBean getShiro() {
        return shiro;
    }

    public void setShiro(ShiroLoginBean shiro) {
        this.shiro = shiro;
        try {
            this.profesor = sm.consultarProfesor(Integer.parseInt(this.shiro.getUsername()));
        } catch (ExcepcionServiciosMonitoria ex) {
            Logger.getLogger(ProfesorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo getGrupoSelected() {
        return grupoSelected;
    }

    public void setGrupoSelected(Grupo grupoSelected) {
        this.grupoSelected = grupoSelected;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

}
