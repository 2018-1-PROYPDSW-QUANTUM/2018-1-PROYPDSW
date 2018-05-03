/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.Monitoria;

/**
 *
 * @author jonnhi
 */
public interface AsistenteDAO {

    /**
     *
     * @param m Monitoria
     * @param e Estudiante
     * @param t Tema
     * @throws PersistenceException
     */
    public void save(Monitoria m, Estudiante e, Tema t) throws PersistenceException;

    /**
     *
     * @param id
     * @return
     * @throws PersistenceException
     */
    public Asistente loadMonitoriaAsistente(Integer id) throws PersistenceException;

    /**
     *
     * @param c
     * @return
     * @throws PersistenceException
     */
    public Asistente loadEstudianteAsistente(Integer c) throws PersistenceException;

    /**
     *
     * @param t
     * @return
     * @throws PersistenceException
     */
    public Asistente loadTemaAsistente(String t) throws PersistenceException;

    /**
     *
     * @return
     * @throws PersistenceException
     */
    public List<Asistente> loadAll() throws PersistenceException;
}
