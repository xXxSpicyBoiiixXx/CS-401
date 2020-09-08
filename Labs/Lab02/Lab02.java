/*
# FILE: Lab02.java
# USAGE: --
# DESCRIPTION: This program will take user input of Studnet's Name and ID. From there it will sort
# the students alphabetically first and if a student has the same name, then by ID. This will be 
# printed immediately after the information has been collected from the user.
# OPTIONS: --
# REQUIREMENTS: User Input
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/06/2020
REVISION: --
*/

package Lab02;

import java.util.*;

public class Lab02 {
	
	public static void main(String args[]) {
	
	// New List of class Students
	List<Student> StudentList = new ArrayList<Student>();
	
	// Menu if the user will want to input students ID and Name
	System.out.println("Welcome! This program will allow you to input student's ID and Name");
	System.out.println("Afterwards, the program will sort the students first by names and then ID");
	System.out.println("Would you like to input a student? (Y/N)");
	
	// Scanner function to be used to take user input
	Scanner in = new Scanner(System.in);
	Scanner number = new Scanner(System.in);
	Scanner Name = new Scanner(System.in);
	
	// Answer weather the user will be entering the program
	String ans = in.nextLine(); 
	
	// If user decides to exit the program
	if(ans.compareTo("N") == 0 || ans.compareTo("n") == 0 || ans.compareTo("No") == 0 || ans.compareTo("no") == 0)
	{
		System.out.println("You have successfully exited the program");
		System.out.println("Thank you and have a nice day.");
		in.close();
	}
	
	// Displays if the user has entered an invalid input
	while(ans.compareTo("N") != 0 && ans.compareTo("n") != 0 && ans.compareTo("Y") != 0 && ans.compareTo("y") != 0 && ans.compareTo("No") != 0 && ans.compareTo("no") != 0 && ans.compareTo("Yes") != 0 && ans.compareTo("yes") != 0)
	{	
		
		System.out.println("Please enter a valid input.");
		System.out.println("Your input: "+ans);
		System.out.println("Example <N>; <n>; <Y>; <y>; <No>; <no>; <Yes>; <yes>");
		
		ans = in.nextLine();
		
	}
	
	// Displays if a valid input of the following are entered: <y> <Y> <Yes> <yes>
	while(ans.compareTo("Y") == 0 || ans.compareTo("y") == 0 || ans.compareTo("Yes") == 0 || ans.compareTo("yes") == 0)
	{
	int id;
	String name;
	
	System.out.println("Please input the Student's ID");
	
	id = number.nextInt();

	System.out.println("Please input the Student's Name");
	
	name = Name.nextLine();
	
	
	StudentList.add(new Student(id, name));
	
	System.out.println("Would you like to add another student?");
	
	ans = in.nextLine();
	
	// Breaks the loop if an input of the following are entered: <N> <n> <No> <no>
	if(ans.compareTo("N") == 0 || ans.compareTo("n") == 0 || ans.compareTo("No") == 0 || ans.compareTo("no") == 0)
	{	
		break;
	}
	
	// Displays if the user has entered an invalid input
	while(ans.compareTo("Y") != 0 && ans.compareTo("y") != 0 && ans.compareTo("Yes") != 0 && ans.compareTo("yes") != 0)
	{	
		
		System.out.println("Please enter a valid input.");
		System.out.println("Your input: "+ans);
		System.out.println("Example <N>; <n>; <Y>; <y>; <No>; <no>; <Yes>; <yes>");
		
		ans = in.nextLine();
		
	}
		
	}
	
	// Close all scanners
	in.close();
	number.close();
	Name.close();
	
	
	// Sort the students by name and ID
	Collections.sort(StudentList, Student.StuNameComparator);
	
	// Prints the sorted results from the user input
	for(Student str: StudentList) {
		System.out.println(str);
	}

	}
}



