/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.GrupoMapper;
import java.util.List;

/**
 *
 * @author diego
 */
public class MyBATISGrupoDAO implements GrupoDAO {

    @Inject
    private GrupoMapper grupoMapper;

    @Override
    public void save(Grupo g) throws PersistenceException {
        grupoMapper.AgregarGrupo(g.getIdentificador(), g.getSemestre().getId(), g.getPeriodoAcademico(), g.getCurso().getNeumonico(), g.getNumero(), g.getProfesor(), g.getMonitor());
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
