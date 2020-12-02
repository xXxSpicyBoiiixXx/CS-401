import java.util.ArrayList;

public class SortingArray {

    /*
     Selection sort, time complexity is O(n^2) as there are two nested loops
     @param array[]
     */

   /* public static void main(String args[]) {
        int[] arr = new int[10];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 8;
        arr[7] = 2;
        arr[8] = 5;
        arr[9] = 7;
       // selectionSortArray(arr);
        bubbleSortArray(arr);
       // insertionSort(arr);
       //mergeSort(arr, 10);
       // quickSort(arr,0,arr.length-1);
    }
    static void selectionSortArray(int arr[]) {
        long startTime = System.nanoTime();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time of selection sort: " + elapsedTime + " nanoseconds.");
    } */

    /*
     Bubble sort, worst case: O(n*n), best case:O(n)
     @param array[]
     */
    static void bubbleSortArray(int arr[]) {
        long startTime = System.nanoTime();
        int n = arr.length;
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // breaks loop if no swapped ocurred
            // this otimizes perfromance
            if (!swapped) {
                break;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time of bubble sort array: " + elapsedTime + " nanoseconds.\n");
    }

/*
   Insertion Sort, Complexity is O(n^2)
   @param arr[]
 */

    static void insertionSortArray(int arr[]) {
        long startTime = System.nanoTime();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            /* Moving elements of the array that are greater
               greater than the key to one more above their
               position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time of insertion sort array: " + elapsedTime + " nanoseconds.");
    }

    /*
     Merge Sort O(n*log(n))
     @param arr[]
     */

    static void merge(int arr[], int l[], int r[], int left, int right)
    {
        int i = 0, j = 0, k = 0;

        while(i < left && j < right)
        {
            if(l[i] <= r[j])
            {
                arr[k++] = l[i++];
            }

            else{
                arr[k++] = r[j++];
            }
        }

        while(i < left)
        {
            arr[k++] = l[i++];
        }

        while(j < right)
        {
            arr[k++] = r[j++];
        }

    }

    static void mergeSortArray(int arr[], int n)
    {
        long startTime = System.nanoTime();

        if(n < 2) {
            return;
        }

        // Creating subarrays
        int mid = n/2;

        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i = 0; i < mid; i++)
        {
            left[i] = arr[i];
        }

        for(int i = mid; i < n; i++)
        {
            right[i - mid] = arr[i];
        }

        mergeSortArray(left, mid);
        mergeSortArray(right, n - mid);

        merge(arr, left, right, mid, n - mid);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time of merge sort array: " + elapsedTime + " nanoseconds.");

    }


    /*
     Quick Sort, O(n* log(n))
     @param arr[]
     */

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;

                // swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void quickSortArray(int arr[], int low, int high)
    {
        long startTime = System.nanoTime();
        int n = arr.length;

        if(low < high)
        {
            int index = partition(arr, low, high);

            quickSortArray(arr, low, index - 1);
            quickSortArray(arr, index + 1, high);
        }

        if(low == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Total execution time of quick sort array: " + elapsedTime + " nanoseconds. \n");
        }
    }

}
