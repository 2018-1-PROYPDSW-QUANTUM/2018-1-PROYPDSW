/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.persistence.SemestreDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.SemestreMapper;

/**
 *
 * @author jonnhi
 */
public class MyBATISSemestreDAO implements SemestreDAO {

    @Inject
    private SemestreMapper semestreMapper;

    @Override
    public void save(Semestre s, Administrador admin) throws PersistenceException {
        semestreMapper.registrarSemestre(s.getYear(), s.getPeriodoAcademico(), s.getFechaInicio(), s.getFechaFin(), admin);
    }

    @Override
    public Semestre load(Integer year, String periodoAcademico) throws PersistenceException {
        return semestreMapper.consultarSemestre(year, periodoAcademico);
    }

    @Override
    public List<Semestre> loadAll() throws PersistenceException {
        return semestreMapper.consultarSemestres();
    }

}
