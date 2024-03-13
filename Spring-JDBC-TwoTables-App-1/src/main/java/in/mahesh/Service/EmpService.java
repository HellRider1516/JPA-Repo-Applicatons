package in.mahesh.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.entity.Address;
import in.mahesh.entity.Employee;
import in.mahesh.repo.AddressRepo;
import in.mahesh.repo.EmpRepo;
@Service
public class EmpService {
	private EmpRepo  empRepo;
	private AddressRepo addRepo;
	@Autowired
	public EmpService(EmpRepo empRepo, AddressRepo addRepo) {
		super();
		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}



	public void mSave() {
		Employee e=new Employee();
		e.seteName("Rajesh");
		e.setDOB(LocalDate.of(2000, 11, 2));
		Employee employee = empRepo.save(e);
		Address add=new Address();
		add.setCity("HYD");
		add.setColony("sanjay Gandi");
		add.setCountry("INDIA");
		add.setState("Telagana");
		add.setEid(employee.geteId());
		addRepo.save(add);
		
	}
	
	
	
	public void getDetails() {
		 List<Object[]> detailsBySql = empRepo.getDetailsBySql();
//		 List<Address> sql2 = addRepo.getDetailsBySql();
//		 sql.forEach(e -> System.out.println(e));
//		 sql2.forEach(e -> System.out.println(e));
		for(Object[] p : detailsBySql) {
			for(Object x : p) {
				System.out.print(x+"  ");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}