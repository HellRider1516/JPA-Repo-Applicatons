package in.mahesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.Entity.Registration;
import java.util.List;
import java.util.Optional;


public interface RegistrationRepo extends JpaRepository<Registration, Integer> {
	
	public  List<Registration> findByEmailAndPassword(String email, String password);
	
	public Optional<Registration> findByEmail(String email);

}
