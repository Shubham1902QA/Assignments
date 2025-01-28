package com.assignments;

public class ArraysAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][][] Semester=	{
				
				{
					
					{"Mathematics", "78"}, {"Physics","85"}, {"Chemistry","91"}, 
					{"Computer Programming","74"}, {"Engineering drawing","88"}, {"Basic Electrical Eng.","79"}
				},
				{
					{"Mathematics II", "82"}, {"Mechanics","77"}, {"Environmental Science","93"}, 
					{"Basics Electronics","69"}, {"Engineering Physics","84"}, {"Engineering Graphics","90"}
				},
				
				{
					
					{"Data Structure", "88"}, {"Discrete Mathematics","81"}, {"Digital Electronics","76"}, 
					{"Operating Systems","92"}, {"Signals And Systems","85"}, {"Object-Oriented programming.","78"}
				},
				{
					{"Algorithms", "91"}, {"computer networks","73"}, {"Database systems","89"}, 
					{"Micro processors ","80"}, {"Communication Engineering ","76"}, {"Software Engineering ","87"}
				},
				
				{
					{"Probability and stats ", "86"}, {"machine learning","88"}, {"Compiler design","84"}, 
					{"Theory of computation","95"}, {"Embedded Systems ","73"}, {"Computer Graphics","90"}
				},
				
				
				
				
		};
		
		System.out.println("The Subject Names in 3rd semster: "+"4th subject is " +Semester[2][3][0]+ " and 5th subject is " +Semester[2][4][0]) ;
		
		System.out.println("The Marks in 5th semester: "+"for subject "+Semester[4][2][0]+ " is "  +Semester[4][2][1]+ " and for subject "+Semester[4][5][0]+" is "  +Semester[4][5][1]);

	}

}
