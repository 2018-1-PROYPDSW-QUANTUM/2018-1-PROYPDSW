/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISAdministradorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISGrupoDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISProfesorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISTemaDAO;
import edu.eci.pdsw.samples.services.impl.ServicioMonitoriaImpl;
import org.mybatis.guice.XMLMyBatisModule;


/**
 *
 * @author hcadavid
 */
public class ServiciosMonitoriaFactory {

    private static ServiciosMonitoriaFactory instance = new ServiciosMonitoriaFactory();

    private static Injector injector;

    private static Injector testInjector;

    private Injector myBatisInjector(String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                //setClassPathResource(pathResource.class);
                bind(ServiciosMonitoria.class).to(ServicioMonitoriaImpl.class);
                bind(AdministradorDAO.class).to(MyBATISAdministradorDAO.class);
                //bind(CursoDAO.class).to(MyBATISAdministradorDAO.class);
                bind(GrupoDAO.class).to(MyBATISGrupoDAO.class);
                bind(ProfesorDAO.class).to(MyBATISProfesorDAO.class);
                bind(TemaDAO.class).to(MyBATISTemaDAO.class);
            }
        });
    }

    private ServiciosMonitoriaFactory(){

        injector = myBatisInjector("mybatis-config.xml");
        testInjector = myBatisInjector("mybatis-config-h2.xml");
    }

    public ServiciosMonitoria getServiciosMonitoria(){
        return injector.getInstance(ServiciosMonitoria.class);
    }


    public ServiciosMonitoria getServiciosMonitoriaTesting(){
        return testInjector.getInstance(ServiciosMonitoria.class);
    }

    public static ServiciosMonitoriaFactory getInstance(){
        return instance;
    }

}
