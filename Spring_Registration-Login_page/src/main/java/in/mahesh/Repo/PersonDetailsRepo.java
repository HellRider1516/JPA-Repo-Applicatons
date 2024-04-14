package in.mahesh.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.PersonDetails;


public interface PersonDetailsRepo extends JpaRepository<PersonDetails, Integer> {
	
	public PersonDetails findByMailIdAndPassword(String mailId,String password);
}
