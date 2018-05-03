/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriaFactory;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */
@ManagedBean(name = "RegistroMonitoria")
@SessionScoped
public class RegistroMonitoriaBean implements Serializable{
    
    private ServiciosMonitoria sm = ServiciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    private Monitoria nuevaMonitoria;
    private Grupo grupo;    
    private Franja franjaMonitoria;
    private Estudiante estudianteMonitoria;

    public RegistroMonitoriaBean() throws PersistenceException{
        
    }    
    
    public Monitoria getNuevaMonitoria() {
        return nuevaMonitoria;
    }

    public List<Monitoria>consultarMonitorias() throws ExcepcionServiciosMonitoria{
        return sm.consultarMonitorias();
    }
    
    public void setNuevaMonitoria(Monitoria nuevaMonitoria) throws PersistenceException, ExcepcionServiciosMonitoria {
        sm.registrarMonitoria(nuevaMonitoria);
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ServiciosMonitoria getSm() {
        return sm;
    }

    public void setSm(ServiciosMonitoria sm) {
        this.sm = sm;
    }

    public Franja getFranjaMonitoria() {
        return franjaMonitoria;
    }

    public void setFranjaMonitoria(Franja franjaMonitoria) {
        this.franjaMonitoria = franjaMonitoria;
    }

    public Estudiante getEstudianteMonitoria() {
        return estudianteMonitoria;
    }

    public void setEstudianteMonitoria(Estudiante estudianteMonitoria) {
        this.estudianteMonitoria = estudianteMonitoria;
    }
    
}