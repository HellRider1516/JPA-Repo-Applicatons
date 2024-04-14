package in.mahesh.Entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EnquiryDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Long phNo;
	private String classMode;
	private String course;
	private String status;
	
	
	@ManyToOne
	@JoinColumn
	private Registration reg;

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

	public String getClassMode() {
		return classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Registration getReg() {
		return reg;
	}

	public void setReg(Registration reg) {
		this.reg = reg;
	}
	
	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "EnquiryDetails [id=" + id + ", name=" + name + ", phNo=" + phNo + ", classMode=" + classMode
				+ ", course=" + course + ", status=" + status + "]";
	}

	

	
	
	
	

}
