/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Administrador;

/**
 *
 * @author jonnhi
 */
public interface AdministradorDAO {
    
    /**
     *
     * @param admin
     * @throws edu.eci.pdsw.samples.persistence.PersistenceException
     */
    public void save(Administrador admin) throws PersistenceException;
    
    /**
     *
     * @param codigo
     * @return Administrador con el codigo indicado en el parametro.
     * @throws edu.eci.pdsw.samples.persistence.PersistenceException
     */
    public Administrador load(Integer codigo) throws PersistenceException;
    
    /**
     *
     * @return Lista de administradores.
     * @throws edu.eci.pdsw.samples.persistence.PersistenceException
     */
    public List<Administrador> loadAll() throws PersistenceException;
}
