package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Program is Started" );
		//spring jdbc -jdbcTemplate

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		 StudentDao sd =context.getBean("sd", StudentDao.class);
		/*  insert
		 * Student st = new Student();
		 *  st.setId(104);
		 *  st.setName("Yogesh");
		 *  st.setCity("Bangalore");
		  
		 * int result = sd.insert(st);
		 * System.out.println("student added successfully "+result);
		 
		 //update
		Student st = new Student();
		st.setId(104);
		st.setName("Ramesh");
		st.setCity("Vijayawada");
		int result = sd.change(st);
		System.out.println("data changed"+result);
		*/
		 //delete
			/*
			 * int result = sd.delete(103); System.out.println("deleted row"+result);
			 */
			/*
			 * Student s = sd.getStudent(101); System.out.println(s);
			 */
		 List<Student> st = sd.getAllStudents();
		 for(Student s:st) {
			 System.out.println(s);
		 }
	}
}