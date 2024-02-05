package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // entity name change.. (name = "student_details")
//@Table // table name we can create by that name.. (name="mystudents")
public class Student {

	@Id
	private int id;

	private String name;

	private String city;

	public Student(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	private Certificate certi;

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
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.id + this.name + this.city;
	}

}
