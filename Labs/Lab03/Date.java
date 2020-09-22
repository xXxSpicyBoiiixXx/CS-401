/*
# FILE: Date.java
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

public class Date
{
  protected int year, month, day;

  // Constructors
  public Date()
  {
	  
  }
  public Date(int newMonth, int newDay, int newYear)
  {
    month = newMonth;  day = newDay;  year = newYear;
   }

  // Observers
  public int getYear() { 
	return year;  
  }
  public int getMonth(){ 
	return month; 
  }
  public int getDay(){ 
	return day;
  }
  
 // This function will check if the given year is a leap year. If it is indeed a leap year, this will return a value of true, if not it will be false.
  public boolean isLeapYear(int year){
	  if (year%4 == 0 && year%100 != 0 || year%400 ==0)
	  {
		return true;  
	  }
	  
	  else
	  {
		  return false; 
	  }

  }
  
 // This function will calculate the number of days from this date to AD (1/1/0), and return the number of days.
  public int getDaysToAD(int month, int day, int year){
	  
	int NumOfExtraDays;
	int NumOfDays;
	
	int yeartoday = year;
	
	NumOfDays = day;
	
	if(yeartoday == 0) {
	NumOfDays = NumOfDays + (yeartoday*365);
	}
	
	else {
		yeartoday = yeartoday - 1;
		NumOfDays = NumOfDays + (yeartoday*365);
	}
	
	if(isLeapYear(year) == true)
	{
		NumOfExtraDays = year/4; 
		
		NumOfDays = NumOfDays + NumOfExtraDays;
		
		if(month == 2)
		{
			NumOfDays = NumOfDays + 31;
		}
		
		else if(month == 3)
		{
			NumOfDays = NumOfDays + 59;
		}
		
		else if(month == 4)
		{
			NumOfDays = NumOfDays + 90;
		}
		
		else if(month == 5)
		{
			NumOfDays = NumOfDays + 120;
		}
		
		else if(month == 6)
		{
			NumOfDays = NumOfDays + 151; 
		}
		
		else if(month == 7)
		{
			NumOfDays = NumOfDays + 181;
		}
		
		else if(month == 8)
		{
			NumOfDays = NumOfDays + 212;
		}
		
		else if(month == 9)
		{
			NumOfDays = NumOfDays + 243;
		}
		
		else if(month == 10)
		{
			NumOfDays = NumOfDays + 273;
		}
		
		else if(month == 11)
		{
			NumOfDays = NumOfDays + 304;
		}
		
		else if(month == 12)
		{
			NumOfDays = NumOfDays + 334;
		}
		else
		{
			NumOfDays = NumOfDays + 0;
		}

	}
	
	else
	{
		if(month == 2)
		{
			NumOfDays = NumOfDays + 31;
		}
		
		else if(month == 3)
		{
			NumOfDays = NumOfDays + 59;
		}
		
		else if(month == 4)
		{
			NumOfDays = NumOfDays + 90;
		}
		
		else if(month == 5)
		{
			NumOfDays = NumOfDays + 120;
		}
		
		else if(month == 6)
		{
			NumOfDays = NumOfDays + 151; 
		}
		
		else if(month == 7)
		{
			NumOfDays = NumOfDays + 181;
		}
		
		else if(month == 8)
		{
			NumOfDays = NumOfDays + 212;
		}
		
		else if(month == 9)
		{
			NumOfDays = NumOfDays + 243;
		}
		
		else if(month == 10)
		{
			NumOfDays = NumOfDays + 273;
		}
		
		else if(month == 11)
		{
			NumOfDays = NumOfDays + 304;
		}
		
		else if(month == 12)
		{
			NumOfDays = NumOfDays + 334;
		}
		else 
		{
			NumOfDays = NumOfDays + 0;
		}
		
	}
	
	return NumOfDays;
  }
  
 // This function checks if the user inputed date is between two other given from the user dates (exclusive). This will return true if it is and false if it is not. 
  public boolean isBetween(int month1, int day1, int year1, int month2, int day2, int year2){
	  int date1 = getDaysToAD(month1, day1, year1);
	  int date2 = getDaysToAD(month2, day2, year2);
	  
	  Date input_date = new Date(getMonth(),getDay(),getYear());
	  
	  int date3 = getDaysToAD(input_date.month, input_date.day, input_date.year);
	  
	  if(date1 >= date3 || date2 <= date3) {
		return false;
	  }
	  
	  else
	  {
		  return true;
	  }
  }
  
// This function calculates the number of days from the user inputed date to another user inputted date, and return the number of days.
  public int getDaysToDate(int newMonth, int newDay, int newYear){
	  
	  int diff_date;
	  
	  int compare_date = getDaysToAD(newMonth, newDay, newYear);
	  
	  Date input_date = new Date(getMonth(),getDay(),getYear());
	  
	  int compare_input = getDaysToAD(input_date.month, input_date.day, input_date.year);
	  
	  diff_date = Math.abs(compare_input - compare_date);
	  
	  return diff_date;

  }
  
// Returns this date as a String in format of month/day/year.
  public String toString(){
	return(month + "/" + day + "/" + year);
  }
  
}
