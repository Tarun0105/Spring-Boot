package com.example.boj.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private int id;
	private String email;
	private String city;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String email, String city) {
		super();
		this.id = id;
		this.email = email;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", city=" + city + "]";
	}
	
	public Student() {
		
	}

}
