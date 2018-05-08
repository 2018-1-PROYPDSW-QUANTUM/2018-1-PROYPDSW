/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */

@ManagedBean(name = "monitoriaProfesor")
@SessionScoped
public class MonitoriaProfesorBean {

    private ServiciosMonitoria sm = ServiciosMonitoriasFactory.getInstance().getMonitoriasServices();
    private Profesor profesorMonitoria;
       
    public MonitoriaProfesorBean() {
        profesorMonitoria = new Profesor();
    }    

    public ServiciosMonitoria getSm() {
        return sm;
    }

    public void setSm(ServiciosMonitoria sm) {
        this.sm = sm;
    }

    public Profesor getProfesorMonitoria() throws ExcepcionServiciosMonitoria {
        return sm.consultarProfesor(998);
    }

    public void setProfesorMonitoria(Profesor profesorMonitoria) {
        this.profesorMonitoria = profesorMonitoria;
    }   
}
