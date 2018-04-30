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
    
    public void save(Grupo g) throws PersistenceException;
    public List<Grupo> loadGrupos() throws PersistenceException;
    public Grupo load(long identificador);
    
    
}
