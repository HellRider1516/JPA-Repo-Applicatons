package in.mahesh.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.mahesh.Repo.ProductRepo;
import in.mahesh.Specification.ProductSpecificatin;
import in.mahesh.entity.product;

@Service
public class ProductService {
	private ProductRepo productRepo;

	public ProductService(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}
	
	public List<product> getDetails(String catagory,Double minPrice) {
		ProductSpecificatin spec =new ProductSpecificatin();
		if(catagory != null) {
			spec=spec.and(ProductSpecificatin.catagoryLike(catagory));
		}
		
		if (minPrice != null) {
			spec = spec.and(ProductSpecificatin.priceLessThen(minPrice));
		}

		
	}
	
	public void productSave() {
		product p1=new product("Moblie","Iphone",10000.0,LocalDate.of(1999, 1, 1));
		product p2=new product("Moblie","OnePlus",20000.0,LocalDate.of(1999, 2, 2));
		product p3=new product("Moblie","GooglePixel",30000.0,LocalDate.of(1999, 3, 3));
		product p4=new product("Computer","keyBoard",10000.0,LocalDate.of(2000, 1, 1));
		product p5=new product("Computer","mouse",3400.0,LocalDate.of(2000, 2, 2));
		product p6=new product("Computer","Monitor",50000.0,LocalDate.of(2000, 3, 3));
		productRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6));
		System.out.println("Sucessfully................");
	}

}
