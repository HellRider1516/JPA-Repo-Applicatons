package in.mahesh.entity;

import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Person {
	@EmbeddedId
	private PersonPK personPK;
	private Integer age;
	private String pName;
	private String gender;
	private LocalDate DOB;
	public PersonPK getPersonPK() {
		return personPK;
	}
	public void setPersonPK(PersonPK personPK) {
		this.personPK = personPK;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [personPK=" + personPK + ", age=" + age + ", pName=" + pName + ", gender=" + gender + ", DOB="
				+ DOB + "]";
	}
	

}
