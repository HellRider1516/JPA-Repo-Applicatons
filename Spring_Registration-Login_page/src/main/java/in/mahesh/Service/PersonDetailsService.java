package in.mahesh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import in.mahesh.Repo.PersonDetailsRepo;
import in.mahesh.entity.PersonDetails;

@Service
public class PersonDetailsService {
	@Autowired
	private PersonDetailsRepo repo;
	
	
	
	public boolean savePersonDetails(PersonDetails pd) {
		PersonDetails personDetails = repo.save(pd);
		if(personDetails.getPersonId() != null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	@Autowired
	private JavaMailSender mailSender;
	
	public  void sendEmail(String toEmail, String subject, String body ) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("hellridermahesh@gmail.com");
		smm.setTo(toEmail);
		smm.setText(body);
		smm.setSubject(subject);
		 mailSender.send(smm);
		 
		
		
	}
	
	
	
	public PersonDetails checkDetails(String mailId, String password) {
	    return repo.findByMailIdAndPassword(mailId, password);
	}

	
	
	
	
	
	
	
	
	
	

	
	
	


}
