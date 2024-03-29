package in.mahesh.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import in.mahesh.entity.Person;
import in.mahesh.entity.PersonPK;
import in.mahesh.repo.PersonRepo;

@Service
public class PersonService {
	private PersonRepo personRepo;
	
	public PersonService(PersonRepo personRepo) {
		super();
		this.personRepo = personRepo;
	}

	public void mSave() {
		Person p=new Person();
		p.setAge(23);
		p.setDOB(LocalDate.of(2000, 11, 26));
		p.setGender("male");
		PersonPK pk=new PersonPK();
		p.setpName("Rajesh");
		pk.setPassportId("kjcacoch2837jdsb");
		p.setPersonPK(pk);
		personRepo.save(p);
		System.out.println("saved........");
		
	}

}
