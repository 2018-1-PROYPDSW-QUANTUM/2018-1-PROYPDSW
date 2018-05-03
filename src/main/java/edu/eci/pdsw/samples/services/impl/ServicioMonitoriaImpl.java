/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.MonitoriaDAO;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;

/**
 *
 * @author camil
 */
public class ServicioMonitoriaImpl implements ServiciosMonitoria{
    
    private ServiciosMonitoria serMon;
    
    @Inject
    private MonitoriaDAO daoMonitoria;

    @Inject
    private AdministradorDAO daoAdministrador;
    
    @Inject
    private CursoDAO daoCurso;
    
    @Inject
    private GrupoDAO daoGrupo;
    
    @Inject
    private ProfesorDAO daoProfesor;
    
    @Inject
    private TemaDAO daoTema;
    
    @Override
    public void registrarMonitoria(Monitoria nm,Grupo g ) throws PersistenceException {
         try {
            daoMonitoria.save(nm);
        } catch (PersistenceException ex) {
            throw new PersistenceException("Error al realizar la consulta:"+ex.getLocalizedMessage(), ex);
        } 
    }
    
}
