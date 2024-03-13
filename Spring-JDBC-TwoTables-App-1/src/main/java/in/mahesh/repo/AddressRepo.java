package in.mahesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.mahesh.entity.Address;
import in.mahesh.entity.Employee;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	@Query(value = "SELECT  * FROM Employee e JOIN Address a ON e.e_id = a.eid",nativeQuery = true)
	public List<Address> getDetailsBySql();

}
