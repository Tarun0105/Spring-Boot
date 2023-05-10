package com.example.boj;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import com.example.boj.Model.Student;
import com.example.boj.Repository.StudentRepository;
import com.example.boj.Service.StudentService;



@DataJpaTest
class StudentDetailsApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;
	

	
	
	
	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveStudentTest1() {
		System.out.println("Test no.1");
		Student student=new Student(101,"tarun@gmail.com","chennai");
		System.out.println(student.getId());
		studentRepo.save(student);
		assertThat(student.getId()).isGreaterThan(0);
	}
	
	@Test
	@Order(2)
	@Rollback(value = false)
	public void getStudentTest2() {
		System.out.println("Test no.2");
		Student student=studentRepo.findById(101).get();
		System.out.println(student.getemail());
		assertThat(student.getId()).isEqualTo(101);
	}
		
	
	@Test
	@Order(3)
	@Rollback(value = false)
	public void deleteUserTest() {
		
		Student student = studentRepo.findById(101).get();
		studentRepo.delete(student);
		
		Student student1=null;
		Optional<Student> optionstud=studentRepo.findByEmail("tarun@gmail.com");
		
		 if(optionstud.isPresent()){
	            student1 = optionstud.get();
	        }

	        assertThat(student1).isNull();
		
	}
	
//	@Test
//	public void saveStudentTest4() {
//		System.out.println("Test no.4");
//	}
//	
//	@Test
//	public void saveStudentTest5() {
//		System.out.println("Test no.5");
//	}
//	@AfterEach
//	public  void onTearDown() {
//		System.out.println("After is called");
//	}
//	
	


}
