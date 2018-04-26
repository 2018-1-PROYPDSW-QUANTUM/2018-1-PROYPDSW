/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbean;

import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriaFactory;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author camil
 */
@ManagedBean(name = "RegistroMonitoria")
@SessionScoped
public class RegistroMonitoriaBean implements Serializable{
    
    private Monitoria nuevaMonitoria;
    private Grupo grupo;
    private ServiciosMonitoria sm ;

    public Monitoria getNuevaMonitoria() {
        return nuevaMonitoria;
    }

    
        
    public RegistroMonitoriaBean()throws PersistenceException{
        sm=ServiciosMonitoriaFactory.getInstance().getServiciosMonitoria();
        
    
    }
    
    
    public void setNuevaMonitoria(Monitoria nuevaMonitoria, Grupo grupo) throws PersistenceException {
        sm.registrarMonitoria(nuevaMonitoria, grupo);
    }

    
    


    
}
