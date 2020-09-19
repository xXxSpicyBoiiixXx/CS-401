/*
# FILE: Date.java
# USAGE: --
# DESCRIPTION: 
# OPTIONS: --
# REQUIREMENTS: User Input
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/13/2020
REVISION: --
*/

package Lab03;

public class Date
{
  protected int year, month, day;

  // Constructors
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
  public boolean isLeapYear(int year){
    /* 1. Filling your code here */
    if (year%4 == 0 && year%100 != 0 || year%400 ==0)
    {
      return true;
    }

    else
    {
      return false;
    }
    /* 1. End of code */
  }

  // calculate the number of days from this date to AD (1/1/0), and return the number of days. 
  // e.g. result of getDaysToAD(1,2,0) is 1.
  public int getDaysToAD(int month, int day, int year){
    /* 2. Filling your code here */
    int NumOfExtraDays;
    int NumOfDays;

    int yeartoday = year - 1;

    NumOfDays = (yeartoday*365) + day;

    if(isLeapYear(year) == true)
    {
      NumOfExtraDays = year/4;

      NumOfDays = NumOfDays + NumOfExtraDays;

      if(month == 2)
      {
        NumOfDays = NumOfDays + 31 - 1;
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
        NumOfDays = NumOfDays + 9999;
      }
      return NumOfDays;
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
        DateOutOfBoundsException();
      }
      return NumOfDays;

    }

    /* 2. End of code */
  }

  // check if this date is between two other given dates (exclusive). 
  // E.g. either 2/5/2020 of 2/15/2020 is not between 2/5/2020 and 2/15/2020
  // Hint: it might save your effort if you use the getDaysToAD function
  public boolean isBetween(int month1, int day1, int year1, int month2, int day2, int year2){
    /* 3. Filling your code here */
    int date1 = getDaysToAD(month1, day1, year1);
    int date2 = getDaysToAD(month2, day2, year2);

    if(date1 == date2) {
      return false;
    }

    else
    {
      return true;
    }
    /* 3. End of code */
  }

  // calculate the number of days from this date to an specifed date, and return the number of days.
  // E.g. 2/5/2020 to 2/15/2020 is 10; 2/15/2020 to 2/8/2020 is 7;
  // Hint: you might get help from getDaysToAD function
  public int getDaysToDate(int newMonth, int newDay, int newYear){
    /* 4. Filling your code here */


    /* 4. End of code */
  }

  // Returns this date as a String in format of month/day/year.
  public String toString(){
    return(month + "/" + day + "/" + year);
  }

  public static void main(String[] args) {
    Date d = new Date(9,12,2020);
    boolean ly = d.isLeapYear();
    int getAD = d.getDaysToAD();
    boolean iB = d.isBetween(9, 10, 2018, 9, 15, 2020);
    int dtd = d.getDaysToDate(9,14,2018);
    IncDate id = new IncDate(9,12,2020);
    id.increment(); //returns 9/13/2020
    //2/28/2020, not 3/1/2020 it should return 2/29/2020
    id.reduction(); //returns 2/11/2020

  }
}
