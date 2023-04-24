package com.example.sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sample.Model.Persons;
import com.example.sample.Repository.PersonRepository;
import com.example.sample.Service.PersonService;


@Controller
public class NewPersonController {
	
	@Autowired
	private PersonService perser;
	
	
	
	@RequestMapping("/")
	public String showform() {
		
		return "NewPerson";		
	}
	
	@RequestMapping("/DeletePerson")
	public String showdeleteform() {
		return "DeletePerson";
	}
	
//	@GetMapping("/excel")
//	public void deleteEmployee(@RequestParam("id") int id) {
//	   perser.deleteEmployeeById(id);
//	}
}
