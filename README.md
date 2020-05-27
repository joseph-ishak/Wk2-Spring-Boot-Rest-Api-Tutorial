# Building REST services with Spring Tutorial
###### Code Author: Joseph Ishak

## @Annotations Covered

1. ### Entity  - 
2. ### Id - 
3. ### GeneratedValue - 
4. ### SpringBootApplication - 
5. ### Configuration - 
6. ### RestController - 
7. ### GetMapping - 
8. ### PostMapping - 
9. ### PutMapping - 
10. ### DeleteMapping - 
11. ### ControllerAdvice - 
12. ### ExceptionHandler - 
13. ### ResponseBody - 
14. ### ResponseStatus - 


## This Project has been dockerized for personal practice. 

Step 1. Add Dockerfile to root of Spring Boot APP

<p><code>
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
</p></code>

Step 2. Run it
<p><code>
docker build -t wk2-sb-rest-api-tutorial .
</p></code>

Step 3. Update Dockerfile

<p><code>
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
</p></code>

Step 4. Re Build 

<p><code>
docker build -t wk2-sb-rest-api-tutorial .
</p></code>

Step 5. Re-Run
<p><code>
docker build -t wk2-sb-rest-api-tutorial .
</p></code>

Step 6. Update Docker File
<p><code>
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","wk2SbRestApiTutorialApplication.Application"]
</p></code>

Step 7. Create target/dependency directory and change into that directory

<p><code>mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)</p></code>

Step 8. Re Build
<p><code>
docker build -t wk2-sb-rest-api-tutorial .
</p></code>

Step 9. Re-Run
<p><code>
docker build -t wk2-sb-rest-api-tutorial .
</p></code>