package com.olive.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.olive.model.Student;
@Controller
public class StudentController {

	@GetMapping("/")
	public String info() {
	
		return "registration";
	}
	
	@PostMapping("/std")
	public String fetchData(@ModelAttribute Student std , Model model) {
		/*
		 * Reading the form data and showing on web page
		 */
		
		 
		
		
		
		List<Student> list=Arrays.asList(
				new Student(10, "Ravi","JAVA", "AMEERpet"),
				new Student(20, "Ravi Kumar","JAVA", "AMEERpet"),
				new Student(30, "Ravi Singh","JAVA", "AMEERpet")
				                    
				);
				
				
		 model.addAttribute("std",std);	
	     model.addAttribute("list", list);
	     
		System.out.println("Hitting  fetch() method..........");
		return "home";
	}
	

}
