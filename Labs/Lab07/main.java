/*
# FILE: main.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/27/2020
REVISION: --
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// package Lab07;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("example.txt");
        Scanner text = new Scanner(file);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome did you want a [l]inked list queue or an [a]rray based queue?");

        String lora = input.nextLine();

        while (!"la".contains(lora)) {
            System.out.println("Invalid!! Please enter l for a linked list queue or a for a array based queue.");
            lora = input.nextLine();
        }
        if (lora.equals("l")) {
            runLinkedListQueue(text);
        } else if (lora.equals("a")) {
            System.out.println("Array based queue, got it. Which version, f[i]xed or f[l]oating?");
            String iorl = input.nextLine();

            while (!"il".contains(iorl)) {
                System.out.println("Invalid!! Please enter i for fixed and l for floating.");
                iorl = input.nextLine();
            }

            if (iorl.equals("i")) {
                runFixedQueue(text);
            } else if (iorl.equals("l")) {
                runFloatQueue(text);
            }
        }
    }

    // This is the linked list queue
    public static void runLinkedListQueue(Scanner text) {
        Scanner input = new Scanner(System.in);
        Scanner nums = new Scanner(System.in);

        System.out.println("Initiating a linked based queue for you...");
        LinkedListQueue<InfoEx> queue = new LinkedListQueue<>();

        System.out.println("Linked List Queue initiated. Your queue is empty.");
        System.out.println("Enqueue (a), Dequeue (r), Peek (p), Display (d), Quit (q)");

        String response = input.nextLine();

        System.out.println("Your input: " + response);

        while (!response.equals("q")) {
            while (!"arpdq".contains(response)) {
                System.out.println("Please enter a, r, p, d, or q please");
                response = input.nextLine();
            }

            switch (response) {
                case "a":
                    System.out.println("Do you wanna add your own shit [0] or from the example.txt [1] file?");
                    int push = nums.nextInt();

                    while (!(push == 0 | push == 1)) {
                        System.out.println("Bruh either 0 or 1, not whatever you put lol");
                        push = nums.nextInt();
                    }

                    if (push == 0) {
                        System.out.println("Enter whatever fam that you want to enqueue?");
                        String example_character = input.nextLine();
                        System.out.println("Put a number in that you want to enqueue?");
                        String example_num = input.nextLine();

                        queue.enqueue(new InfoEx(example_character, example_num));
                        System.out.println("Successfully enqueued" + queue.peek() + " into your queue boiiii.");
                    } else if (push == 1) {
                        while (text.hasNextLine()) {
                            String[] split = text.nextLine().split("\\s");
                            queue.enqueue(new InfoEx(split[0], split[1]));
                        }
                        System.out.println("Successfully enqueued example.txt into the queue.");
                    }
                    response = " ";
                    break;

                case "r":
                    if (!queue.isEmpty()) {
                        queue.dequeue();
                        System.out.println("Successfully Dequeued");
                        response = " ";
                    } else {
                        System.out.println("The queue is empty bruh");
                        response = " ";
                    }
                    break;

                case "p":
                    if (!queue.isEmpty()) {
                        System.out.println("The front of the queue is: " + queue.peek());
                        response = " ";
                    } else {
                        System.out.println("The queue is empty bruh");
                        response = " ";
                    }
                    break;

                case "d":
                    System.out.println("###########################");
                    queue.display();
                    System.out.println("###########################");
                    response = " ";
                    break;

                case "q":
                    System.exit(1);
                    break;

                default:
                    response = " ";
            }
        }
    }
    
    // Runs the fixed queue
    public static void runFixedQueue(Scanner text) {
        Scanner input = new Scanner(System.in);
        Scanner nums = new Scanner(System.in);
        System.out.println("Fixed Front Queue Initiated.....What size array do you want?");
        int size = nums.nextInt();


        FixedQueue<InfoEx> queue = new FixedQueue<>(size);
        System.out.println("Fixed queue initiated. Your queue is currently empty. What would you like to do?");
        System.out.println("Enqueue (e), Dequeue (d), Print (p), Quit (q)");
        String response = input.nextLine();

        System.out.println("Your input: " + response);

        while (!response.equals("q")) {
            while (!"edpq".contains(response)) {
                System.out.println("Please enter e for enqueue, d for dequeue, p for print, or q for quit.");
                response = input.nextLine();
            }

            switch (response) {
                case "e":
                    System.out.println("Do you wanna add your own shit [0] or from the example.txt [1] file?");
                    int push = nums.nextInt();
                    while (!(push == 0 | push == 1)) {
                        System.out.println("Bruh either 0 or 1, not whatever you put lol");
                        push = nums.nextInt();
                    }
                    if (push == 0) {
                        System.out.println("Enter whatever fam that you want to enqueue?");
                        String example_character = input.nextLine();
                        System.out.println("Put a number in that you want to enqueue?");
                        String example_num = input.nextLine();

                        queue.enqueue(new InfoEx(example_character, example_num));
                    } else if (push == 1) {
                        while (text.hasNextLine()) {
                            String[] split = text.nextLine().split("\\s+");
                            queue.enqueue(new InfoEx(split[0], split[1]));
                        }
                    }
                    System.out.println("###########################");
                    queue.showArray();
                    System.out.println("###########################");
                    response = " ";
                    break;
                case "d":
                    if (!queue.isEmpty()) {
                        queue.dequeue();
                        System.out.println("###########################");
                        queue.showArray();
                        System.out.println("###########################");
                        response = " ";
                    } else {
                        System.out.println("The queue is empty bruh.");
                        response = " ";
                    }
                    break;
                case "p":
                    queue.showArray();
                    response = " ";
                    break;
                case "q":
                    System.exit(1);
                    break;
                default:
                    response = " ";
            }
        }
    }
    
    // Runs the floating queue
    public static void runFloatQueue(Scanner text) {
        Scanner input = new Scanner(System.in);
        Scanner nums = new Scanner(System.in);
        System.out.println("Floating Front Queue Initiated.....What size array do you want?");
        int size = nums.nextInt();

        FloatingQueue<InfoEx> queue = new FloatingQueue<>(size);
        System.out.println("Floating queue initiated. Your queue is currently empty. What would you like to do?");
        System.out.println("Enqueue (e), Dequeue (d), Print (p), Quit (q)");
        String response = input.nextLine();

        System.out.println("Your input: " + response);

        while (!response.equals("q")) {
            while (!"edpq".contains(response)) {
                System.out.println("Please enter e for enqueue, d for dequeue, p for print, or q for quit.");
                response = input.nextLine();
            }

            switch (response) {
                case "e":
                    System.out.println("Do you wanna add your own shit [0] or from the example.txt [1] file?");
                    int push = nums.nextInt();
                    while (!(push == 0 | push == 1)) {
                        System.out.println("Bruh either 0 or 1, not whatever you put lol");
                        push = nums.nextInt();
                    }
                    if (push == 0) {
                        System.out.println("Enter whatever fam that you want to enqueue?");
                        String example_character = input.nextLine();
                        System.out.println("Put a number in that you want to enqueue?");
                        String example_num = input.nextLine();

                        queue.enqueue(new InfoEx(example_character, example_num));
                    } else if (push == 1) {
                        while (text.hasNextLine()) {
                            String[] split = text.nextLine().split("\\s+");
                            queue.enqueue(new InfoEx(split[0], split[1]));
                        }
                    }
                    System.out.println("*************************************************************");
                    queue.showArray();
                    System.out.println("*************************************************************");
                    response = " ";
                    break;
                case "d":
                    if (!queue.isEmpty()) {
                        queue.dequeue();
                        response = " ";
                        System.out.println("*************************************************************");
                        queue.showArray();
                        System.out.println("*************************************************************");
                    } else {
                        System.out.println("The queue is empty bruh");
                        response = " ";
                    }
                    break;
                case "p":
                    queue.showArray();
                    response = " ";
                    break;
                case "q":
                    System.exit(1);
                    break;
                default:
                    response = " ";
            }
        }
    }
}
