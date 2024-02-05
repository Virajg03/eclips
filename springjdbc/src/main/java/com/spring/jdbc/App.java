package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program started......");

//		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		ApplicationContext con = new AnnotationConfigApplicationContext(JdbcConfig.class);

//		JdbcTemplate template = con.getBean("jdbctemplate", JdbcTemplate.class);
//
//		String query = "insert into student(id,name,address) values(?,?,?)";
//
//		// fire query
//		int result = template.update(query, 123, "viraj", "gajera");
//		System.out.println("number of record inserted.." + result);

		StudentDao s1 = con.getBean("studentDao", StudentDao.class);

//		this is for innserting data

		/*
		 * Student student = new Student();
		 * 
		 * student.setId(244); student.setName("jaybhir");
		 * student.setAddress("Amreirrrrr");
		 * 
		 * int result = s1.insert(student);
		 * 
		 * System.out.println("sstudent added.." + result + student);
		 */

//		this is for deleted by id

		/*
		 * Student student = new Student();
		 * 
		 * student.setId(244); student.setName("jaybhai"); student.setAddress("Amreli");
		 * 
		 * int result = s1.change(student);
		 * 
		 * System.out.println("sstudent added.." + result + student);
		 */

//		this is for delete

		/*
		 * int result = s1.delete(243);
		 * 
		 * System.out.println("sstudent added.." + result);
		 */

//		this is for one select in a table  

//		Student student = s1.getStudent(222);
//		System.out.println(student);

		List<Student> students = s1.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
