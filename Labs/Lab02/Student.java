/*
# FILE: Studnet.java
# USAGE: --
# DESCRIPTION: This is a class to be used in the Lab02.java file main function to
# indicate students. This will only store ID and names. If there are no inputs 
# given from the user, then a default value for student ID will be "0000000" while
# the default student name will be "Name".
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali) 
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/06/2020
REVISION: --
*/

package Lab02;

import java.util.Comparator;

// The standard public class for Student
// It contains the Student's ID and Name.

public class Student {
	
	private int ID;
	private String name;

// When called in the main function for the object, 
// Student will need an integer and a string value 
// to supply within it. Notice that if the ID value 
// is below 0 or above 10000000 there will be a default 
// ID of zeros. This goes for the Name, if the user does 
// not provide a name then the default will just be "Name"
	
	public Student(int id, String Name)
	{
		this.ID = id;
		this.name = Name;
	}
	
// A setter for the int ID
	public void setID(int ID){
		
		if(ID > 0 && ID < 10000000)
		{
			this.ID = ID;
		}
		
		else
		{
			this.ID = 0000000;
		}

	}

// A setter for the string Name 
	public void setName(String name) {
		
		if(name == null)
		{
			this.name = "Name";
		}
		else 
		{
			this.name = name;
		}
	}
	
// Getter function to fetch the ID
	public int getID()
	{
		return ID; 
	}
	
// Getter function to fetch the Name
	public String getName()
	{
		return name;
	}
	
// This is where the comparison for all the inputed students will take place. 
// this comparator will compare students based on their names first using the 
// compare function and if two students have the same name, then then they would
// be compared by their student ID instead. 
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {
		
		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getName().toUpperCase();
			String StudentName2 = s2.getName().toUpperCase();
			
			if(StudentName1.compareTo(StudentName2) == 0)
			{
				int StudentID1 = s1.getID();
				int StudentID2 = s2.getID();
				
				return StudentID1-StudentID2;
			}
			else 
			return StudentName1.compareTo(StudentName2);
					}
	};

// Print out to the screen the sorted list of input students and their corresponding
// ID, this list will be first sorted by names and if the names are the same, then
// by the ID number
	@Override 
	public String toString() {
		return "[Name = " + name + ", ID = " + ID + "]";
	}
	
}
