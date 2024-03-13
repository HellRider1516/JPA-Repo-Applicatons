package in.mahesh.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.entity.Roles;
import in.mahesh.entity.User;
import in.mahesh.repo.RolesRepo;
import in.mahesh.repo.UserRepo;

@Service
public class UserService {
	private UserRepo userRepo;
	private RolesRepo rolesRepo;
	@Autowired
	public UserService(UserRepo userRepo, RolesRepo rolesRepo) {
		super();
		this.userRepo = userRepo;
		this.rolesRepo = rolesRepo;
	}
	public void userSave() {
		User u1=new User("Rjesh",26,"Male",LocalDate.of(2000, 1, 1));
		User u2=new User("Naveen",25,"Male",LocalDate.of(2000, 2, 2));
		List<User> user = Arrays.asList(u1,u2);
		
		
		
		
		Roles r1=new Roles("Manager");
		Roles r2=new Roles("Admin");
		Roles r3=new Roles("jr Software");
		Roles r4=new Roles("sr Software");
		
		List<Roles> roles = Arrays.asList(r1,r2,r3,r4);
		
		u1.setListRoles(roles);
		//u2.setListRoles(roles);
		
		
//		r1.setListUser(user);
//		r2.setListUser(user);
//		r3.setListUser(user);
//		r4.setListUser(user);
				
		
		userRepo.saveAll(user);
		System.out.println("Sucessfully........");
		
	}
	

}
