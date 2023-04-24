package com.example.sample.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persons")
public class Persons {
	
	@Id
	private int id;
	
	private String name;
	private String City;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
	
	public Persons(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}
	
	
	public Persons() {
		
		
	}
	
	
	
	

	

}
