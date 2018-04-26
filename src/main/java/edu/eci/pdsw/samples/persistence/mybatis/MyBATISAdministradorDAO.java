/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatis.mappers.AdministradorMapper;

/**
 *
 * @author jonnhi
 */
public class MyBATISAdministradorDAO implements AdministradorDAO {

    @Inject
    private AdministradorMapper adminMapper;

    @Override
    public void save(Administrador admin) throws PersistenceException {
        adminMapper.registrarAdministrador(admin.getCodigo(), admin.getNombre(), admin.getApellido(), admin.getCelular(), admin.getCorreo(), admin.getClave());
    }

    @Override
    public Administrador load(Integer codigo) throws PersistenceException {
        try {
            return adminMapper.consultarAdministrador(codigo);
        } catch (org.apache.ibatis.exceptions.PersistenceException e) {
            throw new PersistenceException("Error al consultar el cliente: "+codigo,e);
        } catch(java.lang.IndexOutOfBoundsException ex){
            throw new PersistenceException("Error al consultar el cliente: "+codigo,ex);
        }
    }

    @Override
    public List<Administrador> loadAll() {
        return adminMapper.consultarAdministradores();
    }

}
