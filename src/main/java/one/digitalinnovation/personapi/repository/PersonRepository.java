package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//PersonRepository Interface Declaration
public interface PersonRepository extends JpaRepository<Person, Long> {

}
