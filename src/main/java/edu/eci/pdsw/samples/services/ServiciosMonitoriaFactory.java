/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import static com.google.inject.Guice.createInjector;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import edu.eci.pdsw.samples.services.impl.ServiciosMonitoriaImpl;

import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.FranjaDAO;
import edu.eci.pdsw.samples.persistence.MonitorDAO;
import edu.eci.pdsw.samples.persistence.SemestreDAO;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.MonitoriaDAO;
import edu.eci.pdsw.samples.persistence.AsistenteDAO;
import edu.eci.pdsw.samples.persistence.EstudianteDAO;
import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISTemaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISGrupoDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISCursoDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISFranjaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISMonitorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISSemestreDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISProfesorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISAsistenteDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISMonitoriaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISEstudianteDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISAdministradorDAO;

/**
 *
 * @author jonnhi
 */
public class ServiciosMonitoriaFactory {

    private static ServiciosMonitoriaFactory instance = new ServiciosMonitoriaFactory();

    private static Injector injector;

    private static Injector testInjector;

    private Injector myBatisInjector(String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setClassPathResource(pathResource);
                bind(ServiciosMonitoria.class).to(ServiciosMonitoriaImpl.class);
                bind(AdministradorDAO.class).to(MyBATISAdministradorDAO.class);
                bind(AsistenteDAO.class).to(MyBATISAsistenteDAO.class);
                bind(CursoDAO.class).to(MyBATISCursoDAO.class);
                bind(EstudianteDAO.class).to(MyBATISEstudianteDAO.class);
//                bind(FranjaDAO.class).to(MyBATISFranjaDAO.class);
                bind(GrupoDAO.class).to(MyBATISGrupoDAO.class);
                bind(MonitorDAO.class).to(MyBATISMonitorDAO.class);
                bind(MonitoriaDAO.class).to(MyBATISMonitoriaDAO.class);
                bind(ProfesorDAO.class).to(MyBATISProfesorDAO.class);
                bind(SemestreDAO.class).to(MyBATISSemestreDAO.class);
                bind(TemaDAO.class).to(MyBATISTemaDAO.class);
            }
        });
    }

    private ServiciosMonitoriaFactory() {
        injector = myBatisInjector("mybatis-config.xml");
        testInjector = myBatisInjector("mybatis-config-h2.xml");
    }

    public ServiciosMonitoria getServiciosMonitoria() {
        return injector.getInstance(ServiciosMonitoria.class);
    }

    public ServiciosMonitoria getServiciosMonitoriaTesting() {
        return testInjector.getInstance(ServiciosMonitoria.class);
    }

    public static ServiciosMonitoriaFactory getInstance() {
        return instance;
    }

}
