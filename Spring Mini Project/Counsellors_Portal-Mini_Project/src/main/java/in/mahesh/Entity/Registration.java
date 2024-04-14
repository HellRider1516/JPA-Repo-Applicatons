package in.mahesh.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Long phNo;
	private String password;
	
	@OneToMany(mappedBy = "reg" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<EnquiryDetails> enquiry;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

	public List<EnquiryDetails> getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(List<EnquiryDetails> enquiry) {
		this.enquiry = enquiry;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + ", password="
				+ password + ", enquiry=" + enquiry + "]";
	}
	
	


	

	
	
	
	
	

}
