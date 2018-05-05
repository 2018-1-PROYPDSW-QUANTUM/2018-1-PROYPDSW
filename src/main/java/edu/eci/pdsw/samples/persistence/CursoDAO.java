/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Curso;

/**
 *
 * @author diego
 */
public interface CursoDAO {

    /**
     *
     * @param c
     * @throws PersistenceException
     */
    public void save(Curso c) throws PersistenceException;

    /**
     *
     * @param nemonico
     * @return
     */
    public Curso load(String nemonico);

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Curso> loadAll() throws PersistenceException;

}
