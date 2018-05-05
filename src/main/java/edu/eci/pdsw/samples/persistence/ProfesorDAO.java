/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Profesor;

/**
 *
 * @author diego
 */
public interface ProfesorDAO {

    /**
     *
     * @param p
     * @throws PersistenceException
     */
    public void save(Profesor p) throws PersistenceException;

    /**
     *
     * @param id
     * @return
     * @throws PersistenceException
     */
    public Profesor load(Integer id) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Profesor> loadAll() throws PersistenceException;

}
