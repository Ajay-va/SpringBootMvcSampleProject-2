package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	
	@RequestMapping("/show")
	public String showPage() {
		return "StudentRegister";
	}
	@RequestMapping("/saveall")
	public String storeDataToDatabase(@ModelAttribute Student student) {
		
		Integer id=service.saveStudent(student);
		
		return "StudentRegister";
	}
	
	
}
