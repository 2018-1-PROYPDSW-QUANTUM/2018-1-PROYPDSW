/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Monitor;

/**
 *
 * @author DANIEL, jonnhi
 */
public interface MonitorDAO {

    /**
     *
     * @param m
     * @throws PersistenceException
     */
    public void save(Monitor m) throws PersistenceException;

    /**
     *
     * @param c
     * @return
     * @throws PersistenceException
     */
    public Monitor load(Integer c) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Monitor> loadAll() throws PersistenceException;
}
