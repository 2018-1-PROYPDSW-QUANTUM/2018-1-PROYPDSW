/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.ProfesorMapper;

/**
 *
 * @author diego
 */
public class MyBATISProfesorDAO implements ProfesorDAO {

    @Inject
    private ProfesorMapper profesorMapper;

    @Override
    public void save(Profesor p) throws PersistenceException {
        profesorMapper.registrarProfesor(p.getCodigo(), p.getNombre(), p.getApellido(), p.getCelular(), p.getCorreo(), p.getClave());
    }

    @Override
    public Profesor load(Integer codigo) throws PersistenceException {
        return profesorMapper.consultarProfesor(codigo);
    }

    @Override
    public List<Profesor> loadAll() throws PersistenceException {
        return profesorMapper.consultarProfesores();
    }

}
