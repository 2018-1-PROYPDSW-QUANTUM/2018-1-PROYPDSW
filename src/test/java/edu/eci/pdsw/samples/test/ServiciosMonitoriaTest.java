/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.test;

import edu.eci.pdsw.samples.entities.Administrador;
import edu.eci.pdsw.samples.entities.Semestre;
import edu.eci.pdsw.samples.services.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.samples.services.ServiciosMonitoriasFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jonnhi
 */
public class ServiciosMonitoriaTest {

    public ServiciosMonitoriaTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void clearDB() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "anonymous", "anonymous");
        Statement stmt = conn.createStatement();
        stmt.execute("delete from Semestre");
        stmt.execute("delete from Administrador");
        conn.commit();
        conn.close();
    }

    /**
     * Obtiene una conexion a la base de datos de prueba
     *
     * @return
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "anonymous", "anonymous");
    }

    @Test
    public void pruebaConsultarAdministradorPorCodigo() throws SQLException, ExcepcionServiciosMonitoria {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();

        stmt.execute("INSERT INTO Administrador (Codigo, nombre, apellido, celular, correo, clave) VALUES (201805052,'Alexander','Urquijo','3013330384','alexander.urquijo@mail.escuelaing.edu.co','clave02')");

        conn.commit();
        conn.close();

        try {
            Administrador admin = ServiciosMonitoriasFactory.getInstance().getTestingMonitoriasServices().consultarAdministrador(201805052);
            Assert.assertTrue(201805052 == admin.getCodigo());
        } catch (ExcepcionServiciosMonitoria e) {
            Assert.fail("No se pudo consultar el administrador con codigo: 201805052" + e.getLocalizedMessage());
        }
    }
    
    @Test
    public void pruebaConsultarSemestrePorYearPeriodo() throws SQLException, ExcepcionServiciosMonitoria {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();

        stmt.execute("INSERT INTO Administrador (Codigo, nombre, apellido, celular, correo, clave) VALUES (20180505,'Jonathan','Prieto','3184448017','jonathan.prieto@mail.escuelaing.edu.co','clave01')");
        stmt.execute("INSERT INTO Semestre (Identificador, years, periodo_academico, fecha_inicio, fecha_fin, administrador_codigo) VALUES (1,2018,'1','2018-01-15','2018-05-21',20180505)");

        conn.commit();
        conn.close();

        try {
            Semestre sem = ServiciosMonitoriasFactory.getInstance().getTestingMonitoriasServices().consultarSemestre(2018,"1");
            Assert.assertTrue(sem.getId() == 1);
        } catch (ExcepcionServiciosMonitoria e) {
            Assert.fail("No se pudo consultar el semestre 2018-1" + e.getLocalizedMessage());
        }
    }
}
