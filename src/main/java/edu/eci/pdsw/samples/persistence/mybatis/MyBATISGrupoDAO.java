/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.GrupoMapper;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.ProfesorMapper;
import java.time.Year;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author diego
 */
public class MyBATISGrupoDAO implements GrupoDAO{
    @Inject
    private GrupoMapper grupoMapper;

    @Override
    public void save(Grupo g) throws PersistenceException {
        grupoMapper.AgregarGrupo(g.getIdentificador(), g.getSemestre().getIdentificador(), g.getPeriodoAcademico(), g.getCurso().getNeumonico(), g.getNumero(), g.getProfesor(), g.getMonitor());
    }

    @Override
    public List<Grupo> loadGrupos() throws PersistenceException {
        return grupoMapper.ConsultarGrupos();
    }

    @Override
    public Grupo load(long identificador) {
        return grupoMapper.ConsultarGrupo(identificador);
    }
    
}
