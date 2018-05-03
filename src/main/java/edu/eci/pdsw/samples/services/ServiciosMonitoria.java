/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import edu.eci.pdsw.samples.entities.Monitoria;
import java.util.List;

/**
 *
 * @author camil
 */
public interface ServiciosMonitoria {
    
    public abstract void registrarMonitoria(Monitoria m) throws ExcepcionServiciosMonitoria;
    public abstract List<Monitoria> consultarMonitorias() throws ExcepcionServiciosMonitoria;
}
