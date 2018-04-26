/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Estudiante;

/**
 *
 * @author jonnhi
 */
public interface EstudianteDAO {
    
    public void save(Estudiante e) throws PersistenceException;
}
