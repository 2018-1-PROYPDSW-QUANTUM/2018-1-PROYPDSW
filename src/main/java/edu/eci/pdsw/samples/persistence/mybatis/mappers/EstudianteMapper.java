/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Estudiante;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author jonnhi
 */
public interface EstudianteMapper {

    /**
     *
     * @param codigo
     * @return
     */
    default Estudiante consultarEstudiante(Integer codigo) {
        return consultarEstudianteGeneral(codigo).get(0);
    }

    /**
     *
     * @param codigo
     * @return
     */
    default List<Estudiante> consultarEstudiantes() {
        return consultarEstudianteGeneral(null);
    }

    /**
     *
     * @param codigo
     * @return
     */
    public List<Estudiante> consultarEstudianteGeneral(@Param("coEstudiante") Integer codigo);

    /**
     *
     * @param codigo
     */
    public void registrarEstudiante(@Param("coEstudiante") Integer codigo);
}
