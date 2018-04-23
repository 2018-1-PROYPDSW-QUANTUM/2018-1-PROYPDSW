/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Profesor;
import java.util.List;
/**
 *
 * @author diego
 */
public interface ProfesorDAO {
    public void save(Profesor c) throws PersistenceException;
    public List<Profesor> loadProfesor() throws PersistenceException ;
    public Profesor load(int id) throws PersistenceException;
    public Curso loadCursoProfesor(String NombreCurso)throws PersistenceException ;
    public void AsignarCursoAProfesor(String NombreCurso,long idProf)throws PersistenceException;
}
