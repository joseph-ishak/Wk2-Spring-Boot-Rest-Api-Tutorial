package choicehotels.wk2sbrestapitutorial.payroll.data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import choicehotels.wk2sbrestapitutorial.payroll.models.Employee;
import choicehotels.wk2sbrestapitutorial.payroll.repositories.EmployeeRepository;

@Configuration
// Lombok annotation to autocreate an Slf4j-based LoggerFactory as log, allowing us to log these newly created "employees"
@Slf4j
class LoadDatabase {

  // Spring Boot will run ALL CommandLineRunner beans once the application context is loaded
  // This runner requests a copy of the EmployeeRepository
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
	  // Creates two entities and stores them
    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
    };
  }
}
