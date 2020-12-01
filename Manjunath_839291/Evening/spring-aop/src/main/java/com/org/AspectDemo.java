package com.org;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {
	

@After("execution(public * com.org.EmployeeService.s*(..))")
	//@After("execution(public * com.org.EmployeeService.s*(int))")
	
	
	
	
	//@After("execution(public * com.org.EmployeeService.*(int,*))")
	//@After("execution(public * com.org.EmployeeService.*(int,String))")



public void log()
{
		System.out.println("---log method is executede");
}
}
