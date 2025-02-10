package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssignmentOnCollectionAssign4 {
	//Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using HashMap to store employee detail 1
		Map<String,String> EmpDetails1= new HashMap<String,String>(); 
		EmpDetails1.put("Employee ID","E001");
		EmpDetails1.put("Name","Alice Green");
		EmpDetails1.put("Age","30");
		EmpDetails1.put("Gender","Female");
		EmpDetails1.put("Department","Engineering");
		EmpDetails1.put("Position","Software Engineer");
		EmpDetails1.put("Salary","75,000");
		EmpDetails1.put("Email","alice@example.com");
		EmpDetails1.put("Contact Number","9876543213");
		System.out.println("Employee 1 details :-"+EmpDetails1);
		
		//using HashMap to store employee detail 2
		Map<String,String> EmpDetails2= new HashMap<String,String>();
		
		EmpDetails2.put("Employee ID", "E002");
		EmpDetails2.put("Name", "Bob Johnson");
		EmpDetails2.put("Age", "35");
		EmpDetails2.put("Gender", "Male");
		EmpDetails2.put("Department", "Marketing");
		EmpDetails2.put("Position", "Marketing Manager");
		EmpDetails2.put("Salary ", "85000");
		EmpDetails2.put("Email", "bob@example.com");
		EmpDetails2.put("Contact Number ", "9876543214");
		System.out.println("Employee 2 details :-" +EmpDetails2);
		
		//using HashMap to store employee detail 3
		Map<String,String> EmpDetails3= new HashMap<String,String>();
		EmpDetails3.put("Employee ID", "E003");
		EmpDetails3.put("Name", "Carol White");
		EmpDetails3.put("Age", "28");
		EmpDetails3.put("Gender", "Female");
		EmpDetails3.put("Department", "Sales");
		EmpDetails3.put("Position", "Sales Executive");
		EmpDetails3.put("Salary", "65000");
		EmpDetails3.put("Email", "carol@example.com");
		EmpDetails3.put("Contact Number ", "9876543215");
		System.out.println("Employee 3 details :-" +EmpDetails3);
		
		//Storing all the rows into an array using array list
		List<Map<String,String>> abc= new ArrayList<Map<String,String>>();
		abc.add(EmpDetails1);
		abc.add(EmpDetails2);
		abc.add(EmpDetails3);
		
		//Printing the desired email
		System.out.println(abc.get(1).get("Email")); 
		
		
		
		
		
		
		
		
	}

}
