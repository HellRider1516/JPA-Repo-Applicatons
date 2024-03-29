package in.mahesh.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.entity.PassPort;
import in.mahesh.entity.Person;
import in.mahesh.repo.PassPortRepo;
import in.mahesh.repo.PersonRepo;
@Service
public class PersonService {
	private PersonRepo personRepo;
	private PassPortRepo passPortRepo;
	@Autowired
	public PersonService(PersonRepo personRepo, PassPortRepo passPortRepo) {
		super();
		this.personRepo = personRepo;
		this.passPortRepo = passPortRepo;
	}
	
	
	
	
	public void getDetails() {
		Optional<Person> byId = personRepo.findById(1);
		if(byId.isPresent()) {
			Person person = byId.get();
			System.out.println(person);
		}
	}
	
	
	
	
	
	public void personSave() {
		Person p=new Person();
		p.setpName("Rajesh");
		p.setGender("Male");
		p.setDOB(LocalDate.of(2000, 1, 1));
		
		
		PassPort pp=new PassPort();
		pp.setPpNum("kjbchia89ciba");
		pp.setIssueDate(LocalDate.now());
		pp.setExpireDate(LocalDate.now().plusYears(10));
		
		
		
		pp.setPerson(p);
		p.setPassPort(pp);
		
		personRepo.save(p);
		
		System.out.println("Sucessfully.......");
	}
	

}
