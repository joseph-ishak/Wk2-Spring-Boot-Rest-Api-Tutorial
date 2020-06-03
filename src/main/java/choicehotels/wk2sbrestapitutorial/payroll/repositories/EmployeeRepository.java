package choicehotels.wk2sbrestapitutorial.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import choicehotels.wk2sbrestapitutorial.payroll.models.Employee;
// This interface extends Spring Data JPA’s JpaRepository, specifying the domain type as Employee and the id type as Long
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}