/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

//import com.google.inject.Inject;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.ProfesorMapper;
import java.util.Date;
import java.util.List;

/**
 *
 * @author diego
 */
public class MyBATISProfesorDAO implements ProfesorDAO {

    @Inject
    private ProfesorMapper profesorMapper;

    @Override
    public void save(Profesor c) throws PersistenceException {
        profesorMapper.agregarProfesor(c.getId(), c.getNombre(), c.getApellido(), c.getCelular(), c.getCorreo(), c.getClave());
    }

    @Override
    public Profesor load(Integer id) throws PersistenceException {
        return profesorMapper.consultarProfesor(id);
    }

    @Override
    public List<Profesor> loadAll() throws PersistenceException {
        return profesorMapper.consultarProfesores();
    }

}
