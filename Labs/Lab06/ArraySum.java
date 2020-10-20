/*
# FILE: ArraySum.java
# USAGE: --
# DESCRIPTION: 
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/08/2020
REVISION: --
*/

import java.util.Random; 
import java.util.Scanner;
import java.util.Arrays;

public class ArraySum {
		
	public static int arrSumRec(int n) {
	
	long startTime = System.nanoTime();
	int start; 
	int end; 

	int arr[] = new int[n];
	Random r_num = new Random();
	
	Scanner inputStart = new Scanner(System.in);
	Scanner inputEnd = new Scanner(System.in);

	for(int i = 0; i < n; i++)
		arr[i] = r_num.nextInt(1000000);
	
	System.out.println("Between what indexes would you like to search through?");
	
	try{
		start = inputStart.nextInt();
		System.out.println("The element of starting index is " + arr[start]);
		end = inputEnd.nextInt();
		System.out.print("The element of ending index is " + arr[end]);
	} catch(ArrayIndexOutOfBoundsException e) {

		System.out.println("The index you entered is invalid");
		System.out.println("Please eneter and index number between 0 and " + n);

	}

	public static int arrSumIter(int[] arr, int start, int end) {
		// Filling your code here

		// End of your code
	}
}
