/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.pdsw.samples.persistence.AdministradorDAO;
import edu.eci.pdsw.samples.persistence.AsistenteDAO;
import edu.eci.pdsw.samples.persistence.CursoDAO;
import edu.eci.pdsw.samples.persistence.EstudianteCursaDAO;
import edu.eci.pdsw.samples.persistence.EstudianteDAO;
import edu.eci.pdsw.samples.persistence.FranjaDAO;
import edu.eci.pdsw.samples.persistence.GrupoDAO;
import edu.eci.pdsw.samples.persistence.MonitorDAO;
import edu.eci.pdsw.samples.persistence.MonitoriaDAO;
import edu.eci.pdsw.samples.persistence.ProfesorDAO;
import edu.eci.pdsw.samples.persistence.SemestreDAO;
import edu.eci.pdsw.samples.persistence.TemaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISAdministradorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISAsistenteDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISCursoDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISEstudianteCursaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISEstudianteDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISFranjaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISGrupoDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISMonitorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISMonitoriaDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISProfesorDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISSemestreDAO;
import edu.eci.pdsw.samples.persistence.mybatis.MyBATISTemaDAO;
import edu.eci.pdsw.samples.services.impl.ServiciosMonitoriaImpl;

/**
 *
 * @author jonnhi
 */
public class ServiciosMonitoriasFactory {

    private static ServiciosMonitoriasFactory instance = new ServiciosMonitoriasFactory();

    private static Injector injector;
    private static Injector testingInjector;

    private ServiciosMonitoriasFactory() {
        injector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                System.out.println("Initializing REAL");
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config.xml");
                bind(ServiciosMonitoria.class).to(ServiciosMonitoriaImpl.class);
                bind(AdministradorDAO.class).to(MyBATISAdministradorDAO.class);
                bind(AsistenteDAO.class).to(MyBATISAsistenteDAO.class);
                bind(CursoDAO.class).to(MyBATISCursoDAO.class);
                bind(EstudianteCursaDAO.class).to(MyBATISEstudianteCursaDAO.class);
                bind(EstudianteDAO.class).to(MyBATISEstudianteDAO.class);
                bind(FranjaDAO.class).to(MyBATISFranjaDAO.class);
                bind(GrupoDAO.class).to(MyBATISGrupoDAO.class);
                bind(MonitorDAO.class).to(MyBATISMonitorDAO.class);
                bind(MonitoriaDAO.class).to(MyBATISMonitoriaDAO.class);
                bind(ProfesorDAO.class).to(MyBATISProfesorDAO.class);
                bind(SemestreDAO.class).to(MyBATISSemestreDAO.class);
                bind(TemaDAO.class).to(MyBATISTemaDAO.class);
            }

        }
        );

        testingInjector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                System.out.println("Initializing TESTING");
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config-h2.xml");
                bind(ServiciosMonitoria.class).to(ServiciosMonitoriaImpl.class);
                bind(AdministradorDAO.class).to(MyBATISAdministradorDAO.class);
                bind(AsistenteDAO.class).to(MyBATISAsistenteDAO.class);
                bind(CursoDAO.class).to(MyBATISCursoDAO.class);
                bind(EstudianteCursaDAO.class).to(MyBATISEstudianteCursaDAO.class);
                bind(EstudianteDAO.class).to(MyBATISEstudianteDAO.class);
                bind(FranjaDAO.class).to(MyBATISFranjaDAO.class);
                bind(GrupoDAO.class).to(MyBATISGrupoDAO.class);
                bind(MonitorDAO.class).to(MyBATISMonitorDAO.class);
                bind(MonitoriaDAO.class).to(MyBATISMonitoriaDAO.class);
                bind(ProfesorDAO.class).to(MyBATISProfesorDAO.class);
                bind(SemestreDAO.class).to(MyBATISSemestreDAO.class);
                bind(TemaDAO.class).to(MyBATISTemaDAO.class);
            }

        }
        );

    }

    public ServiciosMonitoria getMonitoriasServices() {
        return injector.getInstance(ServiciosMonitoria.class);
    }

    public ServiciosMonitoria getTestingMonitoriasServices() {
        return testingInjector.getInstance(ServiciosMonitoria.class);
    }

    public static ServiciosMonitoriasFactory getInstance() {
        return instance;
    }

}
