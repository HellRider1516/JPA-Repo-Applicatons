package in.mahesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.Repo.PersonRepo;
import in.mahesh.entity.Person;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public void savePerson() {
		Person p=new Person();
		p.setpName("Rajesj");
		p.setGender("Male");
		p.setfName("fRajesh");
		personRepo.save(p);
	}

	
	public List<Person> personFindAll() {
		return personRepo.findAll();
	}
}
