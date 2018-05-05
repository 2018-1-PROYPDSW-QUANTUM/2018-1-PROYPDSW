/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Tema;
import java.util.List;

/**
 *
 * @author diego
 */
public interface TemaDAO {

    /**
     *
     * @param t
     * @throws PersistenceException
     */
    public void save(Tema t) throws PersistenceException;

    /**
     *
     * @param id
     * @return
     * @throws PersistenceException
     */
    public Tema load(Integer id) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Tema> loadAll() throws PersistenceException;

}
