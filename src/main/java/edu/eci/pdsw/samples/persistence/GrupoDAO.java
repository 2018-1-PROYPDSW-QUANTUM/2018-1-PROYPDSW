/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitor;
import edu.eci.pdsw.samples.entities.Profesor;

/**
 *
 * @author diego
 */
public interface GrupoDAO {

    /**
     *
     * @param profesorId
     * @param grupoId
     * @throws PersistenceException
     */
    public void añadirProfesorAGrupo(Integer profesorId, Integer grupoId) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Grupo> consultarGruposSinProfesor() throws PersistenceException;

    /**
     *
     * @param codigo
     * @throws PersistenceException
     */
    public void añadirMonitorAGrupo(Integer codigo, Integer grupoId) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Grupo> loadGruposSinMonitor() throws PersistenceException;

    /**
     *
     * @param g
     * @param p
     * @param m
     * @throws PersistenceException
     */
    public void save(Grupo g, Profesor p, Monitor m) throws PersistenceException;

    /**
     *
     * @param id
     * @return
     * @throws edu.eci.pdsw.samples.persistence.PersistenceException
     */
    public Grupo load(Integer id) throws PersistenceException;

    /**
     *
     * @param materiaProfesor
     * @return
     * @throws PersistenceException
     */
    public List<Grupo> loadGruposXMateria(String materiaProfesor) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<Grupo> loadAll() throws PersistenceException;

    /**
     *
     * @param codigo
     * @return
     * @throws edu.eci.pdsw.samples.persistence.PersistenceException
     */
    public List<Grupo> consultarGrupos(Integer codigo) throws PersistenceException;

}
