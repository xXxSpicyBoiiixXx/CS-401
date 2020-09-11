public class Date
{
  protected int year, month, day;

  // Constructor
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
  
  
  // return true if this year is a leap year, otherwise, return false
  // Hint:
  // The year is a leap year if:
  // The year can be evenly divided by 4;
  // If the year can be evenly divided by 100, it is NOT a leap year, unless;
  // The year is also evenly divisible by 400. Then it is a leap year. 
  public boolean isLeapYear(){
	/* 1. Filling your code here */

	/* 1. End of code */
  }
  
  // calculate the number of days from this date to AD (1/1/0), and return the number of days. 
  // e.g. result of getDaysToAD(1,2,0) is 1.
  public int getDaysToAD(){
	/* 2. Filling your code here */
	
	/* 2. End of code */
  }
  
  // check if this date is between two other given dates (exclusive). 
  // E.g. either 2/5/2020 of 2/15/2020 is not between 2/5/2020 and 2/15/2020
  // Hint: it might save your effort if you use the getDaysToAD function
  public boolean isBetween(int month1, int day1, int year1, int month2, int day2, int year2){
	/* 3. Filling your code here */
	
	/* 3. End of code */
  }
  
  // calculate the number of days from this date to an specifed date, and return the number of days.
  // E.g. 2/5/2020 to 2/15/2020 is 10; 2/15/2020 to 2/8/2020 is 7;
  // Hint: you might get help from getDaysToAD function
  public int getDaysToDate(int newMonth, int newDay, int newYear){
	/* 4. Filling your code here */
	
	/* 4. End of code */
  }
  
  // Returns this date as a String in formate of month/day/year. E.g. 02/05/2020
  public String toString(){
	return(month + "/" + day + "/" + year);
  }
}
