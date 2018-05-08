/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import java.util.List;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.entities.Profesor;
import java.util.Date;

/**
 *
 * @author jonnhi
 */
public interface ServiciosMonitoria {

    /**
     *
     * @param admin
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarAdministrador(Administrador admin) throws ExcepcionServiciosMonitoria;

    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Administrador consultarAdministrador(Integer codigo) throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Administrador> consultarAdministradores() throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @param pro
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarProfesor(Profesor pro) throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @param codigo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Profesor consultarProfesor(Integer codigo) throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Profesor> consultarProfesores() throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @param sem
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract void registrarSemestre(Semestre sem) throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @param year
     * @param periodo
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract Semestre consultarSemestre(Integer year, String periodo) throws ExcepcionServiciosMonitoria;
    
    /**
     *
     * @return
     * @throws ExcepcionServiciosMonitoria
     */
    public abstract List<Semestre> consultarSemestres() throws ExcepcionServiciosMonitoria;
    
    /**
     * 
     */
    public abstract void registrarMonitoria(int id, Date fecha, Date horaInicio, Date horaFin, String direccionIp, String observaciones, int codigoMonitor)
            throws ExcepcionServiciosMonitoria;
    
    /**
     * 
     */
    public abstract Monitoria consultarMonitoria() throws ExcepcionServiciosMonitoria;
    
    /**
     * 
     */
    public abstract List<Monitoria> consultarMonitorias() throws ExcepcionServiciosMonitoria;
}
