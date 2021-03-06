package choicehotels.wk2sbrestapitutorial.payroll.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Lombok annotation to create all the getters, setters, equals, hash and toString methods based on the fields
@Data
// JPA Annotation to make this object ready for storage in a JPA-based data store
@Entity
public class Employee {

  // ID and Generated Value are JPA Annotations to mark the PK and automatically generate value when inserting into datastore
  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  Employee() {}

  public Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }
}