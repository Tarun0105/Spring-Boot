package com.example.boj.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boj.Model.Student;
import com.example.boj.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
//	ADDING DATAS IN DATABASE
	public Student addUser(Student student) {
		return studentRepo.save(student);
	}
	
//  GETTING USER FROM DATABASE
	public List<Student> getUsers() {
		List<Student> student = studentRepo.findAll();
		System.out.println("Getting data from DB : " + student);
		return student;
	}
	
//	DELETE USERS
	public void deleteUser(int id) {
		studentRepo.deleteById(id);
	}
}
