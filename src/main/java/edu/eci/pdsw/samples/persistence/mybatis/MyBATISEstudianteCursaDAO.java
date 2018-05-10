/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.EstudianteCursa;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.persistence.EstudianteCursaDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.EstudianteCursaMapper;
import java.util.List;

/**
 *
 * @author jonnhi
 */
public class MyBATISEstudianteCursaDAO implements EstudianteCursaDAO {

    @Inject
    private EstudianteCursaMapper estudianteCursa;

    @Override
    public void save(EstudianteCursa ec) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteCursa> loadXEstudiante(Estudiante e) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteCursa> loadXGrupo(Grupo g) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteCursa> loadAll() throws PersistenceException {
        return estudianteCursa.consultarEstudiantesCursan();
    }


}
