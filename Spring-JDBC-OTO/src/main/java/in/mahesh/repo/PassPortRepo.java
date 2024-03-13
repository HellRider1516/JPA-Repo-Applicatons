package in.mahesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.PassPort;

public interface PassPortRepo extends JpaRepository<PassPort, Integer> {

}
