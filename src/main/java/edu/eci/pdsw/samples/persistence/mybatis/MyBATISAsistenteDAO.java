/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Asistente;
import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Estudiante;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.entities.Tema;
import edu.eci.pdsw.samples.persistence.AsistenteDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.AsistenteMapper;
import java.util.List;

/**
 *
 * @author jonnhi
 */
public class MyBATISAsistenteDAO implements AsistenteDAO {

    @Inject
    private AsistenteMapper asistente;

    @Override
    public void save(Integer m, Integer de, Integer t) throws PersistenceException {
        asistente.registrarAsistente(m, de, t);
    }

    @Override
    public Asistente loadMonitoriaAsistente(Integer id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asistente loadEstudianteAsistente(Integer c) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asistente> loadMonitoriaXGrupo(Grupo grupo) throws PersistenceException {
        return asistente.consultarAsistentesXGrupo(grupo.getId());
    }

    @Override
    public List<Asistente> loadAsistenteXCurso(Curso c) throws PersistenceException {
        return asistente.consultarAsistentesXCurso(c.getNemonico());
    }

    @Override
    public List<Asistente> loadAll() throws PersistenceException {
        return asistente.consultarAsistentes();
    }

}
