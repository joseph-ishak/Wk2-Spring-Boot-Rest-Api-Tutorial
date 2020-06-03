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