/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Franja;
import edu.eci.pdsw.samples.persistence.FranjaDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.FranjaMapper;

/**
 *
 * @author jonnhi
 */
public class MyBATISFranjaDAO implements FranjaDAO {

    @Inject
    private FranjaMapper franjaMapper;

    @Override
    public void save(Franja f) throws PersistenceException {
        franjaMapper.registrarFranja(f.getId(), f.getDia(), f.getHoraInicio(), f.getHoraFin(),f.getGrupo().getId());
    }

    @Override
    public Franja load(Integer id) throws PersistenceException {
        return franjaMapper.consultarFranja(id);
    }

    @Override
    public List<Franja> loadAll() throws PersistenceException {
        return franjaMapper.ConsultarFranjas();
    }

}
