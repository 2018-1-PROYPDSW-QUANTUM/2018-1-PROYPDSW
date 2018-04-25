/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Tema;
import java.util.List;

/**
 *
 * @author diego
 */
public interface CursoDAO {
    public void save(Curso c) throws PersistenceException;
    public List<Curso> loadGrupos() throws PersistenceException;
    public Curso load(String neumonico);
    public List<Grupo> ConsultarGrupos(String neumonico) throws PersistenceException;
    public List<Tema> ConsultarTemas(String neumonico) throws PersistenceException;
}
