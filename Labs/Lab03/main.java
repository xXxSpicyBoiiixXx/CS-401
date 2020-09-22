/*
# FILE: main.java
# USAGE: --
# DESCRIPTION: Main area of where to run the actual program with all the other four files.
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

import java.util.Scanner; // For user inputs

public class main {
	
	 public static void main(String[] args) {		
		 
		int month, 
			day,
		  	year,
		  	option;
		
		// Checks for bad dates 
		SafeDate theDate;
		
		// User inputted values
		Date inputDate;
		
		int NumOfDays;
		
		boolean Good_Date = false;
		
		Scanner input = new Scanner(System.in);
		Scanner menu_input = new Scanner(System.in);
		
		// Need to hit enter each time. 
		System.out.println("Enter a date (MM/DD/YYYY): ");
		
		month = input.nextInt();
		day = input.nextInt();
		year = input.nextInt();
		
		inputDate = new Date(month,day,year);
		
		IncDate DaybyDay = new IncDate(month,day,year);
		
		while(!Good_Date) {	
		
		try
		{
			theDate = new SafeDate(month, day, year);
			Good_Date = true;
			System.out.println(theDate.toString() + " is valid. You may continue");
		}
		
		catch(DateOutOfBoundsException DateOBExcept)
		{
			System.out.println(DateOBExcept.getMessage() + "\n");
			System.out.println("Enter a date (MM/DD/YYYY): ");
			
			month = input.nextInt();
			day = input.nextInt();
			year = input.nextInt();	
		}
		
		}
		
		
		// Menu of program
		
		System.out.println("Welcome! This program will allow you to do various things.");
		System.out.println("You can find many things about certain dates!");
		System.out.println("Please select an option below. \n");
		
		System.out.println("[0] See if the given year is a in fact a leap year");
		System.out.println("[1] Days since 1/1/0 AD");
		System.out.println("[2] Check if inputed date is between two other given dates");
		System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
		System.out.println("[4] Incriement inputted date by one day");
		System.out.println("[5] Reduce inputted date by one day");
		System.out.println("[6] To exit program \n");
		
		option = menu_input.nextInt();
		
		// If any other input is placed in, this will exit the program as well.
		while(option != 6)
		{ 	
			// Checks if the given year is a leap year
			if(option == 0)
			{
				boolean leap_year;
				
				leap_year = inputDate.isLeapYear(year);
				
				if(leap_year == true)
				{
					System.out.println("The year "+ inputDate.getYear() + " is a leap year");
					System.out.println("Please choose an option below \n");
				}
				
				else
				{
					System.out.println("The year "+ inputDate.getYear() + " is NOT a leap year");
					System.out.println("Please choose an option below \n");
				}
				
				System.out.println("[0] See if the given year is a in fact a leap year");
				System.out.println("[1] Days since 1/1/0 AD");
				System.out.println("[2] Check if inputed date is between two other given dates");
				System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
				System.out.println("[4] Incriement inputted date by one day");
				System.out.println("[5] Reduce inputted date by one day");
				System.out.println("[6] To exit program \n");
				
				option = menu_input.nextInt();
			}
			
			// Get the days from AD for the given date
			else if (option == 1)
			{	
				NumOfDays = inputDate.getDaysToAD(month, day, year);
				
				System.out.println("There are " + NumOfDays + " from 1/1/0 AD");
				System.out.println("Please choose an option below \n");
				
				System.out.println("[0] See if the given year is a in fact a leap year");
				System.out.println("[1] Days since 1/1/0 AD");
				System.out.println("[2] Check if inputed date is between two other given dates");
				System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
				System.out.println("[4] Incriement inputted date by one day");
				System.out.println("[5] Reduce inputted date by one day");
				System.out.println("[6] To exit program \n");
				
				NumOfDays = 0;
				
				option = menu_input.nextInt();
			}
			
			// Check if the given date is in between two other dates
			else if(option == 2)
			{	
				System.out.println("Please eneter two dates to check if it is in between the two dates.");
				System.out.println("In this order \n");
				System.out.println("1st month, 1st day, 1st year, 2nd month, 2nd day, 2nd year \n");
				
				int month1,
					day1,
					year1,
					month2,
					day2,
					year2;
				
				boolean inBetween;
				
				System.out.println("Please enter the first month to be comapred to inputed date");
				month1 = input.nextInt();
				
				System.out.println("Please enter the first day to be comapred to inputed date");
				day1 = input.nextInt();
				
				System.out.println("Please enter the first year to be comapred to inputed date");
				year1 = input.nextInt();
				
				System.out.println("Please enter the second month to be comapred to inputed date");
				month2 = input.nextInt();
				
				System.out.println("Please enter the second day to be comapred to inputed date");
				day2 = input.nextInt();
				
				System.out.print("Please enter the second year to be comapred to inputed date \n");
				year2 = input.nextInt();
				
				
				inBetween = inputDate.isBetween(month1, day1, year1, month2, day2, year2);
				
				if(inBetween == true)
				{
					System.out.println("The date " + inputDate.toString() + " is in fact between " + month1 + "/" + day1 + "/" + year1 + " and " + month2 + "/" + day2 + "/" + year2 + "\n");
				}
				
				else 
				{
					System.out.println("The date " + inputDate.toString() + " is not in between " + month1 + "/" + day1 + "/" + year1 + " and " + month2 + "/" + day2 + "/" + year2 + "\n");
				}
				
				System.out.println("Please choose an option below \n");
				
				System.out.println("[0] See if the given year is a in fact a leap year");
				System.out.println("[1] Days since 1/1/0 AD");
				System.out.println("[2] Check if inputed date is between two other given dates");
				System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
				System.out.println("[4] Incriement inputted date by one day");
				System.out.println("[5] Reduce inputted date by one day");
				System.out.println("[6] To exit program \n");
				
				option = menu_input.nextInt();
			}
			
			// Checks how many days are from a user specified date.
			else if(option == 3)
			{
				System.out.println("Please eneter a date to check how many days are between your inputted date and this one");
				
				int diff_month,
					diff_day,
					diff_year;
				
				int result;
				System.out.println("Please enter the month to be comapred to inputed date");
				diff_month = input.nextInt();
				
				System.out.println("Please enter the day to be comapred to inputed date");
				diff_day = input.nextInt();
				
				System.out.println("Please enter the year to be comapred to inputed date");
				diff_year = input.nextInt();
				
				result = inputDate.getDaysToDate(diff_month, diff_day, diff_year);
				
				System.out.println("There are "+ result + " days in between these dates. \n");
				
				
				System.out.println("Please choose an option below \n");
				
				System.out.println("[0] See if the given year is a in fact a leap year");
				System.out.println("[1] Days since 1/1/0 AD");
				System.out.println("[2] Check if inputed date is between two other given dates");
				System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
				System.out.println("[4] Incriement inputted date by one day");
				System.out.println("[5] Reduce inputted date by one day");
				System.out.println("[6] To exit program \n");
				
				option = menu_input.nextInt();
			}
			
			// Increase the day by one
			else if(option == 4)
	
			{
				
				DaybyDay.increment();
			
				System.out.println("Your new date is " + DaybyDay.toString() + "\n");
				
				System.out.println("Please choose an option below \n");
				
				System.out.println("[0] See if the given year is a in fact a leap year");
				System.out.println("[1] Days since 1/1/0 AD");
				System.out.println("[2] Check if inputed date is between two other given dates");
				System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
				System.out.println("[4] Incriement inputted date by one day");
				System.out.println("[5] Reduce inputted date by one day");
				System.out.println("[6] To exit program \n");
				
				option = menu_input.nextInt();
				
			}
			
			// Reduce the day by one
			else if(option == 5)
			{	
				DaybyDay.reduction();
				
				System.out.println("Your new date is " + DaybyDay.toString() + "\n");
				
				System.out.println("Please choose an option below \n");
				
				System.out.println("[0] See if the given year is a in fact a leap year");
				System.out.println("[1] Days since 1/1/0 AD");
				System.out.println("[2] Check if inputed date is between two other given dates");
				System.out.println("[3] Calculate the number of days from inputed date to another specifed date");
				System.out.println("[4] Incriement inputted date by one day");
				System.out.println("[5] Reduce inputted date by one day");
				System.out.println("[6] To exit program \n");
				
				option = menu_input.nextInt();
				
			}
			
			// Peacefully exits out the program
			else if(option == 6)
			{	
				System.out.println("You have successfully, exited the program. Have a nice day.");
				break;
			}
			
			// Invalid input that will exit out of the program 
			else
			{
				System.out.println("INVALID INPUT. EXITING PROGRAM");
				break;
			}
		}
		
		// Closing scanner types
		input.close();
		menu_input.close();
		  
	  }
	 }
