package in.mahesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mahesh.Entity.EnquiryDetails;
import in.mahesh.Entity.Registration;
import in.mahesh.Service.ServiceClass;

@Controller
public class ControllerClass {
	
	@Autowired
	private ServiceClass service;
	
	@GetMapping("/login")
	public String loadLoginDetails(Model model) {
		model.addAttribute("loginObj", new Registration());
		return "login";
	}
	
	@PostMapping("/login")
	public String handleLoginDetails(Model model , Registration r) {
		List<Registration> checkLogindetails = service.checkLogindetails(r.getEmail(), r.getPassword());
		if(checkLogindetails != null) {
			model.addAttribute("loginObj", " This is Your Dashboard");
			return "dashboard";
		}else {
			model.addAttribute("error", "Invaild Login Creditals");
			return "login";
		}
		
	}
	
	
	@GetMapping("/Registration")
	public String loadregistrationDetails(Model model) {
		model.addAttribute("regObj", new Registration());
		return "Registration";
	}
	
	@PostMapping("/Registration")
	public String handleregistrationDetails(Model model , Registration r) {
		Optional<Registration> mailExsitOrNot = service.mailExsitOrNot(r.getEmail());
		if(mailExsitOrNot.isPresent()) {
			model.addAttribute("presentObj", "Account already exsist plz try with another Account");
			model.addAttribute("regObj", new Registration());
			return "Registration";
		}
		boolean status = service.saveRegistrationDetails(r);
		if(status) {
			model.addAttribute("sucess", "Account has been Created..");
			model.addAttribute("regObj", new Registration());
			return "Registration";
		}else {
			model.addAttribute("error", "Invaild Creditals");
			model.addAttribute("regObj", new Registration());
			return "Registration";
		}
		
	}
	
	@GetMapping("/enquiry")
	public String loadEnquiryDetails(Model model) {
		model.addAttribute("EnquiryObj",new EnquiryDetails());
		return "Enquiry";
	}
	
	@PostMapping("/enquiry")
	public String handleEnquiryDetails(Model model , EnquiryDetails e) {
		boolean status = service.saveEnquiryDetailsDetails(e);
		if(status) {
			model.addAttribute("sucess","Details Register Sucessfully ......");
			model.addAttribute("EnquiryObj",new EnquiryDetails());
			return "Enquiry";
		}else {
			model.addAttribute("error","Invaild Students Details..");
			model.addAttribute("EnquiryObj",new EnquiryDetails());
			return "Enquiry";
		}
	}
	
	
	@GetMapping("/view")
	public String getAllDetails(Model model) {
		model.addAttribute("viewObj", new EnquiryDetails());
		return "details";
	}
	
	@PostMapping("/view")
	public String getFilterDetails(EnquiryDetails e , Model model) {
		e.setStatus(e.getStatus());
		e.setCourse(e.getCourse());
		e.setClassMode(e.getClassMode());
		List<EnquiryDetails> list = service.viewAllDetails(e);
		if(list != null) {
			model.addAttribute("sucess", list);
			model.addAttribute("viewObj", new EnquiryDetails());
			return "details";
		}else {
			model.addAttribute("error", "Invaild Filters");
			model.addAttribute("viewObj", new EnquiryDetails());
			return "details";
		}
		
	}
	
	
	
	
	@GetMapping("/dashboard")
	public String dashboardDetails(Model model , EnquiryDetails e) {
		model.addAttribute("dashboardObj", service.countDetails(e));
		return "dashboard";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
