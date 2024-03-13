package in.mahesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.mahesh.entity.PersonEntity;

public interface IPersonRepo extends JpaRepository<PersonEntity, Integer> {
	@Query(value="select p_Id,pname from Person_Entity",nativeQuery = true)
	public List<Object[]> getDetails();
	@Query(value="call personprocedure " , nativeQuery = true)
	public List<Object[]> getDetailsUsingProcedyre();
	@Query("select pId,pname from PersonEntity")
	public List<Object[]> getByHQL();

}
