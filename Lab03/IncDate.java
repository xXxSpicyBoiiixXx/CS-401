/*
# FILE: IncDate.java
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

public class IncDate extends Date
{

  public IncDate(int newMonth, int newDay, int newYear)
  {
    super(newMonth, newDay, newYear);
  }
  
  // Increments this IncDate to represent the next day.
  public void increment(){
 
	int newDay = day;
	int newMonth = month;
	int newYear = year;
	day = newDay + 1;
	
	if(day == 32 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10))
	{
		day = 1;
		month = newMonth + 1;
		
	}
	
	else if(day == 32 && month == 12)
	{
		day = 1;
		month = 1;
		year = newYear + 1; 
	}
	
	else if(day == 31 && (month == 4 || month == 6 || month == 9 || month == 11))
	{
		day = 1;
		month = newMonth + 1; 
	}
	
	else if(day >= 28 && month == 2)
	{	
		if(day == 29)
		{
			day = 1;
			month = newMonth + 1;
		}
		else {
		day = 1;
		month = newMonth + 1;
		}
	}
	
  }
  
  // reduce this IncDate to represent the previous day.
  public void reduction(){
    
	    int newDay = day;
		int newMonth = month;
		int newYear = year;
		day = newDay - 1;
		
		if(day == 0 && (month == 5 || month == 7 || month == 10 || month == 12))
		{
			day = 30;
			month = newMonth - 1;
			
		}
		
		else if(day == 0 && month == 1)
		{
			day = 31;
			month = 12;
			year = newYear - 1; 
		}
		
		else if(day == 0 && (month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11))
		{
			day = 31;
			month = newMonth - 1; 
		}
		
		else if(day == 0 && month == 3)
		{	
			if(year%4 == 0 && year%100 != 0 || year%400 ==0)
			{
				day = 29;
				month = newMonth - 1;
			}
			else {
			day = 28;
			month = newMonth - 1;
			}
		}

  }
}
 