/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Monitor;
import edu.eci.pdsw.samples.persistence.MonitorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.MonitorMapper;

/**
 *
 * @author jonnhi
 */
public class MyBATISMonitorDAO implements MonitorDAO {

    @Inject
    private MonitorMapper monitorMapper;

    @Override
    public void save(Monitor m) throws PersistenceException {
        monitorMapper.registrarMonitor(m.getCodigo(), m.getSemestreIngreso(), m.getProgramaAcademico(), m.getNombre(), m.getApellido(), m.getCelular(), m.getCorreo(), m.getClave());
    }

    @Override
    public Monitor load(Integer c) throws PersistenceException {
        return monitorMapper.consultarMonitor(c);
    }

    @Override
    public List<Monitor> loadAll() throws PersistenceException {
        return monitorMapper.consultarMonitores();
    }

}
