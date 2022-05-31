package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Employee;

public class EmployeeDao {

	private HibernateTemplate  hibernateTemplate;

	//insert employee
	@Transactional
	public int insert(Employee emp) {

		//insert
		Integer i = (Integer) this.hibernateTemplate.save(emp);
		return i;	
	}
	//get the single data
	public Employee getEmployee(int id) {
		Employee emp = this.hibernateTemplate.get(Employee.class, id);
		return emp;	
	}
	//getting all data
	public List<Employee> getAllEmployees(){
		List<Employee> emps = this.hibernateTemplate.loadAll(Employee.class);
		return emps;		
	}
	//delete
	@Transactional
	public void deleteEmployee(int id){
		Employee employee = this.hibernateTemplate.get(Employee.class, id);
		this.hibernateTemplate.delete(employee);
	}
	//update
	@Transactional
	public void updateEmployee(Employee employee) {
		this.hibernateTemplate.update(employee);

	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
