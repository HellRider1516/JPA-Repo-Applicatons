package in.mahesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Person;
import in.mahesh.entity.PersonPK;

public interface PersonRepo extends JpaRepository<Person, PersonPK> {

}
