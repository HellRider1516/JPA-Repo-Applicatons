package in.mahesh.Repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.product;

public interface ProductRepo extends JpaRepository<product, Integer> {
	public List<product> findAll(Specification<product> spe);

}
