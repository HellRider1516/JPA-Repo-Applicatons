package in.mahesh.entity;

import java.time.LocalDate;import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class PassPort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ppId;
	private String ppNum;
	private LocalDate issueDate;
	private LocalDate expireDate;
	@JoinColumn
	@OneToOne
	private Person person;
	
	
	public Integer getPpId() {
		return ppId;
	}
	public void setPpId(Integer ppId) {
		this.ppId = ppId;
	}
	public String getPpNum() {
		return ppNum;
	}
	public void setPpNum(String ppNum) {
		this.ppNum = ppNum;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
//	public Integer getpId() {
//		return pId;
//	}
//	public void setpId(Integer pId) {
//		this.pId = pId;
//	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "PassPort [ppId=" + ppId + ", ppNum=" + ppNum + ", issueDate=" + issueDate + ", expireDate=" + expireDate
				+ "]";
	}
	
	

}
