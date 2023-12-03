# Dockerfile

# Usa la imagen base de OpenJDK para Java 11
FROM openjdk:11-jre-slim

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copia los archivos JAR de cada microservicio al contenedor
COPY ./config-server/target/config-server.jar config-server.jar
COPY ./discovery/target/discovery.jar discovery.jar
COPY ./gateway/target/gateway.jar gateway.jar
COPY ./school/target/school.jar school.jar
COPY ./student/target/student.jar student.jar

# Exponer los puertos que necesitas
EXPOSE 8888 8761 8080 8081 8082

# Comando para ejecutar tus microservicios
CMD ["java", "-jar", "config-server.jar"]