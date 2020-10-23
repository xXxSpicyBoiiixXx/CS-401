/*
# FILE: ArraySum.java
# USAGE: --
# DESCRIPTION: Summation of array within the lab. 
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/08/2020
REVISION: --
*/

import java.util.*;

/* 
 *  Since I have random number generator, I'm not sure how to accurately
 *  make a recursive formula for randomly generated number. I do know 
 *  how to implement a recursive formula but not for a randomly generated
 *  array. To my understanding, you will need a set array before implementing 
 *  a recursive method such as a list of number that have a set recursive formula.
 */

// Using insertion sort algorithm sort and adding the desired index
// between what the user wants.
public class ArraySum {
		
	public static int arrSumRec(int n) {
	
	int start; 
	int end; 
	int total = 0; 

	int arr[] = new int[n];
	Random r_num = new Random();
	
	Scanner inputStart = new Scanner(System.in);
	Scanner inputEnd = new Scanner(System.in);
	
	System.out.println("Unsorted Array");
	
	for(int i = 0; i < n; i++) {
		arr[i] = r_num.nextInt(1000000);
		System.out.print(arr[i] + " ");
	}
	
	System.out.println("");
	
	for(int i = 1; i < n; i++) {
		int key = arr[i];
		int j = i -1;
		
		while(j >= 0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j = j -1;
		}
		arr[j + 1] = key;
	}

	System.out.println("Sorted Array");
	
	for(int i = 0; i < n; i++)
	{
		System.out.print(arr[i] + " ");
	}
	
	System.out.println("");
	
	System.out.println("Between what indexes would you like to search through?");
	
	start = inputStart.nextInt();
	System.out.println("The element of starting index is " + arr[start]);
	end = inputEnd.nextInt();
	System.out.println("The element of ending index is " + arr[end]);
	
	if(start < 0 || end > n)
	{	
		System.out.println("Invalid Input");
		return 0;
	}
	
	for(int i = start; i < end; i++)
	{
		total = total + arr[i];
	}
	
	inputStart.close();
	inputEnd.close();
	
	System.out.println("Computation time in nanoseconds: " + System.nanoTime() + " ns");
	
	return total;

	// Tried to use some sort of exception handling but it wasn't playing nice.
	
	/*try{
		start = inputStart.nextInt();
		System.out.println("The element of starting index is " + arr[start]);
		end = inputEnd.nextInt();
		System.out.print("The element of ending index is " + arr[end]);
	} catch(ArrayIndexOutOfBoundsException e) {

		System.out.println("The index you entered is invalid");
		System.out.println("Please eneter and index number between 0 and " + n);

	}*/
	
	
	}

	// Here the bubble sort was used, and adding the desired index
	// between what the user wants. 
	public static int arrSumIter(int n) {
		int start; 
		int end; 
		int total = 0; 

		int arr[] = new int[n];
		Random r_num = new Random();
		
		Scanner inputStart = new Scanner(System.in);
		Scanner inputEnd = new Scanner(System.in);
		
		System.out.println("Unsorted Array");
		
		for(int i = 0; i < n; i++) {
			arr[i] = r_num.nextInt(1000000);
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("");
		
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				if (arr[j] > arr[j+1])
					{int k = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = k;
					}
			}
		}
		
		System.out.println("Sorted Array");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("Between what indexes would you like to search through?");
		
		start = inputStart.nextInt();
		System.out.println("The element of starting index is " + arr[start]);
		end = inputEnd.nextInt();
		System.out.println("The element of ending index is " + arr[end]);
		
		if(start < 0 || end > n)
		{	
			System.out.println("Invalid Input");
			return 0;
		}
		
		for(int i = start; i < end; i++)
		{
			total = total + arr[i];
		}
		
		inputStart.close();
		inputEnd.close();
		
		System.out.println("Computation time in nanoseconds: " + System.nanoTime() + " ns");
		
		return total;
	}

}
	