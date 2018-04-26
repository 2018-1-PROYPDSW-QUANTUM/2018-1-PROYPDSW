/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Grupo;
import edu.eci.pdsw.samples.entities.Tema;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author diego
 */
public interface CursoMapper {
    
    public Curso ConsultarCurso(@Param("neumon")String neumonico);
    public void AgregarCurso(@Param("neumo") String neumonico,@Param("nomb")String nombre,@Param("credi")int creditos,@Param("prog")String Programa);
    public List<Curso> ConsultarCursos();
    public List<Tema> ConsultarTemasCurso(@Param("neum")String neumonico);
    public List<Grupo>ConsultarGruposCurso(@Param("neu")String neumonico);
    
}
