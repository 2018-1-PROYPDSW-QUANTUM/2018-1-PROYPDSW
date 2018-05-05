/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Tema;
import java.time.Year;
import java.util.List;

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
     * @param identificador
     * @return
     */
    public Grupo load(Integer identificador);

    /**
     *
     * @return
     * @throws PersistenceException
     */
    public List<Grupo> loadAll() throws PersistenceException;

}
