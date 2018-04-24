/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Curso;
import edu.eci.pdsw.samples.entities.Profesor;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author diego
 */
public interface profesorMapper {
    
    public Profesor consultarProfesor(@Param("idProf")long id);
    
    public void asignarCursoAProfesor(@Param("NombreCurso")String curso ,@Param("idprof") long profesor );
    
    public void  agregarProfesor(@Param("idpro") long id, @Param("nombre") String nombre,@Param("apellido") String apellido,@Param("telefono") String telefono, @Param("correo") String correo);
    
    public List<Curso> consultarCusosProfesor(@Param("idpr")long id);

    public List<Profesor> consultarProfesores();
    
}
