/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.Monitoria;

/**
 *
 * @author jonnhi
 */
public interface AsistenteDAO {

    /**
     *
     * @param m Codigo Monitoria
     * @param e Codigo Estudiante
     * @param t Codigo Tema
     * @throws PersistenceException
     */
    public void save(Integer m, Integer e, Integer t) throws PersistenceException;

    /**
     *
     * @param grupo
     * @param nemonico
     * @return
     * @throws PersistenceException
     */
    public List<Asistente> loadMonitoriaXGrupo(int grupo, String nemonico) throws PersistenceException;    
    
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
     * @param c
     * @return
     * @throws PersistenceException
     */
    public List<Asistente> loadAsistenteXCurso(Curso c) throws PersistenceException;

    /**
     *
     * @return
     * @throws PersistenceException
     */
    public List<Asistente> loadAll() throws PersistenceException;
}
