-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-04-26 08:53:30.831

-- tables
-- Table: Administrador
-- CREATE TABLE Administrador (
--     Codigo int  NOT NULL,
--     nombre varchar(30)  NOT NULL,
--     apellido varchar(30)  NOT NULL,
--     celular varchar(10)  NOT NULL,
--     correo varchar(50)  NOT NULL,
--     clave varchar(16)  NOT NULL,
--     CONSTRAINT UK_Administrador_correo UNIQUE (correo) NOT DEFERRABLE  INITIALLY IMMEDIATE,
--     CONSTRAINT UK_Administrador_celular UNIQUE (celular) NOT DEFERRABLE  INITIALLY IMMEDIATE,
--     CONSTRAINT Administrador_pk PRIMARY KEY (Codigo)
-- );
-- 
-- -- Table: Asistente
-- CREATE TABLE Asistente (
--     Monitoria_identificador bigint  NOT NULL,
--     Estudiante_codigo int  NOT NULL,
--     temas varchar(30)  NOT NULL,
--     CONSTRAINT Asistente_pk PRIMARY KEY (Monitoria_identificador,Estudiante_codigo,temas)
-- );
-- 
-- -- Table: Curso
-- CREATE TABLE Curso (
--     Nemonico char(4)  NOT NULL,
--     nombre varchar(30)  NOT NULL,
--     creditos int  NOT NULL,
--     horas_monitoria date  NOT NULL,
--     CONSTRAINT Curso PRIMARY KEY (Nemonico)
-- );
-- 
-- -- Table: Estudiante
-- CREATE TABLE Estudiante (
--     Codigo int  NOT NULL,
--     CONSTRAINT Estudiante_pk PRIMARY KEY (Codigo)
-- );
-- 
-- -- Table: Estudiante_cursa
-- CREATE TABLE Estudiante_cursa (
--     Estudiante_Codigo int  NOT NULL,
--     Grupo_Semestre_Years int  NOT NULL,
--     Grupo_Semestre_Periodo_academico char(1)  NOT NULL,
--     Grupo_Curso_Nemonico char(4)  NOT NULL,
--     Grupo_Numero int  NOT NULL,
--     CONSTRAINT Estudiante_cursa_pk PRIMARY KEY (Estudiante_Codigo,Grupo_Semestre_Years,Grupo_Semestre_Periodo_academico,Grupo_Curso_Nemonico,Grupo_Numero)
-- );
-- 
-- -- Table: Franja
-- CREATE TABLE Franja (
--     Dia varchar(10)  NOT NULL,
--     Hora_inicio time  NOT NULL,
--     hora_fin time  NOT NULL,
--     Grupo_Semestre_Years int  NOT NULL,
--     Grupo_Semestre_Periodo_academico char(1)  NOT NULL,
--     Grupo_Curso_Nemonico char(4)  NOT NULL,
--     Grupo_Numero int  NOT NULL,
--     CONSTRAINT Franja_pk PRIMARY KEY (Dia,Hora_inicio)
-- );
-- 
-- -- Table: Grupo
-- CREATE TABLE Grupo (
--     Semestre_Years int  NOT NULL,
--     Semestre_Periodo_academico char(1)  NOT NULL,
--     Curso_Nemonico char(4)  NOT NULL,
--     Numero int  NOT NULL,
--     profesor_Codigo int  NOT NULL,
--     monitor_Codigo int  NOT NULL,
--     CONSTRAINT Grupo_pk PRIMARY KEY (Semestre_Years,Semestre_Periodo_academico,Curso_Nemonico,Numero)
-- );
-- 
-- -- Table: Monitor
-- CREATE TABLE Monitor (
--     Codigo int  NOT NULL,
--     semestre_Ingreso varchar(6)  NOT NULL,
--     programa_academico varchar(50)  NOT NULL,
--     nombre varchar(30)  NOT NULL,
--     apellido varchar(30)  NOT NULL,
--     celular varchar(10)  NOT NULL,
--     correo varchar(50)  NOT NULL,
--     clave varchar(16)  NOT NULL,
--     CONSTRAINT UK_Monitor_celular UNIQUE (celular) NOT DEFERRABLE  INITIALLY IMMEDIATE,
--     CONSTRAINT UK_Monitor_correo UNIQUE (correo) NOT DEFERRABLE  INITIALLY IMMEDIATE,
--     CONSTRAINT Monitor_pk PRIMARY KEY (Codigo)
-- );
-- 
-- -- Table: Monitoria
-- CREATE TABLE Monitoria (
--     Identificador bigint  NOT NULL,
--     fecha date  NOT NULL,
--     hora_inicio timestamp  NOT NULL,
--     hora_fin timestamp  NOT NULL,
--     ip varchar(15)  NOT NULL,
--     observaciones varchar(300)  NOT NULL,
--     Grupo_Semestre_Years int  NOT NULL,
--     Grupo_Semestre_Periodo_academico char(1)  NOT NULL,
--     Grupo_Curso_Nemonico char(4)  NOT NULL,
--     Grupo_Numero int  NOT NULL,
--     CONSTRAINT Monitoria_pk PRIMARY KEY (Identificador)
-- );
-- 
-- -- Table: Profesor
-- CREATE TABLE Profesor (
--     Codigo int  NOT NULL,
--     nombre varchar(30)  NOT NULL,
--     apellido varchar(30)  NOT NULL,
--     celular varchar(10)  NOT NULL,
--     correo varchar(50)  NOT NULL,
--     clave varchar(16)  NOT NULL,
--     CONSTRAINT UK_Profesor_correo UNIQUE (correo) NOT DEFERRABLE  INITIALLY IMMEDIATE,
--     CONSTRAINT UK_Profesor_celular UNIQUE (celular) NOT DEFERRABLE  INITIALLY IMMEDIATE,
--     CONSTRAINT Profesor_pk PRIMARY KEY (Codigo)
-- );
-- 
-- -- Table: Semestre
-- CREATE TABLE Semestre (
--     Years int  NOT NULL,
--     Periodo_academico char(1)  NOT NULL,
--     fecha_inicio date  NOT NULL,
--     fecha_fin date  NOT NULL,
--     administrador_codigo int  NOT NULL,
--     CONSTRAINT Semestre_pk PRIMARY KEY (Years,Periodo_academico)
-- );
-- 
-- -- Table: Tema
-- CREATE TABLE Tema (
--     Curso_Nemonico char(4)  NOT NULL,
--     Nombre varchar(30)  NOT NULL,
--     descripcion varchar(90)  NULL,
--     CONSTRAINT Tema_pk PRIMARY KEY (Curso_Nemonico,Nombre)
-- );

-- -- foreign keys
-- -- Reference: Asistentes_Estudiante (table: Asistente)
-- ALTER TABLE Asistente ADD CONSTRAINT Asistentes_Estudiante
--     FOREIGN KEY (Estudiante_codigo)
--     REFERENCES Estudiante (Codigo)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;

-- -- Reference: Asistentes_Monitoria (table: Asistente)
-- ALTER TABLE Asistente ADD CONSTRAINT Asistentes_Monitoria
--     FOREIGN KEY (Monitoria_identificador)
--     REFERENCES Monitoria (Identificador)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;

-- Reference: Estudiante_cursa_Grupo (table: Estudiante_cursa)
ALTER TABLE Estudiante_cursa ADD CONSTRAINT Estudiante_cursa_Grupo
    FOREIGN KEY (Grupo_Semestre_Years, Grupo_Semestre_Periodo_academico, Grupo_Curso_Nemonico, Grupo_Numero)
    REFERENCES Grupo (Semestre_Years, Semestre_Periodo_academico, Curso_Nemonico, Numero)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- -- Reference: Estudiantes_Estudiante (table: Estudiante_cursa)
-- ALTER TABLE Estudiante_cursa ADD CONSTRAINT Estudiantes_Estudiante
--     FOREIGN KEY (Estudiante_Codigo)
--     REFERENCES Estudiante (Codigo)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;

-- Reference: Franja_Grupo (table: Franja)
ALTER TABLE Franja ADD CONSTRAINT Franja_Grupo
    FOREIGN KEY (Grupo_Semestre_Years, Grupo_Semestre_Periodo_academico, Grupo_Curso_Nemonico, Grupo_Numero)
    REFERENCES Grupo (Semestre_Years, Semestre_Periodo_academico, Curso_Nemonico, Numero)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- -- Reference: Grupo_Curso (table: Grupo)
-- ALTER TABLE Grupo ADD CONSTRAINT Grupo_Curso
--     FOREIGN KEY (Curso_Nemonico)
--     REFERENCES Curso (Nemonico)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;
-- 
-- -- Reference: Grupo_Monitor (table: Grupo)
-- ALTER TABLE Grupo ADD CONSTRAINT Grupo_Monitor
--     FOREIGN KEY (monitor_Codigo)
--     REFERENCES Monitor (Codigo)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;

-- -- Reference: Grupo_Profesor (table: Grupo)
-- ALTER TABLE Grupo ADD CONSTRAINT Grupo_Profesor
--     FOREIGN KEY (profesor_Codigo)
--     REFERENCES Profesor (Codigo)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;

-- -- Reference: Grupo_Semestre (table: Grupo)
-- ALTER TABLE Grupo ADD CONSTRAINT Grupo_Semestre
--     FOREIGN KEY (Semestre_Years, Semestre_Periodo_academico)
--     REFERENCES Semestre (Years, Periodo_academico)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;

-- Reference: Monitoria_Grupo (table: Monitoria)
ALTER TABLE Monitoria ADD CONSTRAINT Monitoria_Grupo
    FOREIGN KEY (Grupo_Semestre_Years, Grupo_Semestre_Periodo_academico, Grupo_Curso_Nemonico, Grupo_Numero)
    REFERENCES Grupo (Semestre_Years, Semestre_Periodo_academico, Curso_Nemonico, Numero)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- -- Reference: Semestre_Administrador (table: Semestre)
-- ALTER TABLE Semestre ADD CONSTRAINT Semestre_Administrador
--     FOREIGN KEY (administrador_codigo)
--     REFERENCES Administrador (Codigo)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
-- ;
-- 
-- -- Reference: Tema_Curso (table: Tema)
-- ALTER TABLE Tema ADD CONSTRAINT Tema_Curso
--     FOREIGN KEY (Curso_Nemonico)
--     REFERENCES Curso (Nemonico)  
--     NOT DEFERRABLE 
--     INITIALLY IMMEDIATE
;

-- End of file.

