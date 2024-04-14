package in.mahesh.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.entity.Product;
import in.mahesh.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	public boolean saveProduct(Product p) {
		Product status = productRepo.save(p);
		if(status.getpId()!=null) {
			return true;
		}else {
			return false;
		}
		
	}
	public List<Product> getAllProduct(){
		return productRepo.findAll();
		
	}

}
