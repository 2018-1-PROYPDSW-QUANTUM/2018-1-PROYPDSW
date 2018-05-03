/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Franja;

/**
 *
 * @author DANIEL
 */
public interface FranjaDAO {
    
    /**
     *
     * @param f
     * @throws PersistenceException
     */
    public void save(Franja f) throws PersistenceException;

    /**
     *
     * @param id
     * @return
     * @throws PersistenceException
     */
    public Franja load(long id) throws PersistenceException;
}
