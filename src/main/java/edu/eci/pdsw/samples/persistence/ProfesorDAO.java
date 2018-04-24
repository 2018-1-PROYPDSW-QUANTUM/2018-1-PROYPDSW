/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Profesor;
import java.util.Date;
import java.util.List;
/**
 *
 * @author diego
 */
public interface ProfesorDAO {
    public void save(Profesor c) throws PersistenceException;
    public List<Profesor> loadProfesor() throws PersistenceException ;
    public Profesor load(long id) throws PersistenceException;
    public Grupo loadGrupoProfesor(String NombreGrupo)throws PersistenceException ;
    public void AsignarGrupoAProfesor(Date year,String periodo,String neumonico,long idProf)throws PersistenceException;
    public List<Grupo> loadGrupoProfesor(long id) throws PersistenceException;
}
