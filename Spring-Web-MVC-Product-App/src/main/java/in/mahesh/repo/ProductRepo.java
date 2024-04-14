package in.mahesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
