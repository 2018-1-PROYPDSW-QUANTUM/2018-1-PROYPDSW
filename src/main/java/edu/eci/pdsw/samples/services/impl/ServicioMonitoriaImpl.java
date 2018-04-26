/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import javax.inject.Inject;

/**
 *
 * @author camil
 */
public class ServicioMonitoriaImpl implements ServiciosMonitoria{

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
    public void registrarMonitoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
