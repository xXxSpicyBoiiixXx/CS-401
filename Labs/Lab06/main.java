/*
 * FILE: main.java
 * USAGE: --
 * DESCRITPION: Main driver function for the makefile to run this one file.
 * OPTIONS: --
 * REQUIREMENTS: --
 * BUGS: --
 * AUTHOR: xXxSpicyBoiiixXx (Md Ali 
 * ORGANIZATION: --
 * VERSION: 1.0 
 * CREATED: 10/20/2020
 * REVISION: --
 */

import java.util.Scanner;

public class main {
	
	public static void main(String[] args)
		{
		int n;
		int total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input what would you like to do.");
		System.out.println("[1] Recursive method for summation of array");
		System.out.println("[2] Iteration method of summation of array");
		System.out.println("[3] Node stacking");
		
		n = input.nextInt();
		
		switch(n) {
		
		// Using the sum recursive function 
		case 1:
			System.out.println("Please enter a number for the size of an array");
		
			n = input.nextInt();
			total = ArraySum.arrSumRec(n);
			System.out.println("Your total is: " + total);
			break;
			
		// Using the sum iteration function
		case 2: 
			System.out.println("Please enter a number for the size of an array");
			
			n = input.nextInt();
			total = ArraySum.arrSumIter(n);
			System.out.println("Your total is: " + total);
			break;
			
		// Using node stacking function 
		case 3:
			System.out.println("Please input the desired row followed by corresponding column");
			
			int x = input.nextInt();
			System.out.println("Your row is " + x);
			int y = input.nextInt();
			System.out.println("Your column is " + y);
			
			double weight_total;
			weight_total = NodeStacking.weightSupporting(x, y);
			System.out.println("Total weight supporting: " + weight_total);
			break;
		
		// Default case 
		default: 
			System.out.println("Onwards to Lab 07");
				
			}
		input.close();
		
		}

}