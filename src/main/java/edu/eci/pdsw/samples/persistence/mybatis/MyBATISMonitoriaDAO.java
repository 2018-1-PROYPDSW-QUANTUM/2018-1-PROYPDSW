/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Monitoria;
import edu.eci.pdsw.samples.persistence.MonitoriaDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.MonitoriaMapper;

/**
 *
 * @author jonnhi
 */
public class MyBATISMonitoriaDAO implements MonitoriaDAO {

    @Inject
    private MonitoriaMapper monitoria;

    @Override
    public void save(Monitoria m) throws PersistenceException {
        monitoria.registrarMonitoria(m.getId(), m.getFecha(), m.getHoraInicio(), m.getHoraFin(), m.getIp(), m.getObservaciones(), m.getMonitor().getCodigo());
    }

    @Override
    public Monitoria load(Integer id) throws PersistenceException {
        return monitoria.consultarMonitoria(id);
    }

    @Override
    public List<Monitoria> load() throws PersistenceException {
        return monitoria.consultarMonitorias();
    }

}
