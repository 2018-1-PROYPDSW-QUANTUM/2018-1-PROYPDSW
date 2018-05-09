/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import java.util.List;
import edu.eci.pdsw.samples.entities.Semestre;

/**
 *
 * @author jonnhi
 */
public interface SemestreDAO {

    /**
     *
     * @param semestre
     * @throws PersistenceException
     */
    public void save(Semestre semestre) throws PersistenceException;

    /**
     *
     * @param years
     * @param periodoAcademico
     * @return Registro del semestre year y periodoAcademico
     * @throws PersistenceException
     */
    public Semestre load(Integer years, String periodoAcademico) throws PersistenceException;

    /**
     *
     * @return Lista de los semestres registrados
     * @throws PersistenceException
     */
    public List<Semestre> loadAll() throws PersistenceException;
}
