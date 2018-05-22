/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.persistence.EstudianteDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.EstudianteMapper;
import java.util.List;

/**
 *
 * @author jonnhi
 */
public class MyBATISEstudianteDAO implements EstudianteDAO{
    
    @Inject
    private EstudianteMapper estudiante;

    @Override
    public void save(Estudiante e) throws PersistenceException {
        estudiante.registrarEstudiante(e.getCodigo());
    }

    @Override
    public List<Estudiante> loadAll() throws PersistenceException {
        return estudiante.consultarEstudiantes();
    }
    
    public Estudiante load(Integer codigo) throws PersistenceException {
        return estudiante.consultarEstudiante(codigo);
    }
    
}
