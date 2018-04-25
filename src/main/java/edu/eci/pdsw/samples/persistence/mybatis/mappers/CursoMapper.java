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

/**
 *
 * @author diego
 */
public interface CursoMapper {
    
    public Curso ConsultarCurso(String neumonico);
    public void AgregarCurso(String neumonico,String nombre,int creditos);
    public List<Curso> ConsultarCursos();
    public List<Tema> ConsultarTemasCurso(String neumonico);
    public List<Grupo>ConsultarGruposCurso(String neumonico);
    
}
