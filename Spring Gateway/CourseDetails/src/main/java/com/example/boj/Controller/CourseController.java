package com.example.boj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boj.Model.Course;
import com.example.boj.Repository.CourseRepository;

@RestController
@RequestMapping("/Course")
public class CourseController {
	
	@Autowired
	private CourseRepository  courseRepo;
	
	@PostMapping("/save")
	public void SaveCourse(@RequestBody Course course) {
		courseRepo.save(course);
	}

	@DeleteMapping("/delete/{id}")
	public void DeleteCourse(@PathVariable int id) {
		courseRepo.deleteById(id);
	}
}
