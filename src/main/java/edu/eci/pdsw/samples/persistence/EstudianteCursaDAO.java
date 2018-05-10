/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.EstudianteCursa;
import edu.eci.pdsw.samples.entities.Grupo;
import java.util.List;

/**
 *
 * @author jonnhi
 */
public interface EstudianteCursaDAO {

    /**
     *
     * @param ec
     * @throws PersistenceException
     */
    public void save(EstudianteCursa ec) throws PersistenceException;

    /**
     *
     * @param e
     * @return
     * @throws PersistenceException
     */
    public List<EstudianteCursa> loadXEstudiante(Estudiante e) throws PersistenceException;

    /**
     *
     * @param g
     * @return
     * @throws PersistenceException
     */
    public List<EstudianteCursa> loadXGrupo(Grupo g) throws PersistenceException;

    /**
     *
     * @return @throws PersistenceException
     */
    public List<EstudianteCursa> loadAll() throws PersistenceException;

}
