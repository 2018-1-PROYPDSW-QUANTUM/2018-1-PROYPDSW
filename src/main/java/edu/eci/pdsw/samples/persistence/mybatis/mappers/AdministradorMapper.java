/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.samples.entities.Administrador;

/**
 *
 * @author jonnhi
 */
public interface AdministradorMapper {

    /**
     *
     * @param codigo
     * @return Administrador con el codigo ingresaod como parametro.
     */
    default Administrador consultarAdministrador(Integer codigo) {
        return consultarAdministradorGeneral(codigo).get(0);
    }

    /**
     *
     * @return Lista de todos los administradores registrados.
     */
    default List<Administrador> consultarAdministradores() {
        return consultarAdministradorGeneral(null);
    }

    /**
     *
     * @param codigo
     * @return Lista con el administrador del codigo indicado, en caso de no
     * especificar el codigo se retornara una lista con todos los
     * administradores registrados.
     */
    public List<Administrador> consultarAdministradorGeneral(@Param("coAdmin") Integer codigo);

    /**
     *
     * @param codigo
     * @param nombre
     * @param apellido
     * @param celular
     * @param correo
     * @param clave
     */
    public void registrarAdministrador(@Param("coAdmin") Integer codigo,
            @Param("noAdmin") String nombre,
            @Param("apAdmin") String apellido,
            @Param("ceAdmin") String celular,
            @Param("corAdmin") String correo,
            @Param("clAdmin") String clave);
}
