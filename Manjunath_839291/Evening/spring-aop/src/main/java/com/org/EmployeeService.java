package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	public void store()
	{
		System.out.println("store inside is Employeeesevice");
	}
	public void delete()
	
	
	
	
	{
		System.out.println("delete inside employee service");
		
		
		
	}

	
	
	
	public void getEmployee(int c)
	{
		System.out.println("THE NUMBER GIVEN "+c);
	}

public void getAllEmployees(int c,String name)
{
	System.out.println("name:"+name+" "+"num:"+c);


}


public String manju()
{
	return ":saregamapa";
}
}
