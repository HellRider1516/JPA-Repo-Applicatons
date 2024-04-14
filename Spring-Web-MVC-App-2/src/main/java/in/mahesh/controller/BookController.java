package in.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahesh.bindings.Books;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView loadDetails() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("bookobj", new Books());
		mav.setViewName("bookHTML");
		return mav;
	}
	
	
	@PostMapping("/book")
	public ModelAndView handleTheData(Books books) {
		System.out.println(books);   
		ModelAndView mav=new ModelAndView();
		mav.addObject("bookmsg", "books value is enter Sucessfully");
		mav.setViewName("booksucess");

		return mav;
	}

}
