package in.mahesh.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahesh.entity.Person;
import in.mahesh.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService ps;

	@GetMapping("/person")
	public ModelAndView personDetails() {
		ModelAndView mav = new ModelAndView();
		List<Person> p = ps.personFindAll();
		
		mav.addObject("persons", p);
		mav.setViewName("index");
		return mav;
	}
	
	
	
	
	
	

}
