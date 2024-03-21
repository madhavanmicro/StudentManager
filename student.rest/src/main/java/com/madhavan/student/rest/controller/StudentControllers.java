package com.madhavan.student.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.madhavan.student.rest.model.Student;
import com.madhavan.student.rest.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentControllers {

	@Autowired
	StudentService service;

	
	//Default home page
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}

	
	//It gives response as Student object after the student object insertion
	@ResponseBody
	@PostMapping("/add")
	public Student addStudent(Student s) {

		service.add(s);
		return s;
	}

	//It gives response as List of all the student Objects.
	@ResponseBody
	@GetMapping("/getAll")
	public List<Student> getAll() {
		return service.getAll(); 
	}
	
	
	//It gives responses as Student object of particular id
	@ResponseBody
	@GetMapping("/get/{id}")
	public Student get(@PathVariable("id") Integer id) {
		return service.getById(id);
	}

	//It updates the student object and returns the Updated Student Object
	@ResponseBody
	@PutMapping("/update")
	public Student modify(Student s) {

		service.add(s);
		return s;

	}
	
		
	//It removes the student object
	@ResponseBody
	@DeleteMapping("/remove/{id}")
	public String remove(@PathVariable("id") Integer id) {
		service.remove(id);
		System.out.println("removed"+id);
		return "removed "+id;
	}
	
	

}
