/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Tema;
import java.util.List;

/**
 *
 * @author diego
 */
public interface TemaDAO {
    
    public void save(Tema t) throws PersistenceException;
    public List<Tema> loadTemas() throws PersistenceException;
    public Tema load(String nombre) throws PersistenceException;
    
}
