/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
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
     * @return Franja con identificador ir
     * @throws PersistenceException
     */
    public Franja load(Integer id) throws PersistenceException;
    
    /**
     *
     * @return Lista de las franjas asignadas
     * @throws PersistenceException
     */
    public List<Franja> loadAll() throws PersistenceException;

    /**
     *
     * @param id
     * @return 
     * @throws edu.eci.pdsw.samples.persistence.PersistenceException
     */
    public List<Franja> consultarFranjasXMateria(Integer id) throws PersistenceException;
}
