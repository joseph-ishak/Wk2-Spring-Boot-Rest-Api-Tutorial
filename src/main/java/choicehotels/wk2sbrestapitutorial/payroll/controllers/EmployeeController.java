package choicehotels.wk2sbrestapitutorial.payroll.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import choicehotels.wk2sbrestapitutorial.payroll.Exceptions.EmployeeNotFoundException;
import choicehotels.wk2sbrestapitutorial.payroll.models.Employee;
import choicehotels.wk2sbrestapitutorial.payroll.repositories.EmployeeRepository;

// Indicates that the data returned by each method will be written straight into the response body instead of rendering a template
@RestController
public class EmployeeController {

  private final EmployeeRepository repository;

  //  An EmployeeRepository is injected by constructor into the controller.
  EmployeeController(EmployeeRepository repository) {
    this.repository = repository;
  }

  /**
   * We have routes for each operations 
   * (@GetMapping, @PostMapping, @PutMapping and @DeleteMapping, corresponding to 
   * HTTP GET, POST, PUT, and DELETE calls). 
   * (NOTE: It’s useful to read each method and understand what they do.)

   */
  
  
  // Aggregate root
  @GetMapping("/employees")
  List<Employee> all() {
    return repository.findAll();
  }

  @PostMapping("/employees")
  Employee newEmployee(@RequestBody Employee newEmployee) {
    return repository.save(newEmployee);
  }

  // Single item

  @GetMapping("/employees/{id}")
  Employee one(@PathVariable Long id) {

    return repository.findById(id)
    		//    EmployeeNotFoundException is an exception used to indicate when an employee is looked up but not found.
      .orElseThrow(() -> new EmployeeNotFoundException(id));
  }

  @PutMapping("/employees/{id}")
  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

    return repository.findById(id)
      .map(employee -> {
        employee.setName(newEmployee.getName());
        employee.setRole(newEmployee.getRole());
        return repository.save(employee);
      })
      .orElseGet(() -> {
        newEmployee.setId(id);
        return repository.save(newEmployee);
      });
  }

  @DeleteMapping("/employees/{id}")
  void deleteEmployee(@PathVariable Long id) {
    repository.deleteById(id);
  }
}