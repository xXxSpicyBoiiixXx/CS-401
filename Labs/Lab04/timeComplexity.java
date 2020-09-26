/*
# FILE: timeComplexity.java
# USAGE: --
# DESCRIPTION: Just looking at different time complexity 
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
import java.lang.Math;

/*
 * I'm just going to assume the methods are whatever we want really.... 
 * 
 */

public class timeComplexity {
	
	
	public void method1(int n) {
		
		int oneD_arr[] = new int[n];
		Random r_num = new Random();
		
		for (int i = 0; i < n; i++) {
			oneD_arr[i] = r_num.nextInt(1000000);
			System.out.print(oneD_arr[i] + " ");
		}
	}
	
	
	

	public void method2(int n) {
		
		int twoD_arr[][] = new int[n][n];
		Random r_num = new Random();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			twoD_arr[i][j] = r_num.nextInt(1000000);
			System.out.print(twoD_arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * This is a linear search in addition this is considered the worst case
	 * time complexity due to the fact that the  algorithm will not only 
	 * compare the number of elements "n" but also on the value of "x" and 
	 * the values in a. In other words, it goes through one by one to search
	 * for the desired value e.g. index 1,2,...,n until it finds the value, if
	 * not then the function returns a -1
	 */
	public int search1D(int arr[], int x)
	{
		int n = arr.length; 
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public int search2D(int arr[][], int x)
	{
		int n = arr.length; 
		for(int i = 0; i < n; i++)
		{	
			for(int j = 0; j < n; j++)
			{
			if(arr[i][j] == x) {
				return arr[i][j];
			}
		}
	}
		
		return -1;
	}
	
	
	/*
	 * Binary search is a searching through a SORTED array. The key term here
	 * is sorted as this search will not be able to search through an unsorted 
	 * case. The way this algorithm works by repeatedly dividing the search interval 
	 * in half. If the value of the item searched is less than the item in the middle,
	 * then the attention will be directed towards the lower half and vice versa if the 
	 * value is higher than the middle. It will repeat this process until the value is 
	 * found.
	 */
	public int binarySearchItem(int [] sortedArray, int value) {
		
		int index = -1; 
		int low = 0;
		int high = sortedArray.length;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sortedArray[mid] < value) {
				low = mid + 1;
			}
			else if (sortedArray[mid] > value) {
				high = mid - 1;
			}
			else if(sortedArray[mid] == value) {
				index = mid;
				break;
			}
		}
		return index;
	}
	
	public static void search(int[][] mat, int fromRow, int toRow, int fromCol, int toCol, int input) { 
		// Find middle and compare with middle  
		int i = fromRow + (toRow-fromRow )/2; 
		int j = fromCol + (toCol-fromCol )/2; 
		
		if (mat[i][j] == input) { // If key is present at middle 
			System.out.println("Found "+ input + " at "+ i +  " " + j); 
		}
		
		else { 
			// right-up quarter of matrix is searched in all cases. 
			// Provided it is different from current call 
			if (i!=toRow || j!=fromCol) 
				search(mat,fromRow,i,j,toCol,input); 

			// Special case for iteration with 1*2 matrix 
			// mat[i][j] and mat[i][j+1] are only two elements. 
			// So just check second element 
			if (fromRow == toRow && fromCol + 1 == toCol) 
				if (mat[fromRow][toCol] == input) 
					System.out.println("Found "+ input + " at "+ fromRow + " " + toCol); 

			// If middle key is lesser then search lower horizontal  
			// matrix and right hand side matrix 
			if (mat[i][j] < input) 
			{ 
				// search lower horizontal if such matrix exists 
				if (i+1<=toRow) 
					search(mat, i+1, toRow, fromCol, toCol, input); 
			} 

			// If middle key is greater then search left vertical  
			// matrix and right hand side matrix 
			else
			{ 
				// search left vertical if such matrix exists 
				if (j-1>=fromCol) 
					search(mat, fromRow, toRow, fromCol, j-1, input); 
			} 
		} 
	} 
	
	public int fibonaccianSearch(int arr[], int x, int n)
	{
		
		int fbN2 = 0; // (n-2)th Fibonacci number 
		int fbN1 = 1; // (n-1)th Fibonacci number 
		
		int fbN = fbN2 + fbN1; // nth Fibonacci number 
		
		int offset = -1;
		
		// fbN is going to store the smallest Fibonacci number greater than or equal to n
		while(fbN < n)
		{
			fbN2 = fbN1;
			fbN1 = fbN;
			fbN = fbN2 + fbN1;
		}
		
		/* 
		 * If there are elements to be inspected. Note that we compare arr[fbM2] with x.
		 * When fbN becomes 1, then fbN2 becomes 0
		 */
		while(fbN > 1) 
		{
			int i = Math.min(offset + fbN2, n-1);
			
			if(arr[i] < x)
			{
				fbN = fbN1;
				fbN1 = fbN2;
				fbN2 = fbN = fbN1;
				offset = i;
			}
			
			else if(arr[i] > x)
			{
				fbN = fbN2;
				fbN1 = fbN1 - fbN2;
				fbN2 = fbN - fbN1;
			}
			
			else
			{
				return i;
			}
		}
		
		if(fbN1 == x && arr[offset + 1] == x)
		{
			return offset + 1;
		}
		
		return -1; 
	}

	public static void main(String[] args) {
		// timeComplexity tc = new timeComplexity();
		int arr[][] = new int[5][5];
		
		System.out.print(arr.length);
			
		
		
	}
}
