package com.example.boj.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	private int cid;
	private String cname;
	private String ctech;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtech() {
		return ctech;
	}
	public void setCtech(String ctech) {
		this.ctech = ctech;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ctech=" + ctech + "]";
	}
	public Course(int cid, String cname, String ctech) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctech = ctech;
	}
	
	
	public Course() {
		
	}
}
