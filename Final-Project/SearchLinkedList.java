import java.util.Scanner;

public class SearchLinkedList {
    Node head;

    //Inserts a new node at the front of the list 
    public void push(int newData) {
        //Allocate new node and putting data 
        Node newNode = new Node(newData);

        //Make next of new node as head 
        newNode.next = head;

        //Move the head to point to new Node 
        head = newNode;
    }

    // Iterative Search
    public boolean search(Node head, int x) {
        long startTime = System.nanoTime();
        Node current = head;
        while (current != null)
        {
            if (current.data == x) {
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
                return true;
            }
            current = current.next;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
        return false;
    }

    // Recursive Search
    public boolean RecursiveSearch(Node head, int x) {
        long startTime = System.nanoTime();
        // Base case 
        if (head == null) {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
            return false;
        }

        // If key is present in current node, return true 
        if (head.data == x) {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
            return true;
        }

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime + " nanoseconds.");
        // Recur for remaining list 
        return search(head.next, x);
    }

    // Call main
    public static void main(String args[]) {
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

    }
} 