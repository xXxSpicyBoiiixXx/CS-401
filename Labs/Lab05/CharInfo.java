/*
# FILE: CharInfo.java
# USAGE: --
# DESCRIPTION: Gives information of our stack. This will be in string even though the assignment requested for characters.
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/05/2020
REVISION: --
*/


package Lab05;

public class CharInfo {
	
	private String info;
	
	// Information of the character/string 
	public CharInfo(String inf)
	{
		this.info = inf;
	}

	// Gets the information
	public String getInfo() {
		return this.info;
	}
	
	// Prints the information 
	public String toString() {
		return this.info;
	}
}
