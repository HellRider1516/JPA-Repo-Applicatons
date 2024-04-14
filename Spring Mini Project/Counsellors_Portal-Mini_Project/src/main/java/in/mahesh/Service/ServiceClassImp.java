package in.mahesh.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.mahesh.Entity.EnquiryDetails;
import in.mahesh.Entity.Registration;
import in.mahesh.Repo.EnquiryDetailsRepo;
import in.mahesh.Repo.RegistrationRepo;
import in.mahesh.mail.MailSend;
@Service
public class ServiceClassImp implements ServiceClass {
	@Autowired
	private RegistrationRepo rRepo;
	
	@Autowired
	private EnquiryDetailsRepo eRepo;
	
	@Autowired
	private MailSend ms;


	@Override
	public boolean saveRegistrationDetails(Registration r) {
		Registration regSaved = rRepo.save(r);
		if(regSaved.getId() != null) {
			ms.mailSent(regSaved.getEmail(), "Congrations your Account has been Created Sucessfully...", "Account Created");
		}else {
			return false;
		}
		return true;
	}

	@Override
	public boolean saveEnquiryDetailsDetails(EnquiryDetails e) {
		EnquiryDetails enqsaved = eRepo.save(e);
		if(enqsaved.getId() != null) {
			return true;
		}
		return false;
	}
	
	

	@Override
	public List<Registration> checkLogindetails(String mail, String password) {
		return rRepo.findByEmailAndPassword(mail, password);
	}
	
	

	@Override
	public Optional<Registration> mailExsitOrNot(String mail) {
		return rRepo.findByEmail(mail);
			
		
	}
	
	
	
	
	
	
	
	
	
	
	

	

	@Override
	public List<EnquiryDetails> viewAllDetails(EnquiryDetails e) {
		
		Example<EnquiryDetails> example = Example.of(e);
		List<EnquiryDetails> all = eRepo.findAll(example);
		return all;
	}
	
	
	
	
	
	
	
	

	@Override
	public EnquiryDetails editDetails(EnquiryDetails e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long countDetails(EnquiryDetails e) {
		long count = eRepo.count();
		System.out.println(count);
		return count;
	}

}
