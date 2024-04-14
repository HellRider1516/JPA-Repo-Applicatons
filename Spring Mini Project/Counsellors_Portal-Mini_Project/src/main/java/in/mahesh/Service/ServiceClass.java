package in.mahesh.Service;

import java.util.List;
import java.util.Optional;

import in.mahesh.Entity.EnquiryDetails;
import in.mahesh.Entity.Registration;

public interface ServiceClass {
	public boolean saveRegistrationDetails(Registration r);
	
	public boolean saveEnquiryDetailsDetails(EnquiryDetails e);
	
	public Long countDetails(EnquiryDetails e);
	
	public List<EnquiryDetails>  viewAllDetails(EnquiryDetails e);
	
	public EnquiryDetails editDetails(EnquiryDetails e);
	
	public List<Registration> checkLogindetails(String mail , String password);
	
	public Optional<Registration> mailExsitOrNot(String mail);

}
