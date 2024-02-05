package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student s1);

	public int change(Student s1);

	public int delete(int id);

	public Student getStudent(int studentId);

	public List<Student> getAllStudents();
}
