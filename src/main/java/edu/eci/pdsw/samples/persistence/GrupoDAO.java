/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Grupo;

/**
 *
 * @author diego
 */
public interface GrupoDAO {

    /**
     *
     * @param g
     * @throws PersistenceException
     */
    public void save(Grupo g) throws PersistenceException;

    /**
     *
     * @param id
     * @return
     */
    public Grupo load(Integer id);

    /**
     *
     * @return
     * @throws PersistenceException
     */
    public List<Grupo> loadAll() throws PersistenceException;

}
