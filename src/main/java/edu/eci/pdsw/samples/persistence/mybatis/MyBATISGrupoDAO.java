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
        grupoMapper.agregarGrupo(g.getId(), g.getSemestre().getId(), g.getCurso().getNemonico(), g.getNumero(), g.getProfesor().getId(), g.getMonitor().getCodigo());
    }

    @Override
    public Grupo load(Integer identificador) {
        return grupoMapper.consultarGrupo(identificador);
    }

    @Override
    public List<Grupo> loadAll() throws PersistenceException {
        return grupoMapper.consultarGrupos();
    }

}
