package in.mahesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
