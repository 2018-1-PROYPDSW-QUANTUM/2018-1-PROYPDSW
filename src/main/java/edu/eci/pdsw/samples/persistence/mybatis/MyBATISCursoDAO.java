/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.CursoMapper;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author diego
 */
public class MyBATISCursoDAO implements  CursoDAO{
    
    @Inject
    private CursoMapper cursoMapper;
    
    @Override
    public void save(Curso c) throws PersistenceException {
        cursoMapper.AgregarCurso(c.getNeumonico(), c.getNombre(), c.getCreditosAcademicos(), c.getProgramaAcademico());
    }

    @Override
    public List<Curso> loadGrupos() throws PersistenceException {
        return cursoMapper.ConsultarCursos();
    }

    @Override
    public Curso load(String neumonico) {
        return cursoMapper.ConsultarCurso(neumonico);
    }

    @Override
    public List<Grupo> ConsultarGrupos(String neumonico) throws PersistenceException {
        return cursoMapper.ConsultarGruposCurso(neumonico);
    }

    @Override
    public List<Tema> ConsultarTemas(String neumonico) throws PersistenceException {
        return cursoMapper.ConsultarTemasCurso(neumonico);
    }
    
}
