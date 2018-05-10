/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import edu.eci.pdsw.samples.entities.Curso;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author diego
 */
public interface CursoMapper {

    /**
     *
     * @param nemonico
     * @return
     */
    default Curso consultarCurso(String nemonico) {
        return consultarCursoGeneral(nemonico).get(0);
    }

    /**
     *
     * @return
     */
    default List<Curso> consultarCursos() {
        return consultarCursoGeneral(null);
    }

    /**
     *
     * @param nemonico
     * @return
     */
    public List<Curso> consultarCursoGeneral(@Param("neCurso") String nemonico);

    /**
     *
     * @param nemonico
     * @param nombre
     * @param creditos
     * @param horasMonitoria
     */
    public void registrarCurso(@Param("neCurso") String nemonico,
            @Param("noCurso") String nombre,
            @Param("crCurso") int creditos,
            @Param("hmCurso") double horasMonitoria);

}
