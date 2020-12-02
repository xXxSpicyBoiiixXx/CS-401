
import java.util.Scanner;

public class SearchLinkedList {
    node head;

    //Inserts a new node at the front of the list
    public void push(int newData) {
        //Allocate new node and putting data
        node newNode = new node(newData);

        //Make next of new node as head
        newNode.next = head;

        //Move the head to point to new Node
        head = newNode;
    }

    // Iterative Search
    public static boolean search(node head, int x) {
        long startTime = System.nanoTime();
        node current = head;
        while (current != null)
        {
            if (current.data == x) {
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("FOUND! Total execution time: " + elapsedTime + " nanoseconds.");
                return true;
            }
            current = current.next;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("NOT FOUND! Total execution time: " + elapsedTime + " nanoseconds.");
        return false;
    }

    // Recursive Search
    public static boolean RecursiveSearch(node head, int x) {
        long startTime = System.nanoTime();
        // Base case
        if (head == null) {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("EMPTY LIST! Total execution time: " + elapsedTime + " nanoseconds.");
            return false;
        }

        // If key is present in current node, return true
        if (head.data == x) {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("FOUND! Total execution time: " + elapsedTime + " nanoseconds.");
            return true;
        }

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("NOT FOUND! Total execution time: " + elapsedTime + " nanoseconds.");
        // Recur for remaining list
        return search(head.next, x);
    }

    // Call main
  /*  public static void main(String args[]) {
        SearchLinkedList list = new SearchLinkedList();
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            list.push(sc.nextInt());
            n--;
        } while (n > 0);
        System.out.println("Enter the integer that you want to find: ");
        int x=sc.nextInt();
        sc.close();

        // Iterative Search for x
        System.out.println("Iterative Search:");
        if (list.search(list.head, x))
            System.out.println("The element is presented in the Linked List");
        else
            System.out.println("The element is not presented in the Linked List");

        // Recursive Search for x
        System.out.println("Recursive Search:");
        if (list.RecursiveSearch(list.head, x) )
            System.out.println("The element is presented in the Linked List");
        else
            System.out.println("The element is not presented in the Linked List");

    }*/
} 