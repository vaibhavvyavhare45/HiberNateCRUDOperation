package com.prowings.hibernateopra;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id

	private int id;
	private String name;
	private int std;
	
	
	
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, int std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}

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
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
	
	
	

}
