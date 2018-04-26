/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Monitor;

/**
 *
 * @author DANIEL
 */
public interface MonitorDAO {
    public void save(Monitor m) throws PersistenceException;
    public Monitor load(long id) throws PersistenceException;
}
