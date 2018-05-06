/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
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
    public void save(Semestre s) throws PersistenceException {
        semestreMapper.registrarSemestre(s.getId(), s.getYears(), s.getPeriodoAcademico(), s.getFechaInicio(), s.getFechaFin(), s.getAdmin().getCodigo());
    }

    @Override
    public Semestre load(Integer years, String periodoAcademico) throws PersistenceException {
        return semestreMapper.consultarSemestre(years, periodoAcademico);
    }

    @Override
    public List<Semestre> loadAll() throws PersistenceException {
        return semestreMapper.consultarSemestres();
    }

}
