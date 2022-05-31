package com.spring.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entities.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		
		//insert query
		 String query = "insert into student(id,name,city) values(?,?,?)";
		 int r = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
		 return r;	
	}
	public int change(Student student) {
		
		//update query
		String query = "update student set name =? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentId) {
		
		//delete query
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;	
	}
	public Student getStudent(int studentId) {
		//selecting single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student s = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return s;
	}
	public List<Student> getAllStudents() {
		//selecting all students
		String query = "select * from Student";
		List<Student> st = this.jdbcTemplate.query(query,new RowMapperImpl());		
		return st;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 
}
