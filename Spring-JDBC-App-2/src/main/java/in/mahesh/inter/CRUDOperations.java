package in.mahesh.inter;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.mahesh.entity.Employee;
@Repository
public interface CRUDOperations extends CrudRepository<Employee, Integer> {
	public List<Employee> findByEname(String ename);
	public List<Employee>  findByEsal(double esal);
	public List<Employee> findByEsalGreaterThanEqual(double esal);
	@Query("from Employee")
	public List<Employee> getAllEmpDetails();
	@Query("from Employee where eid=:eid")
	public Employee getById(int eid);
	@Query(value="select *from Employee" , nativeQuery = true)
	public List<Employee> getBySql();

}
