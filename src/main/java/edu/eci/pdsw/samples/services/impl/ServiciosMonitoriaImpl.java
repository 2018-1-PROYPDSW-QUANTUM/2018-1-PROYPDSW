/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.FranjaDAO;
import edu.eci.pdsw.samples.persistence.MonitorDAO;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.SemestreDAO;
import edu.eci.pdsw.samples.persistence.AsistenteDAO;
import edu.eci.pdsw.samples.persistence.MonitoriaDAO;
import edu.eci.pdsw.samples.persistence.EstudianteDAO;
import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;

import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoria;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import java.util.List;

/**
 *
 * @author camil
 */
public class ServiciosMonitoriaImpl implements ServiciosMonitoria {

    @Inject
    private AdministradorDAO daoAdministrador;

    @Inject
    private AsistenteDAO daoAsistente;

    @Inject
    private CursoDAO daoCurso;

    @Inject
    private EstudianteDAO daoEstudiante;

    @Inject
    private FranjaDAO daoFranja;

    @Inject
    private GrupoDAO daoGrupo;

    @Inject
    private MonitorDAO daoMonitor;

    @Inject
    private MonitoriaDAO daoMonitoria;

    @Inject
    private ProfesorDAO daoProfesor;

    @Inject
    private SemestreDAO daoSemestre;

    @Inject
    private TemaDAO daoTema;

    @Override
    public void registrarMonitoria(Monitoria m) throws ExcepcionServiciosMonitoria {
        try {
            daoMonitoria.save(m);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosMonitoria("Error al registrar la monitoria: " + m.getId(), ex);
        }
    }

    @Override
    public List<Monitoria> consultarMonitorias() throws ExcepcionServiciosMonitoria {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
