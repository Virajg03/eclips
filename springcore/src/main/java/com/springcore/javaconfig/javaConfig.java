package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaConfig {

	public Samosa getSamosa() {
		Samosa s1 = new Samosa();
		return s1;
	}

	@Bean(name = { "viraj", "gajera" })
	public Student getStudent() {
		// creating a new student
		Student student = new Student(getSamosa());
		return student;
	}
}
