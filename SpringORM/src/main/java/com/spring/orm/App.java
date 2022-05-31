package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDao;
import com.spring.orm.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/ormconfig.xml");
        EmployeeDao empdao = context.getBean("ed", EmployeeDao.class);
		/*
		 * Employee emp = new Employee(101,"Kailash","Hyderabad");
		 * 
		 * int r = empdao.insert(emp); System.out.println("Done"+r);
		 */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean go = true;
        while(go) {
        System.out.println("Press 1 for add new employee");
        System.out.println("Press 2 for display all employees ");
        System.out.println("Press 3 for get detail of single employee");
        System.out.println("Press 4 for delete employee");
        System.out.println("Press 5 for update employee");
        System.out.println("Press 6 for exit");
        
        try {
        	 int input = Integer.parseInt(br.readLine());
        	 
        	 switch (input) {
        	 
			case 1:
				//add a new employee
				System.out.println("enter user id:");
				int uid = Integer.parseInt(br.readLine());
				
				System.out.println("enter user name:");
				String uName = br.readLine();
				
				System.out.println("enter user city:");
				String uCity = br.readLine();
				
				//creating employee object and setting values
				Employee e = new Employee();
				e.setId(uid);
				e.setName(uName);
				e.setCity(uCity);
				
				//saving employee object
				int result = empdao.insert(e);
				System.out.println("Employee added" +result);
				System.out.println("------------------------------------------");
				System.out.println();
				
				break;
				
			case 2:
				//display all employee
				System.out.println("-------------------------------------------");
				List<Employee> allEmployees = empdao.getAllEmployees();
				for(Employee emp:allEmployees) {
					System.out.println("Name" +emp.getName());
					System.out.println("Id" +emp.getId());
					System.out.println("City" +emp.getCity());
					System.out.println("-------------------------------------------");
				}
				System.out.println("-------------------------------------------");
				break;
				
			case 3:
				//get single employee
				
				System.out.println("enter user id:");
				int userid = Integer.parseInt(br.readLine());
				Employee employee = empdao.getEmployee(userid);
				System.out.println("Name" +employee.getName());
				System.out.println("Id" +employee.getId());
				System.out.println("City" +employee.getCity());
				System.out.println("-------------------------------------------");
								
				break;
				
			case 4:
				//delete employee
				
				System.out.println("enter user id:");
				int id = Integer.parseInt(br.readLine());
				empdao.deleteEmployee(id);
				System.out.println("delete employee");
				break;
				
			case 5:
				//update employee
				Employee em = new Employee();
				em.setId(104);
				em.setName("Ramesh");
				em.setCity("Vijayawada");
				 empdao.updateEmployee(em);
				System.out.println("data updated");
				break;
				
			case 6:
				go = false;
				break;

			default:
				break;
			}
        	
        }
        catch(Exception e) {
        	System.out.println("Invalid input try with another");
        	System.out.println(e.getMessage());
        }
        }   
        System.out.println("thankyou");
        System.out.println("See you again");
    }
}
