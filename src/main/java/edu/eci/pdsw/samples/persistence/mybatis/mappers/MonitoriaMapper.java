/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import java.util.Date;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Monitoria;

/**
 *
 * @author jonnhi
 */
public interface MonitoriaMapper {
    
    /**
     *
     * @param id
     * @return 
     */
    default Monitoria consultarMonitoria(Integer id){
        return consultarMonitoriaGeneral(id).get(0);
    }
    
    /**
     *
     * @return
     */
    default List<Monitoria> consultarMonitorias(){
        return consultarMonitoriaGeneral(null);
    }
    
    /**
     *
     * @param id
     * @return
     */
    public List<Monitoria> consultarMonitoriaGeneral(@Param("idMonitoria") Integer id);
    
    /**
     *
     * @param id
     * @param fecha
     * @param horaInicio
     * @param horaFin
     * @param ip
     * @param observaciones
     * @param grupo
     */
    public void registrarMonitoria(@Param("idMonitoria") Integer id, 
            @Param("feMonitoria") Date fecha, 
            @Param("hiMonitoria") Date horaInicio, 
            @Param("hfMonitoria") Date horaFin, 
            @Param("ipMonitoria") String ip, 
            @Param("obMonitoria") String observaciones, 
            @Param("grMonitoria") Grupo grupo);
}
