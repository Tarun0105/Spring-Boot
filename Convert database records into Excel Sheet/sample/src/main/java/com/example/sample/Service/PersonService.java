package com.example.sample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.Model.Persons;
import com.example.sample.Repository.PersonRepository;

@Service
public class PersonService {
	
	
	@Autowired
	private PersonRepository persrepos;
	
	
	
	
	
	
	
	public void deleteEmployeeById(int id) {
		
		
		
		persrepos.deleteById(id);
	
	}
}
