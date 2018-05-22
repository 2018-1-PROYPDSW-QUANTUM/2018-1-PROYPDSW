/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.samples.entities.Monitor;

/**
 *
 * @author jonnhi
 */
public interface MonitorMapper {
         
    /**
     *
     * @param codigo
     * @return
     */
    default Monitor consultarMonitor(Integer codigo) {
        return consultarMonitorGeneral(codigo).get(0);
    }

    /**
     *
     * @return
     */
    default List<Monitor> consultarMonitores() {
        return consultarMonitorGeneral(null);
    }

    /**
     *
     * @param codigo
     * @return
     */
    public List<Monitor> consultarMonitorGeneral(@Param("coMonitor") Integer codigo);
    
    /**
     *
     * @param codigo
     * @param semestreIngreso
     * @param programaAcademico
     * @param nombre
     * @param apellido
     * @param celular
     * @param correo
     * @param clave
     */
    public void registrarMonitor(@Param("coMonitor") Integer codigo, 
            @Param("siMonitor") String semestreIngreso, 
            @Param("paMonitor") String programaAcademico, 
            @Param("noMonitor") String nombre, 
            @Param("apMonitor") String apellido, 
            @Param("ceMonitor") String celular, 
            @Param("corMonitor") String correo, 
            @Param("clMonitor") String clave);

}
