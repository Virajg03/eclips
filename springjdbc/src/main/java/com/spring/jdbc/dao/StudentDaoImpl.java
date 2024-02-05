package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(Student s1) {

		// insert data
		String query = "insert into student(id,name,address) values(?,?,?)";
		int r = this.jt.update(query, s1.getId(), s1.getName(), s1.getAddress());
		return r;
	}

	@Override
	public int change(Student s1) {

		// updating data
		String query = "update student set name=? , Address=?  where id=?";
		int r = this.jt.update(query, s1.getName(), s1.getAddress(), s1.getId());
		return r;
	}

	@Override
	public int delete(int id) {

		// delete data
		String query = "delete from student where id=?";
		this.jt.update(query, id);
		return 0;
	}

	@Override
	public Student getStudent(int studentId) {
		// selected single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jt.queryForObject(query, rowMapper, studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// select multiple rows
		String query = "select * from student";
		List<Student> students = this.jt.query(query, new RowMapperImpl());

		return students;
	}

}
