/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */
@ManagedBean(name = "indexBean")
@SessionScoped
public class indexBean implements Serializable{
    
    private final ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private List<Franja>  franjas;
    private List<Curso> cursos;
    private String curso;

    public indexBean() throws ExcepcionServiciosMonitoria {
        franjas=sm.consultarFranjas();
        cursos=sm.consultarCursos();
    }
    
    public List<Franja> getFranjas() {
        return franjas;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso=curso;
    }
    
    public void buscarFranjas(){
        for (Franja i : franjas) {
            if(!i.getGrupo().getCurso().getNemonico().equals(curso)){
                franjas.remove(i);
            }
        }
    }
    
}
