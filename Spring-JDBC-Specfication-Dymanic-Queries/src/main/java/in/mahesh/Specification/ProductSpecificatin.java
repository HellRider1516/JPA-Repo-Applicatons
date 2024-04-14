package in.mahesh.Specification;

import org.springframework.data.jpa.domain.Specification;

import in.mahesh.entity.product;

public class ProductSpecificatin {
	public static Specification<product> catagoryLike(String catagory){
		return (root , query , CriteriaBuilder) -> CriteriaBuilder.like(root.get("catagory"), "%" +catagory + "%");
	}
	public static Specification<product> pBrandLike(String pBrand){
		return (root,query,CriteriaBuilder) -> CriteriaBuilder.like(root.get("pBrand"), "%" + pBrand + "%");
	}
	public static Specification<product> priceLessThen(double price){
		return (root,query,CriteriaBuilder) -> CriteriaBuilder.lessThan(root.get("price"),price);
	}
	public static Specification<product> priceGratherThen (double price){
		return (root,query,CriteriaBuilder) -> CriteriaBuilder.greaterThan(root.get("price"),price);
	}

}
