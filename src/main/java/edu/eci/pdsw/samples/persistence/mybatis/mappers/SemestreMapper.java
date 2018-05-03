/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Administrador;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.samples.entities.Semestre;
import java.util.Date;

/**
 *
 * @author jonnhi
 */
public interface SemestreMapper {

    /**
     *
     * @param years
     * @param periodoAcademico
     * @return
     */
    default Semestre consultarSemestre(Integer years, String periodoAcademico) {
        return consultarSemestreGeneral(years, periodoAcademico).get(0);
    }

    /**
     *
     * @return
     */
    default List<Semestre> consultarSemestres() {
        return consultarSemestreGeneral(null, null);
    }

    /**
     *
     * @param years
     * @param periodoAcademico
     * @return
     */
    public List<Semestre> consultarSemestreGeneral(@Param("yeSemestre") Integer years,
            @Param("paSemestre") String periodoAcademico);

    /**
     *
     * @param id
     * @param years
     * @param periodoAcademico
     * @param fechaInicio
     * @param fechaFin
     * @param adminCodigo
     */
    public void registrarSemestre(@Param("idSemestre") Integer id, 
            @Param("yeSemestre") Integer years, 
            @Param("paSemestre") String periodoAcademico, 
            @Param("fiSemestre") Date fechaInicio, 
            @Param("ffSemestre") Date fechaFin, 
            @Param("acSemestre") Integer adminCodigo);

}
