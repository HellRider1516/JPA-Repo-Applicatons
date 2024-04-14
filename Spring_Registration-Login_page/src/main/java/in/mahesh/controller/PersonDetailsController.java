package in.mahesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahesh.Service.PersonDetailsService;
import in.mahesh.entity.PersonDetails;

@Controller
public class PersonDetailsController {
	@Autowired
	private PersonDetailsService service;
	
	@GetMapping("/Register")
	public ModelAndView loadThedata() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("personobj", new PersonDetails());
		mav.setViewName("Register");
		return mav;
	}
	
	@PostMapping("/Register")
	public ModelAndView handleTheData(PersonDetails pd) {
		boolean status = service.savePersonDetails(pd);
		ModelAndView mav =new ModelAndView();
		if(status) {
			mav.addObject("sucess", "congrats Registration completed..");
		}else {
			mav.addObject("error", "Provided Details is Incorrect..");
		}
		mav.addObject("personobj", new PersonDetails());
		mav.setViewName("Register");
		return mav;
		
		
	}
	
	
	@EventListener(ApplicationReadyEvent.class)
	public ModelAndView sendMail() {
		service.sendEmail("umaheshreddy5@gmail.com", "Registration", "Account has been created Sucessfully..");
		ModelAndView mav = new ModelAndView();
		mav.addObject("mailsended", "conformation mail has been sended..");
		mav.setViewName("Register");
		return mav;
		
	}
	
	
	@GetMapping("/login")
	public ModelAndView loginDetails() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("loginobj", new PersonDetails());
		mav.setViewName("login");
		return mav;
		
	}	
	@PostMapping("/login")
	public ModelAndView checkLoginDetails(PersonDetails pd) {
		PersonDetails status = service.checkDetails(pd.getMailId(), pd.getPassword());
		ModelAndView mav=new ModelAndView();
		if(status !=null) {
			mav.addObject("sucess", "login sucessful..");
		}else {
			mav.addObject("error", "Invaid..");
		}
		mav.addObject("loginobj", new PersonDetails());
		mav.setViewName("login");
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

}
