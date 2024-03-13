package in.mahesh.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	private String pName;
	private String gender;
	private LocalDate DOB;
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	private PassPort passPort;
	
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public PassPort getPassPort() {
		return passPort;
	}
	public void setPassPort(PassPort passPort) {
		this.passPort = passPort;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", gender=" + gender + ", DOB=" + DOB + ", passPort="
				+ passPort + "]";
	}
	
	

}
