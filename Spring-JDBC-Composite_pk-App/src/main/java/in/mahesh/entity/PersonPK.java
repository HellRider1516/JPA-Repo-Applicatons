package in.mahesh.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Embeddable
public class PersonPK {
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pId;
	private String passportId;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getPassportId() {
		return passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	@Override
	public String toString() {
		return "PersonPK [pId=" + pId + ", passportId=" + passportId + "]";
	}
	

}
