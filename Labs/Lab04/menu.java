/*
# FILE: menu.java
# USAGE: --
# DESCRIPTION: This file will be including all the menu functionality including incorporating the file timeComplexity.java
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.1
# CREATED: 09/22/2020
REVISION: --
*/

package Lab04;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class menu {
	
	public void main_menu()
	{
		System.out.println("Hello! Today we will look at different time complexities.");
		System.out.println("Please choose below if you wanna analyze sequential or binary search on the hardcoded array.");
	}
	
	public void complexity_method()
	{
		Scanner input = new Scanner(System.in);
		
		
		timeComplexity tc = new timeComplexity();
		
		System.out.println();
		System.out.println("[1] Sequential Search");
		System.out.println("[2] Binary Search");
		System.out.println("[3] Method 1 Print Out");
		System.out.println("[4] Method 2 Print Out");
		
		int choice = input.nextInt();
		
		
		if(choice == 1)
		{	Random r_num = new Random();
		
			System.out.println("Enter the size of the array");
			
			int n = input.nextInt();
			
			int oneD_arr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				oneD_arr[i] = r_num.nextInt(1000000);
				System.out.print(oneD_arr[i] + " ");
		}
			System.out.println();
			
			System.out.println("Enter a number to search for in the randomized array.");
			
			int x = input.nextInt();
			
			int index = tc.search(oneD_arr, x);
			
			if(index > -1) 
			System.out.println("The digit " + x + " is located at index " + index + ".");
			else 
			System.out.println("The digit " + x + " is not located in the array.");
		}
		
		
		
		else if(choice == 2)
		{	
			Random r_num = new Random();
			
			System.out.println("Enter the size of the array");
			
			int n = input.nextInt();
			
			int oneD_arr[] = new int[n];
			
			Arrays.sort(oneD_arr);
			
			for (int i = 0; i < n; i++) {
				oneD_arr[i] = r_num.nextInt(1000000);
				
				System.out.print(oneD_arr[i] + " ");
			}
			
			System.out.println();
			
			System.out.println("Enter a number to search for in the randomized array.");
			
			int x = input.nextInt();
			
			int index = tc.search(oneD_arr, x);
			
			if(index > -1) 
			System.out.println("The digit " + x + " is located at index " + index + ".");
			else 
			System.out.println("The digit " + x + " is not located in the array.");
				
		}
		
		else if(choice == 3)
		{	
			System.out.println("Input a number for method 1");
			int n = input.nextInt();
			tc.method1(n);
		}
		
		else if(choice == 4)
		{	
			System.out.println("Input a number for method 2");
			int n = input.nextInt();
			tc.method2(n);
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
	
	/*
	// A simple choice menu if you are implementing the array stuff
	
	public void array_choice()
	{	
		timeComplexity tc = new timeComplexity();
		int n; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("[1] For randomized one dimensional array.");
		System.out.println("[2] For randomized two dimensional array. \n");
		
		n = input.nextInt();
		
		if(n == 1)
		{	
			System.out.println("Please input a size for your one dimensional array. \n");
			tc.method1(input.nextInt()); 
			
			System.out.println("Please choose a complexity to analyze with your given array. \n");
			System.out.println("[1] Sequential Search");
			System.out.println("[2] Binary Search");
			
			if(n == 1)
			{
				
			}
		}
		
		else if(n == 2) {
			System.out.println("Please input a size for your NxN matrix aka your two dimensional array.");
			tc.method2(input.nextInt());
		}
			
		else {
			System.out.print("Wrong");
		}
		
		input.close();
	}*/
}
