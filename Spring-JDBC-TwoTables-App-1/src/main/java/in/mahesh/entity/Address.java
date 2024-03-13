package in.mahesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aId;
	private String country;
	private String state;
	private String city;
	private String colony;
	private Integer eid;
	
	
	
	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}	
	
	public Integer getaId() {
		return aId;
	}


	public void setaId(Integer aId) {
		this.aId = aId;
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}


	@Override
	public String toString() {
		return "Address [aId=" + aId + ", country=" + country + ", state=" + state + ", city=" + city + ", colony="
				+ colony + ", eid=" + eid + "]";
	}
	
	
	
	

}