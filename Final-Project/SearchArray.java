import java.util.*;
import java.util.Scanner;

public class SearchArray {
    //Sequential Search (O(n))
    public static int search(int arr[], int x) {
        long startTime = System.nanoTime();
        int n = arr.length;

        for (int i = 0; i < n; i++)  {
            if (arr[i] == x) {
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
                return i;
            }
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
        return -1;
    }

    // Fibonacci Search (O(log n))
    // Utility function to find minimum of two elements
    public static int min(int x, int y)  {
        return (x <= y)? x : y;
    }

    // Returns the index of x if present, else returns -1
    public static int fibMonaccianSearch(int arr[], int x, int n) {
        long startTime = System.nanoTime();
        int fibMMm2 = 0; // (m-2)'th Fibonacci No.
        int fibMMm1 = 1; // (m-1)'th Fibonacci No.
        int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci

        /* fibM is going to store the smallest
        Fibonacci Number greater than or equal to n */
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        // Marks the eliminated range from front
        int offset = -1;

        /* Compare arr[fibMm2] with x.
        When fibM becomes 1, fibMm2 becomes 0 */
        while (fibM > 1) {
            // Check if fibMm2 is a valid location
            int i = min(offset+fibMMm2, n-1);

            /* If x is greater than the value at
            index fibMm2, cut the subarray array
            from offset to i */
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }

            /* If x is less than the value at index
            fibMm2, cut the subarray after i+1 */
            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }

            // Element found. return index
            else {
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
                return i;
            }
        }

        // Comparing the last element with x
        if(fibMMm1 == 1 && arr[offset+1] == x)
            return offset+1;
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
        // Element not found. return -1
        return -1;
    }

    // Jump Search (O(√ n))
    public static int jumpSearch(int[] arr, int x) {
        long startTime = System.nanoTime();
        int n = arr.length;

        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));

        // Finding the block where element is present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) {
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
                return -1;
            }
        }

        // Doing a linear search for x in block beginning with prev.
        while (arr[prev] < x) {
            prev++;

            // If reach next block or end of array, element is not present.
            if (prev == Math.min(step, n)) {
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
                return -1;
            }
        }


        // If element is found
        if (arr[prev] == x) {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
            return prev;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
        return -1;
    }

    // Exponential Search (O(log n))
    // Returns position of first occurrence of x in array
    static int exponentialSearch(int arr[], int n, int x) {
        long startTime = System.nanoTime();
        // If x is present at first location itself
        if (arr[0] == x) {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
            return 0;
        }

        // Find range for binary search by repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
        // Call binary search for the found range.
        return Arrays.binarySearch(arr, i/2,
                Math.min(i, n-1), x);

    }

    // Call Main
    public static void main(String args[])
    {
        int n, x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)  {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++)   {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the integer that you want to find: ");
        x=sc.nextInt();

        // Function call for sequential search
        int result = search(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);

        // Function call for fibonacci search
        System.out.println("Found at index: "+  fibMonaccianSearch(arr, x, n));

        // Function call for jump search
        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located
        System.out.println("Number " + x + " is at index " + index);

        // Function call for exponential search
        int result1 = exponentialSearch(arr, arr.length, x);
        System.out.println((result1 < 0) ?
                "Element is not present in array" :
                "Element is present at index " + result1);
    }
}
