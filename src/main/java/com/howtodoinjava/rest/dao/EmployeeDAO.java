package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Abhishek", "Rathore", "abrathore@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "P", "alex@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "K", "david@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        
    	 
    	return list;
    }
    
    public String getAllE() 
    {
        
    	 
    	return (10*20) + "";
    }
    
    
    public String getMultiplication(String a, String b) 
    {
       Integer  a1 = Integer.valueOf(a);
       Integer  b1 = Integer.valueOf(b);
    	return (a1*b1) + "";
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
