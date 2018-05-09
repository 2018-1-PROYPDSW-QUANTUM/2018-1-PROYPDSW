/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.TemaMapper;

/**
 *
 * @author diego, jonnhi
 */
public class MyBATISTemaDAO implements TemaDAO {
    
    @Inject
    private TemaMapper temaMapper;
    
    @Override
    public void save(Tema t) throws PersistenceException {
        temaMapper.registrarTema(t.getId(), t.getCurso().getNemonico(), t.getNombre(), t.getDescripcion());
    }
    
    @Override
    public Tema load(Integer id) throws PersistenceException {
        return temaMapper.consultarTema(id);
    }
    
    @Override
    public List<Tema> loadAll() throws PersistenceException {
        return temaMapper.consultarTemas();
    }
    
}
