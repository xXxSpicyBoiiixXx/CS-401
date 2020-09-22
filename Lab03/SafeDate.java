/*
# FILE: SafeDate.java
# USAGE: --
# DESCRIPTION: 
# OPTIONS: --
# REQUIREMENTS: User Input
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.3
# CREATED: 09/13/2020
REVISION: --
*/

package Lab03;

public class SafeDate extends Date
{
	
	// Global Constants
	public static class Global{
		public static int MINYEAR = 0;
		public static int MINDAY = 1;
		public static int MINMONTH = 1;
		
		public static int MAXDAY = 31;
		public static int MAXMONTH = 12;
	}
	
// Checks for an invalid inputs
  public SafeDate(int newMonth, int newDay, int newYear) throws DateOutOfBoundsException
  {	

	  if(newMonth < Global.MINMONTH || newMonth > Global.MAXMONTH)
	  {
		  throw new DateOutOfBoundsException("ERROR: Month " + newMonth + " is invalid.");
	  }
	  
	  else 
	  {
		  month = newMonth;
	  }
	  
	  if(newDay < Global.MINDAY || newDay > Global.MAXDAY)
	  {
		  throw new DateOutOfBoundsException("ERROR: Day " + newDay + " is invalid");
	  }
	  else if(newDay >= Global.MAXDAY && (newMonth == 2 || newMonth == 4 || newMonth == 6 || newMonth == 9 || newMonth == 11))
	  {
		  throw new DateOutOfBoundsException("ERROR: In this Month the Day " + newDay + " is invalid");
	  }
	  else if(newMonth == 2 && isLeapYear(newYear) == true && newDay > 29)
	  {
		  throw new DateOutOfBoundsException("ERROR: In Feburary (Leap Year) you can't have " + newDay);
	  }
	  else if (newMonth == 2 && isLeapYear(newYear) == false && newDay > 28)
	  {
		  throw new DateOutOfBoundsException("ERROR: In Feburary (Non-Leap Year) you can't have " + newDay);
	  }
	  else 
	  {
		  day = newDay;
	  }
	  
	  if (newYear < Global.MINYEAR)
	  {
		  throw new DateOutOfBoundsException("ERROR: Year " + newYear + " is invalid.");
	  }
	  
	  else
	  {
		  year = newYear;
	  }
  }

}

 