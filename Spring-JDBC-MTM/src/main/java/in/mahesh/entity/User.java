package in.mahesh.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;
	private String uName;
	private Integer uAge;
	private String uGender;
	private LocalDate DOB;
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			joinColumns = {
		        @JoinColumn(name = "uId")
		    },
		    inverseJoinColumns = {
		        @JoinColumn(name = "rId")
		    }
	)

	
	private List<Roles> listRoles;
	
	
	
	public User( String uName, Integer uAge, String uGender, LocalDate dOB) {
		super();
		this.uName = uName;
		this.uAge = uAge;
		this.uGender = uGender;
		DOB = dOB;
	}
	public List<Roles> getListRoles() {
		return listRoles;
	}
	public void setListRoles(List<Roles> listRoles) {
		this.listRoles = listRoles;
	}
	
	

}
