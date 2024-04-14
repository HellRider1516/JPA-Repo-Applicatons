package in.mahesh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.mahesh.entity.Student;
@Controller
@ResponseBody
public class StudentController {
	

	@GetMapping("/jackson")
	public List<Student> getDetails(){
		ArrayList<Student> al= new ArrayList<>();
		al.add(new Student("Uppadi","Mahesh","mahesh@gmail.com"));
		al.add(new Student("Rajesh","raj","Rajesh@gmail.com"));
		al.add(new Student("dud","liyaz","liyaz@gmail.com"));
		al.add(new Student("k","satish","satish@gmail.com"));
		return al;
	}

}
