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

    public Curso consultarCurso(@Param("nemon") String nemonico);

    public List<Curso> consultarCursos();

    public void agregarCurso(@Param("nemo") String nemonico, 
            @Param("nomb") String nombre, 
            @Param("credi") int creditos, 
            @Param("hmCurso") int horasMonitoria);

}
