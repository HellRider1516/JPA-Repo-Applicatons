package in.mahesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahesh.Service.ProductService;
import in.mahesh.entity.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@GetMapping("/product")
	public ModelAndView loadTheData() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("product", new Product());
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/product")
	public ModelAndView saveProducts(Product product) {
		boolean saveProduct = ps.saveProduct(product);
		ModelAndView mav =new ModelAndView();
		if(saveProduct) {
			mav.addObject("sucess","product saved");
		}else {
			mav.addObject("error", "product not saved");
		}
		mav.setViewName("index");
		
		return mav;
		
	}
	
	@GetMapping("/save")
	public ModelAndView getDetails() {
		List<Product> list = ps.getAllProduct();
		ModelAndView mav=new ModelAndView();
		mav.addObject("productobj",list);
		mav.setViewName("data");
		return mav;
	}

}
