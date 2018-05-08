-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-04-26 19:21:49.621

-- tables
-- Table: Administrador
CREATE TABLE Administrador (
    Codigo int  NOT NULL,
    nombre varchar(30)  NOT NULL,
    apellido varchar(30)  NOT NULL,
    celular varchar(10)  NOT NULL,
    correo varchar(50)  NOT NULL,
    clave varchar(16)  NOT NULL,
    CONSTRAINT Administrador_pk PRIMARY KEY (Codigo)
    
);

-- Table: Asistente
CREATE TABLE Asistente (
    Monitoria_identificador bigint  NOT NULL,
    Estudiante_codigo int  NOT NULL,
    Tema_identificador int  NOT NULL,
    CONSTRAINT Asistente_pk PRIMARY KEY (Monitoria_identificador,Estudiante_codigo,Tema_identificador)
);

-- Table: Curso
CREATE TABLE Curso (
    Nemonico char(4)  NOT NULL,
    nombre varchar(30)  NOT NULL,
    creditos int  NOT NULL,
    horas_monitoria int  NOT NULL,
    CONSTRAINT Curso PRIMARY KEY (Nemonico)
);

-- Table: Estudiante
CREATE TABLE Estudiante (
    Codigo int  NOT NULL,
    CONSTRAINT Estudiante_pk PRIMARY KEY (Codigo)
);

-- Table: Estudiante_cursa
CREATE TABLE Estudiante_cursa (
    Estudiante_codigo int  NOT NULL,
    Grupo_identificador int  NOT NULL,
    CONSTRAINT Estudiante_cursa_pk PRIMARY KEY (Estudiante_codigo,Grupo_identificador)
);

-- Table: Franja
CREATE TABLE Franja (
    Identificador int  NOT NULL,
    dia varchar(10)  NOT NULL,
    hora_inicio time  NOT NULL,
    hora_fin time  NOT NULL,
    grupo_identificador int  NOT NULL,
    CONSTRAINT Franja_pk PRIMARY KEY (Identificador)
);

-- Table: Grupo
CREATE TABLE Grupo (
    Identificador int  NOT NULL,
    semestre_identificador int  NOT NULL,
    curso_nemonico char(4)  NOT NULL,
    numero int  NOT NULL,
    profesor_codigo int  NOT NULL,
    monitor_codigo int  NOT NULL,
    CONSTRAINT Grupo_pk PRIMARY KEY (Identificador)
);

-- Table: Monitor
CREATE TABLE Monitor (
    Codigo int  NOT NULL,
    semestre_ingreso varchar(6)  NOT NULL,
    programa_academico varchar(50)  NOT NULL,
    nombre varchar(30)  NOT NULL,
    apellido varchar(30)  NOT NULL,
    celular varchar(10)  NOT NULL,
    correo varchar(50)  NOT NULL,
    clave varchar(16)  NOT NULL,
    CONSTRAINT Monitor_pk PRIMARY KEY (Codigo)
);

-- Table: Monitoria
CREATE TABLE Monitoria (
    Identificador bigint  NOT NULL,
    fecha date  NOT NULL,
    hora_inicio timestamp  NOT NULL,
    hora_fin timestamp  NOT NULL,
    ip varchar(15)  NOT NULL,
    observaciones varchar(300)  NOT NULL,
    monitor_codigo int  NOT NULL,
    CONSTRAINT Monitoria_pk PRIMARY KEY (Identificador)
);

-- Table: Profesor
CREATE TABLE Profesor (
    Codigo int  NOT NULL,
    nombre varchar(30)  NOT NULL,
    apellido varchar(30)  NOT NULL,
    celular varchar(10)  NOT NULL,
    correo varchar(50)  NOT NULL,
    clave varchar(16)  NOT NULL,
    CONSTRAINT Profesor_pk PRIMARY KEY (Codigo)
);

-- Table: Semestre
CREATE TABLE Semestre (
    Identificador int  NOT NULL,
    years int  NOT NULL,
    periodo_academico char(1)  NOT NULL,
    fecha_inicio date  NOT NULL,
    fecha_fin date  NOT NULL,
    administrador_codigo int  NOT NULL,
    CONSTRAINT Semestre_pk PRIMARY KEY (Identificador)
);

-- Table: Tema
CREATE TABLE Tema (
    Identificador int  NOT NULL,
    curso_nemonico char(4)  NOT NULL,
    nombre varchar(30)  NOT NULL,
    descripcion varchar(90),
    CONSTRAINT Tema_pk PRIMARY KEY (Identificador)
);

-- Unique keys
-- Table Administrador
ALTER TABLE Administrador ADD CONSTRAINT UK_Administrador_correo UNIQUE (correo);
ALTER TABLE Administrador ADD CONSTRAINT UK_Administrador_celular UNIQUE (celular);

-- Table Franja
ALTER TABLE Franja ADD CONSTRAINT UK_Franja_dia_horai_horaf UNIQUE (dia, hora_inicio, hora_fin);

-- Table Grupo
ALTER TABLE Grupo ADD CONSTRAINT UK_Grupo_semestre_curso_numero UNIQUE (semestre_identificador, curso_nemonico, numero);

-- Table Monitor
ALTER TABLE Monitor ADD CONSTRAINT UK_Monitor_celular UNIQUE (celular);
ALTER TABLE Monitor ADD CONSTRAINT UK_Monitor_correo UNIQUE (correo);

-- Table Profesor
ALTER TABLE Profesor ADD CONSTRAINT UK_Profesor_correo UNIQUE (correo);
ALTER TABLE Profesor ADD CONSTRAINT UK_Profesor_celular UNIQUE (celular);

-- Table Semestre
ALTER TABLE Semestre ADD CONSTRAINT UK_Semestre_years_periodo UNIQUE (years, periodo_academico);

--Table Tema
ALTER TABLE Tema ADD CONSTRAINT UK_Tema_curso_nombre UNIQUE (nombre, curso_nemonico);

-- foreign keys
-- Reference: Asistente_Tema (table: Asistente)
ALTER TABLE Asistente ADD CONSTRAINT Asistente_Tema
    FOREIGN KEY (Tema_identificador)
    REFERENCES Tema (Identificador)
;

-- Reference: Asistentes_Estudiante (table: Asistente)
ALTER TABLE Asistente ADD CONSTRAINT Asistentes_Estudiante
    FOREIGN KEY (Estudiante_codigo)
    REFERENCES Estudiante (Codigo)
;

-- Reference: Asistentes_Monitoria (table: Asistente)
ALTER TABLE Asistente ADD CONSTRAINT Asistentes_Monitoria
    FOREIGN KEY (Monitoria_identificador)
    REFERENCES Monitoria (Identificador)
;

-- Reference: Estudiante_cursa_Grupo (table: Estudiante_cursa)
ALTER TABLE Estudiante_cursa ADD CONSTRAINT Estudiante_cursa_Grupo
    FOREIGN KEY (Grupo_identificador)
    REFERENCES Grupo (Identificador)
;

-- Reference: Estudiantes_Estudiante (table: Estudiante_cursa)
ALTER TABLE Estudiante_cursa ADD CONSTRAINT Estudiantes_Estudiante
    FOREIGN KEY (Estudiante_codigo)
    REFERENCES Estudiante (Codigo)
;

-- Reference: Franja_Grupo (table: Franja)
ALTER TABLE Franja ADD CONSTRAINT Franja_Grupo
    FOREIGN KEY (grupo_identificador)
    REFERENCES Grupo (Identificador)
;

-- Reference: Grupo_Curso (table: Grupo)
ALTER TABLE Grupo ADD CONSTRAINT Grupo_Curso
    FOREIGN KEY (curso_nemonico)
    REFERENCES Curso (Nemonico)
;

-- Reference: Grupo_Monitor (table: Grupo)
ALTER TABLE Grupo ADD CONSTRAINT Grupo_Monitor
    FOREIGN KEY (monitor_codigo)
    REFERENCES Monitor (Codigo)
;

-- Reference: Grupo_Profesor (table: Grupo)
ALTER TABLE Grupo ADD CONSTRAINT Grupo_Profesor
    FOREIGN KEY (profesor_codigo)
    REFERENCES Profesor (Codigo)
;

-- Reference: Grupo_Semestre (table: Grupo)
ALTER TABLE Grupo ADD CONSTRAINT Grupo_Semestre
    FOREIGN KEY (semestre_identificador)
    REFERENCES Semestre (Identificador)
;

-- Reference: Monitoria_Monitor (table: Monitoria)
ALTER TABLE Monitoria ADD CONSTRAINT Monitoria_Monitor
    FOREIGN KEY (monitor_codigo)
    REFERENCES Monitor (Codigo)
;

-- Reference: Semestre_Administrador (table: Semestre)
ALTER TABLE Semestre ADD CONSTRAINT Semestre_Administrador
    FOREIGN KEY (administrador_codigo)
    REFERENCES Administrador (Codigo)
;

-- Reference: Tema_Curso (table: Tema)
ALTER TABLE Tema ADD CONSTRAINT Tema_Curso
    FOREIGN KEY (curso_nemonico)
    REFERENCES Curso (Nemonico)
;

-- End create


-- -- DROP
-- 
-- -- foreign keys
-- ALTER TABLE Asistente
--     DROP CONSTRAINT Asistente_Tema;
-- 
-- ALTER TABLE Asistente
--     DROP CONSTRAINT Asistentes_Estudiante;
-- 
-- ALTER TABLE Asistente
--     DROP CONSTRAINT Asistentes_Monitoria;
-- 
-- ALTER TABLE Estudiante_cursa
--     DROP CONSTRAINT Estudiante_cursa_Grupo;
-- 
-- ALTER TABLE Estudiante_cursa
--     DROP CONSTRAINT Estudiantes_Estudiante;
-- 
-- ALTER TABLE Franja
--     DROP CONSTRAINT Franja_Grupo;
-- 
-- ALTER TABLE Grupo
--     DROP CONSTRAINT Grupo_Curso;
-- 
-- ALTER TABLE Grupo
--     DROP CONSTRAINT Grupo_Monitor;
-- 
-- ALTER TABLE Grupo
--     DROP CONSTRAINT Grupo_Profesor;
-- 
-- ALTER TABLE Grupo
--     DROP CONSTRAINT Grupo_Semestre;
-- 
-- ALTER TABLE Monitoria
--     DROP CONSTRAINT Monitoria_Monitor;
-- 
-- ALTER TABLE Semestre
--     DROP CONSTRAINT Semestre_Administrador;
-- 
-- ALTER TABLE Tema
--     DROP CONSTRAINT Tema_Curso;
-- 
-- -- tables
-- DROP TABLE Administrador;
-- 
-- DROP TABLE Asistente;
-- 
-- DROP TABLE Curso;
-- 
-- DROP TABLE Estudiante;
-- 
-- DROP TABLE Estudiante_cursa;
-- 
-- DROP TABLE Franja;
-- 
-- DROP TABLE Grupo;
-- 
-- DROP TABLE Monitor;
-- 
-- DROP TABLE Monitoria;
-- 
-- DROP TABLE Profesor;
-- 
-- DROP TABLE Semestre;
-- 
-- DROP TABLE Tema;
-- 
-- -- End drop.


-- End of file.

