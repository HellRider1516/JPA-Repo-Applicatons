package in.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	@GetMapping("/first")
	public ModelAndView msg1() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("msg", "Good Morning...");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/msg2")
	public ModelAndView msg2() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("msg1","hey.. iam Mahesh");
		mav.setViewName("index");
		return mav;
	}

}
