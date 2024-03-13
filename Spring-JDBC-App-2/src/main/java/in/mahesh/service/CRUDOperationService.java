package in.mahesh.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.mahesh.entity.Employee;
import in.mahesh.inter.CRUDOperations;
@Service
public class CRUDOperationService {
	private CRUDOperations cop;

	public CRUDOperationService(CRUDOperations cop) {
		super();
		this.cop = cop;
	}
	public void mSave() {
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("Rajesh");
		e.setEsal(10000.0);
		e.setDept("Team Leader");
		cop.save(e);
		System.out.println("Values sucessfully Injected in mSave method");
	}
	public void mSaveAll() {
		Employee e1=new Employee(102,"Satish",20000.0,"Sr Software");
		Employee e2=new Employee(103,"Vinay",30000.0,"jr Software");
		Employee e3=new Employee(104,"Kawshik",40000.0,"Testing Team");
		 List<Employee> e = Arrays.asList(e1,e2,e2);
		 cop.saveAll(e);
		 System.out.println("Values sucessfully Injected in mSAveAll().....");
	}
	public void mFindById() {
		Optional<Employee> byId = cop.findById(103);
		System.out.println(byId);
	}
	public void mFindAllById() {
		List<Integer> e = Arrays.asList(101,102,103,104);
		Iterable<Employee> allById = cop.findAllById(e);
		System.out.println(allById);
	}
	public void mfindAll() {
		Iterable<Employee> all = cop.findAll();
		System.out.println(all);
	}
	public void mExsitById() {
		boolean existsById = cop.existsById(102);
		System.out.println(existsById);
	}
	public void mCount() {
		long count = cop.count();
		System.out.println(count);
	}
	public void mFindByEname() {
		List<Employee> byEname = cop.findByEname("Rajesh");
		System.out.println(byEname);
	}
	public void mFindByEsal() {
		List<Employee> byEsal = cop.findByEsal(20000.0);
		System.out.println(byEsal);
	}
	public void mFindByEsalGretherThanOrEqualTo() {
		List<Employee> byEsalGreaterThanEqual = cop.findByEsalGreaterThanEqual(10000.0);
		System.out.println(byEsalGreaterThanEqual);
	}
	public void getAllEmp() {
		System.out.println(cop.getAllEmpDetails());
	}
	public void getById() {
		System.out.println(cop.getById(101));
	}
	public void getAllEmpBySql() {
		List<Employee> bySql = cop.getBySql();
		System.out.println(bySql);
	}
}