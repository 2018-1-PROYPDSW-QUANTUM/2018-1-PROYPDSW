/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.CursoMapper;

/**
 *
 * @author diego
 */
public class MyBATISCursoDAO implements CursoDAO {

    @Inject
    private CursoMapper cursoMapper;

    @Override
    public void save(Curso c) throws PersistenceException {
        cursoMapper.agregarCurso(c.getNemonico(), c.getNombre(), c.getCreditosAcademicos(), c.getHorasMonitoria());
    }

    @Override
    public Curso load(String nemonico) {
        return cursoMapper.consultarCurso(nemonico);
    }

    @Override
    public List<Curso> loadAll() throws PersistenceException {
        return cursoMapper.consultarCursos();
    }

}
