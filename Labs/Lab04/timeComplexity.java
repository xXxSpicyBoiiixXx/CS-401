/*
# FILE: timeComplexity.java
# USAGE: --
# DESCRIPTION: 
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.3
# CREATED: 09/22/2020
REVISION: --
*/

package Lab04;

public class timeComplexity {
	
	public void method1(int n) {
		n = 10;
		for (int i = 0; i < n; i++) {
			
		}
	}
	
	public void method2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
			}
		}
	}
	
	public int search(int arr[], int x)
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
	
	public static void main(String[] args) {
		timeComplexity tc = new timeComplexity();
	}
}
