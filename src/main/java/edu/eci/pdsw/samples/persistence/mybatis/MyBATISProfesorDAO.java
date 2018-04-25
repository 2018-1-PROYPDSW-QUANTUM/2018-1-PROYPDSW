/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

//import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.ProfesorMapper;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author diego
 */
public class MyBATISProfesorDAO implements ProfesorDAO  {
    @Inject
    private ProfesorMapper profesorMapper;

    @Override
    public void save(Profesor c) throws PersistenceException {
        profesorMapper.AgregarProfesor(c.getId(),c.getNombre(),c.getApellido(),c.getTelefono(),c.getCorreo());
    }

    @Override
    public List<Profesor> loadProfesor() throws PersistenceException {
        return profesorMapper.ConsultarProfesores();
    }

    @Override
    public Profesor load(long id) throws PersistenceException {
        return profesorMapper.ConsultarProfesor(id);
    }

    @Override
    public void AsignarGrupoAProfesor(Date year,String periodo,String neumonico, long idProf) throws PersistenceException {
        profesorMapper.AsignarGrupoAProfesor(year,periodo,neumonico, idProf);
    }

    @Override
    public Grupo loadGrupoProfesor(String NombreGrupo) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Grupo> loadGrupoProfesor(long id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*@Override
    public void save(Profesor c) throws PersistenceException {
        ProfesorMapper.agregarProfesor(c.getId(),c.getNombre(),c.getApellido(),c.getTelefono(),c.getCorreo());
        
    }*/
