/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.ProfesorMapper;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.TemaMapper;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author diego
 */
public class MyBATISTemaDAO implements TemaDAO{
    
    @Inject
    private TemaMapper temaMapper;

    @Override
    public void save(Tema t) throws PersistenceException {
        temaMapper.AgregarTema(t.getIdentificador() ,t.getNombre(), t.getdescripcion(), t.getCursoNeumonico());
    }

    @Override
    public List<Tema> loadTemas() throws PersistenceException {
        return temaMapper.ConsultarTemas();
    }

    @Override
    public Tema load(String nombre) throws PersistenceException {
        return temaMapper.ConsultarTema(nombre);
    }


    
}
