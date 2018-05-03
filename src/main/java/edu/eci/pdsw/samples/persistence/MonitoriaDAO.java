/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Monitoria;

/**
 *
 * @author jonnhi
 */
public interface MonitoriaDAO {
    
    /**
     *
     * @param m
     * @throws PersistenceException
     */
    public void save(Monitoria m) throws PersistenceException;
    
    /**
     *
     * @param id
     * @return Monitoria registrada con el numero id
     * @throws PersistenceException
     */
    public Monitoria load(Integer id) throws PersistenceException;
    
    /**
     *
     * @return Lista de monitorias registradas
     * @throws PersistenceException
     */
    public List<Monitoria> load() throws PersistenceException;
    
}
