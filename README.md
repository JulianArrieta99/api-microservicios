# API Microservicios - Documentación

Este repositorio contiene una aplicación basada en microservicios para gestionar escuelas y estudiantes.

## Tecnologías Utilizadas

- **Spring Boot:** Framework de desarrollo de aplicaciones Java basado en Java Platform, Standard Edition (Java SE) que simplifica el desarrollo y despliegue de aplicaciones.

- **Spring Cloud:** Conjunto de herramientas para construir sistemas distribuidos con patrones de diseño comunes.

- **Spring Cloud Config:** Servicio de configuración centralizada para la aplicación basada en microservicios.

- **Spring Cloud Netflix Eureka:** Servicio de registro y descubrimiento de microservicios para facilitar la comunicación entre ellos.

- **Spring Cloud Gateway:** Puerta de enlace para enrutar las solicitudes a los microservicios.

- **Java Persistence API (JPA):** Especificación de Java que describe la gestión del ciclo de vida de los objetos de dominio en una aplicación Java.

- **Hibernate:** Framework de mapeo objeto-relacional (ORM) que implementa JPA y facilita el trabajo con bases de datos relacionales en Java.

- **Maven:** Herramienta de gestión de proyectos y construcción de software.

- **PostgreSQL:** Sistema de gestión de bases de datos relacional de código abierto y potente.


## Tabla de Contenidos

1. [Endpoints](#endpoints)
    1. [School](#school)
    2. [Student](#student)
2. [Estructura de Microservicios](#estructura-de-microservicios)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Agradecimientos](#agradecimientos)

## Endpoints

### School

- **Obtener todas las escuelas:**
  - Método: `GET`
  - Ruta: `/api/v1/schools`
  - Descripción: Obtiene la lista de todas las escuelas.

- **Obtener escuela con estudiantes:**
  - Método: `GET`
  - Ruta: `/api/v1/schools/with-students/{school-id}`
  - Descripción: Obtiene una escuela y la lista de estudiantes asociados.

- **Guardar nueva escuela:**
  - Método: `POST`
  - Ruta: `/api/v1/schools`
  - Descripción: Guarda una nueva escuela.

### Student

- **Obtener todos los estudiantes:**
  - Método: `GET`
  - Ruta: `/api/v1/students`
  - Descripción: Obtiene la lista de todos los estudiantes.

- **Obtener estudiantes por escuela:**
  - Método: `GET`
  - Ruta: `/api/v1/students/school/{school-id}`
  - Descripción: Obtiene la lista de estudiantes para una escuela específica.

- **Guardar nuevo estudiante:**
  - Método: `POST`
  - Ruta: `/api/v1/students`
  - Descripción: Guarda un nuevo estudiante.

## Estructura de Microservicios

El proyecto está compuesto por los siguientes microservicios:

- **Config Server:**
  - Descripción: Servicio de configuración centralizada para la aplicación.

- **Discovery Server:**
  - Descripción: Servicio de registro y descubrimiento de microservicios.

- **Gateway:**
  - Descripción: Puerta de enlace para enrutar las solicitudes a los microservicios.

## Instalación

1. Clona el repositorio: `git clone https://github.com/JulianArrieta99/api-microservicios.git`
2. Navega al directorio del proyecto: `cd api-microservicios`

### Microservicios School y Student

3. Abre cada uno de los directorios correspondientes a los microservicios School y Student en terminales separadas.
   - Para School: `cd school`
   - Para Student: `cd student`

4. Dentro de cada directorio, ejecuta el siguiente comando para construir y ejecutar el microservicio:
   ```bash
   ./mvnw spring-boot:run

