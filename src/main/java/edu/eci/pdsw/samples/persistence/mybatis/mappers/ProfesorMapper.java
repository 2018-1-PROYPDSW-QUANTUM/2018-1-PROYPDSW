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

    /**
     *
     * @param codigo
     * @return
     */
    default Profesor consultarProfesor(Integer codigo) {
        return consultarProfesorGeneral(codigo).get(0);
    }

    /**
     *
     * @return
     */
    default List<Profesor> consultarProfesores() {
        return consultarProfesorGeneral(null);
    }

    /**
     *
     * @param codigo
     * @return
     */
    public List<Profesor> consultarProfesorGeneral(@Param("coProfesor") Integer codigo);

    /**
     *
     * @param codigo
     * @param nombre
     * @param apellido
     * @param celular
     * @param correo
     * @param clave
     */
    public void registrarProfesor(@Param("coProfesor") Integer codigo,
            @Param("noProfesor") String nombre,
            @Param("apProfesor") String apellido,
            @Param("ceProfesor") String celular,
            @Param("corProfesor") String correo,
            @Param("clProfesor") String clave);

}
