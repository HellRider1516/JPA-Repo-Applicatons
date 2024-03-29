package in.mahesh.Service;

import java.awt.Label;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import in.mahesh.entity.PersonEntity;
import in.mahesh.repo.IPersonRepo;

@Service
public class PersonService {
	private IPersonRepo ipr;
	public PersonService(IPersonRepo ipr) {
		super();
		this.ipr = ipr;
	}
	public void getSave() {
		PersonEntity p=new PersonEntity();
		p.setpId(101);
		p.setPname("Rajesh");
		p.setpGender("Male");
		p.setpDOB(new Date(2000,4,5));
		p.setImg("C:\\Users\\PC\\Downloads".getBytes());
		p.setResume("C:\\\\Users\\\\PC\\\\Downloads".getBytes());
		ipr.save(p);
		System.out.println("Sucessfully.......");
	}
	public void mSaveAll() {
		PersonEntity p1=new PersonEntity("kawshik","male",new Date(2000,3,4),"C:\\Users\\PC\\Downloads".getBytes(),"C:\\Users\\PC\\Downloads".getBytes());
		PersonEntity p2=new PersonEntity("kawshik","male",new Date(2000,3,4),"C:\\Users\\PC\\Downloads".getBytes(),"C:\\Users\\PC\\Downloads".getBytes());
		PersonEntity p3=new PersonEntity("kawshik","male",new Date(2000,3,4),"C:\\Users\\PC\\Downloads".getBytes(),"C:\\Users\\PC\\Downloads".getBytes());
		List<PersonEntity> asList = Arrays.asList(p1,p2,p3);
		ipr.saveAll(asList);
	}
	public void getSomeDetails()  {
		List<Object[]>  list = ipr.getDetails();
		for(Object[] obj: list) {
			for(Object p : obj) {
				System.out.println(p.toString());
			}
		}
	}
	public void getDetails() {
		List<Object[]> detailsUsingProcedyre = ipr.getDetailsUsingProcedyre();
		for(Object[] obj: detailsUsingProcedyre) {
			for(Object p : obj) {
				System.out.println(p.toString());
			}
		}
		
	}
	public void getByHQLQuery() {
		List<Object[]> byHQL = ipr.getByHQL();
		
		for(Object[] obj : byHQL) {
			for(Object p: obj) {
				System.out.println(p.toString());
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
