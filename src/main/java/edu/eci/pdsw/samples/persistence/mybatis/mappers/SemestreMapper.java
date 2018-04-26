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
     * @param year
     * @param periodoAcademico
     * @return
     */
    default Semestre consultarSemestre(Integer year, String periodoAcademico) {
        return consultarSemestreGeneral(year, periodoAcademico).get(0);
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
     * @param year
     * @param periodoAcademico
     * @return
     */
    public List<Semestre> consultarSemestreGeneral(@Param("yeSemestre") Integer year,
            @Param("paSemestre") String periodoAcademico);

    /**
     *
     * @param year
     * @param periodoAcademico
     * @param fechaInicio
     * @param fechaFin
     * @param admin
     */
    public void registrarSemestre(@Param("yeSemestre") Integer year, 
            @Param("paSemestre") String periodoAcademico, 
            @Param("fiSemestre") Date fechaInicio, 
            @Param("ffSemestre") Date fechaFin, 
            @Param("aSemestre") Administrador admin);

}
