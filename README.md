# Building REST services with Spring Tutorial
###### Code Author: Joseph Ishak

## @Annotations Covered

1. ### Entity  - JPA annotation to make this object ready for storage in a JPA-based data store
2. ### Id - JPA annotations to indicate it’s the primary key 
3. ### GeneratedValue - JPA annotations to indicate it’s the primary key is automatically populated by the JPA
4. ### SpringBootApplication - Meta-annotation that pulls in component scanning, autoconfiguration, and property support
6. ### RestController - Indicates that the data returned by each method will be written straight into the response body instead of rendering a template.
7. ### GetMapping - Corresponding to HTTP GET
8. ### PostMapping - Corresponding to HTTP POST
9. ### PutMapping - Corresponding to HTTP PUT
10. ### DeleteMapping - Corresponding to HTTP DELETE
11. ### ControllerAdvice - Says this class is an Advice Class for Controller
12. ### ExceptionHandler - Configures the advice to only respond if a specific exception is throw
13. ### ResponseBody - Signals that this advice is rendered straight into the response body.
14. ### ResponseStatus - Says to issue a specific HTTP Status 


## This Project has been dockerized for personal practice. 

Step 1. Add Dockerfile to root of Spring Boot APP

<p><code>
FROM openjdk:8-jdk-alpine /n
ARG JAR_FILE=target/*.jar /n
COPY ${JAR_FILE} app.jar /n
ENTRYPOINT ["java","-jar","/app.jar"] /n
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
FROM openjdk:8-jdk-alpine /n
RUN addgroup -S spring && adduser -S spring -G spring /n
USER spring:spring /n
ARG DEPENDENCY=target/dependency /n
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib /n
COPY ${DEPENDENCY}/META-INF /app/META-INF /n
COPY ${DEPENDENCY}/BOOT-INF/classes /app /n
ENTRYPOINT ["java","-cp","app:app/lib/*","wk2SbRestApiTutorialApplication.Application"] /n
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