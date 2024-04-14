package in.mahesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String name;
	private String mailId;
	private String password;
	private Long phNo;
	
	
	
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	
	

}
