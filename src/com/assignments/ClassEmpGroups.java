package com.assignments;

public class ClassEmpGroups extends ClassObjEmployees{
	
    
	public static void main(String[] args) {
		
		//Creating empty array to store names and ids
		String []Name= new String[3];
		int [] Id= new int[3];
		
		//Creating object of ClassObjEmployees
	     ClassObjEmployees obj= new ClassEmpGroups();
		//Storing  parent class values to empty array 
		 Name = obj.EmpNames;
		 Id= obj.Ids;
		 
		 //for reference
//		 System.out.println(Name[0]);
		 
		//Printing 0th index data 
		 System.out.println("Employee Name: "+Name[0]+", "+"Employee Id: "+Id[0]);
		 
		 // Printing 1st index data
		 System.out.println("Employee Name: "+Name[1]+", "+"Employee Id: "+Id[1]);
		 // Printing 2nd index data
		 System.out.println("Employee Name: "+Name[2]+", "+"Employee Id: "+Id[2]);

	}

}
