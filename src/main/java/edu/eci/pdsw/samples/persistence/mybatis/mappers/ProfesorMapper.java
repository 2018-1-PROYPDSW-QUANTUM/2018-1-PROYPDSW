/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.samples.entities.Profesor;

/**
 *
 * @author diego
 */
public interface ProfesorMapper {

    public Profesor consultarProfesor(@Param("idprof") Integer id);

    public List<Profesor> consultarProfesores();

    public void agregarProfesor(@Param("idpro") Integer id,
            @Param("nom") String nombre,
            @Param("apelli") String apellido,
            @Param("tel") String celular,
            @Param("email") String correo,
            @Param("clProfesor") String clave);

}
