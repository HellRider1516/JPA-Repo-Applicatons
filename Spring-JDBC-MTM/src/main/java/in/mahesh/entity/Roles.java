package in.mahesh.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rId;
	private String rName;
	
	
	@ManyToMany(mappedBy = "listRoles")
	private List<User> listUser;


	public Roles(String rName) {
		super();
		this.rName = rName;
	}


	public List<User> getListUser() {
		return listUser;
	}


	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	
	
	
	

}
