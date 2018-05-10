/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import edu.eci.pdsw.samples.entities.EstudianteCursa;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author jonnhi
 */
public interface EstudianteCursaMapper {

    /**
     *
     * @param codigo
     * @param id
     * @return
     */
    default EstudianteCursa consultarEstudianteCursa(Integer codigo, Integer id) {
        return consultarEstudianteCursaGeneral(codigo, id).get(0);
    }

    /**
     *
     * @return
     */
    default List<EstudianteCursa> consultarEstudiantesCursan() {
        return consultarEstudianteCursaGeneral(null, null);
    }

    /**
     *
     * @param codigo
     * @param id
     * @return
     */
    public List<EstudianteCursa> consultarEstudianteCursaGeneral(@Param("ecEstudianteCursa") Integer codigo,
            @Param("giEstudianteCursa") Integer id);

    /**
     *
     * @param codigo
     * @param id
     */
    public void registrarEstudianteCursa(@Param("ecEstudianteCursa") Integer codigo,
            @Param("giEstudianteCursa") Integer id);
}
