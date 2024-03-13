package in.mahesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.PhoneEntity;

public interface IphoneRepo extends JpaRepository<PhoneEntity, Integer> {

}
