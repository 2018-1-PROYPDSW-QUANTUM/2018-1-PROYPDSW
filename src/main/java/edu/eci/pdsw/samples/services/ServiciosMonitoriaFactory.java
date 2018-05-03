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

    private ServiciosMonitoriaFactory() {

        injector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                System.out.println("Initializing");
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config.xml");
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
                System.out.println("End Initializing");

            }
        }
        );

        testInjector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config-h2.xml");
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
        }
        );
    }

    public ServiciosMonitoria getServiciosMonitoria() {
        System.out.println("GET Servicios monitoria");
        return injector.getInstance(ServiciosMonitoria.class);
    }

    public ServiciosMonitoria getTestingServiciosMonitoria() {
        return testInjector.getInstance(ServiciosMonitoria.class);
    }

    public static ServiciosMonitoriaFactory getInstance() {
        System.out.println("GET Instance");
        return instance;
    }

    public static void main(String a[]) throws ExcepcionServiciosMonitoria {

        System.out.println(ServiciosMonitoriaFactory.getInstance().getServiciosMonitoria().consultarMonitorias());
    }
}
