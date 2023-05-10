package com.example.boj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boj.Model.Student;
import com.example.boj.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService studentSer;
	
	@PostMapping("/save")
	public void SaveStudent(@RequestBody Student student) {
		studentSer.addUser(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteStudent(@PathVariable int id) {
		studentSer.deleteUser(id);
	}

}
