/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Franja;
import java.time.LocalTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author jonnhi
 */
public interface FranjaMapper {

    /**
     *
     * @param id
     * @return Franja con identificador id
     */
    default Franja consultarFranja(Integer id) {
        return consultarFranjaGeneral(id).get(0);
    }

    /**
     *
     * @return Franjas registradas
     */
    default List<Franja> ConsultarFranjas() {
        return consultarFranjaGeneral(null);
    }

    /**
     *
     * @param identificardor
     * @return Franjas registradas
     */
    public List<Franja> consultarFranjaGeneral(@Param("idFranja") Integer identificardor);

    /**
     *
     * @param id
     * @param dia
     * @param horaInicio
     * @param horaFinal
     * @param grupoId
     */
    public void registrarFranja(@Param("idFranja") Integer id,
            @Param("diFranja") String dia,
            @Param("hiFranja") LocalTime horaInicio,
            @Param("hfFranja") LocalTime horaFinal);
}
