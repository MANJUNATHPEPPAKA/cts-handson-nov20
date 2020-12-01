package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service=(EmployeeService) context.getBean("employeeService");
		service.delete();
		service.getEmployee(3);	

		service.getAllEmployees(3,"man");

		service.store();
		service.manju();
	}

}
