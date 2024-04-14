package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
