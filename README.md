# ECI-Monitores
## Periodo Académico: 2018-1<br />
## Curso: Procesos de Desarrollo de Software (PDSW)<br />
#### Plataforma de gestión a servicios de Monitorías Académicas para el programa de Ingeniería de sistemas de la Escuela Colombiana de Ingeniería Julio Garavito
---

##### 2018 - PDSW

### Integrantes
- Daniel Betlran - Scrum team member
- Diego Chinchilla - Scrum master
- Cesar Lanos - Scrum team member
- Camilo Lopez - Scrum team member
- Jonathan Prieto - Scrum team member
- Francisco Chaves - Product owner
---
## Profesor: Francisco Chaves<br />
### Descripción del producto
La Plataforma de gestión a servicios de Monitorias Académicas, es una herramienta que ha contribuido a una mejora significativa en el desempeño de los estudiantes del programa de Ingeniería de Sistemas de la Escuela, en las asignaturas de primeros semestres administradas por el mismo. El sistema, más allá de facilitar el seguimiento de la labor de los monitores, se ha convertido en una valiosa base de conocimiento con la que los coordinadores de asignaturas y de línea pueden identificar aquellos temas que -a través del tiempo- han presentado mayores dificultades a los estudiantes. Con esto, ha sido posible organizar, de forma más estratégica, la tomar acciones a nivel pedagógico, didáctico y administrativo que han redundado en un mejoramiento general del desempeño de los estudiantes.

## Funcionalidades
![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Inicio.PNG)
En la pagina de inicio del proyecto, se pueden filtrar cada una de las franjas que tienen cada uno de los cursos, dando la opcion de seleccionara cada uno de los cursos que estan registrados.

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Monitoria.PNG)
En la pagina de monitor, se puede agragar una asesoria o monitoria, en la cual se puede seleccionar la materia, el grupo, el estudiante por codigo y las observaciones que se tienen en la asesoria.

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Profesor.PNG)
Cuando el profesor ingrese a su pagina correspondiente, este tendra la opcion de filtar las monitorias que se han realizado en sus cursos, mediante la seleccion de sus cursos los cuales aparecen en una tabla seleccionable, ademas se ofrece la opcion de ver cada uno de los registros estadisticos de las asesorias por estudiantes que asisten a estas, se pueden filtrar por Curso, Grupo, Monitor y Tema tratado en la Monitoria.

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Administrador.PNG)
El administrador al ingresar a su pagina, podra escoger mediante botones, cada una de las funciones que le pertenecen al mismo, cada boton lo redirecciona a una pagina diferente, la cual contiene cada una de las funcionalidades.

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/registrarCurso.PNG)
El administrador podra registrar un curso dando los siguientes datos: Nemonico del curso, nombre del curso, creditos academicos correspondientes al curso, horas de monitoria correspondientes al curso. Al dar click en el boton, automaticamente el Curso es registrado en la base de datos

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/registrarMonitor.PNG)
El administrador podra registrar un Monitor, con el simple hecho de dar los datos que se requieren, los cuales son: Codigo, semestre ingreso, programa academico, nombre, apellido, celular, correo y clave. Al dar click en el boton, automaticamente el Monitor es registrado en la base de datos.

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/registrarProfesor.PNG)
El administrador podra registrar un profesor, con tan solo ingresar los datos que son solicitados, los cuales son: Codigo, nombre, apellido, celular, correo y clave. Al dar click en el boton, automaticamente el Profesor es registrado en la base de datos.

![alt text](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/registrarSemestre.PNG)
El administrador podra registrar un Semestre, con tan solo ingresar los datos que se solicitan, los cuales son: ID, año, periodo academico, Fecha inicio semestre, fecha fin semestre y seleccionar el administrador que estara encargado de ese semestre. Al dar click en el boton, automaticamente el Semestre es registrado en la base de datos.

## Arquitectura y diseño detallado:<br />
> - **Modelo de base de datos:**
![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Modelo%20Base%20de%20datos.png)

- **Tecnologias utilizadas:**

- #### Apache Shiro  
Un poderoso y sencillo Framework de seguridad de Java. Cuenta con funciones de autenticación, autorización, criptografía, y manejo de sesiones. Es versatil y permite asegurar desde aplicaciones móviles hasta grandes aplicaciones web.

- #### PrimeFaces 
Una biblioteca de JavaServerFaces que facilita el desarrollo de aplicaciones web con una gran variedad de componentes disponibles para diseño web.

#### Postgres SQL
Sistema de gestión de bases de datos objeto-relacionales, de código abierto y el más potente del mercado.

- #### [Link Heroku](https://pdswproyectoquantum.herokuapp.com/)

## Descripción del proceso:<br />
* Metodología: Se hizo uso SCRUM, una metodología que permite el despliegue continuo del producto con el fin de mostrar en cada revisión  lo avanzado.<br />
* Trello: https://trello.com/b/uaAquS03/2018-1-proypdsw-quantum<br />

- **Sprint 1:**
> - **Sprint-Backlog:**

![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Sprint1.PNG)

> - **Sprint-Burdown Chart:**

![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Burn1.PNG)

>En este Sprint presentamos algunos inconvenientes en la asignacion de tareas entre cada uno de los participantes y desorganizacion en el tiempo que cada uno ibamos a invertir en las tareas, por lo tanto, decidimos organizar mejor las tareas para el siguiente Sprint, ya que al finalizar este no teniamos ninguna tarea completada.

- **Sprint 2:**
> - **Sprint-Backlog:**

![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Sprint2.PNG)

> - **Sprint-Burdown Chart:**

![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Burn2.PNG)

>En este Sprint volvimos a presentar algunos inconvenientes en organizacion de tiempo, pero se adelantaron muchas cosas de la parte grafica, de los mappers, MyBatis, Daos y demas. No se terminaron ninguna de las tareas propuestas en el trello completamente, por lo que organizamos las tareas de una manera mas organizada y tratando que las tareas quedaran entre 2 personsa para la correcta terminacion de cada una.

- **Sprint 3:**
> - **Sprint-Backlog:**

![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Sprint3.PNG)
![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Sprint3[1].PNG)

> - **Sprint-Burdown Chart:**

![](https://github.com/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW/blob/master/Burn3.PNG)

>En este Sprint la organizacion fue mucho mayor, por lo que la mayoria de las tareas fue correcta, la organizacion en este caso fue importante en cada una de las tareas y en cada una de las tareas.

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/21db71efa3e4472bb82a3a658f9e332c)](https://www.codacy.com/app/DanBeltF/2018-1-PROYPDSW?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW&amp;utm_campaign=Badge_Grade)

[![CircleCI](https://circleci.com/gh/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW.svg?style=svg)](https://circleci.com/gh/2018-1-PROYPDSW-QUANTUM/2018-1-PROYPDSW)
