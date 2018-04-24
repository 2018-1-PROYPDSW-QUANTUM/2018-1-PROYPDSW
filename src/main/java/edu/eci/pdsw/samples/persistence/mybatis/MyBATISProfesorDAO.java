/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

//import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.profesorMapper;
import java.util.List;

/**
 *
 * @author diego
 */
public class MyBATISProfesorDAO implements ProfesorDAO  {
    //@Inject
    private profesorMapper profesorMapper;

    @Override
    public void save(Profesor c) throws PersistenceException {
        profesorMapper.agregarProfesor(c.getId(),c.getNombre(),c.getApellido(),c.getTelefono(),c.getCorreo());
    }

    @Override
    public List<Profesor> loadProfesor() throws PersistenceException {
        return profesorMapper.consultarProfesores();
    }

    @Override
    public Profesor load(long id) throws PersistenceException {
        return profesorMapper.consultarProfesor(id);
    }

    @Override
    public List<Curso> loadCursoProfesor(long id) throws PersistenceException {
        return profesorMapper.consultarCusosProfesor(id);
    }

    @Override
    public void AsignarCursoAProfesor(String NombreCurso, long idProf) throws PersistenceException {
        profesorMapper.asignarCursoAProfesor(NombreCurso, idProf);
    }

    @Override
    public Curso loadCursoProfesor(String NombreCurso) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*@Override
    public void save(Profesor c) throws PersistenceException {
        ProfesorMapper.agregarProfesor(c.getId(),c.getNombre(),c.getApellido(),c.getTelefono(),c.getCorreo());
        
    }*/
