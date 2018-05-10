/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Estudiante;
import java.util.List;

/**
 *
 * @author jonnhi
 */
public interface EstudianteDAO {

    /**
     *
     * @param e Estudiante
     * @throws PersistenceException
     */
    public void save(Estudiante e) throws PersistenceException;

    /**
     *
     * @return
     * @throws PersistenceException
     */
    public List<Estudiante> loadAll() throws PersistenceException;
}
