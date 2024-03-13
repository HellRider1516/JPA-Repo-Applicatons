package in.mahesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
