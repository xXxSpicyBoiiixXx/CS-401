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
    public static void main(String[] args) throws FileNotFoundException{

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
        }
    }

    /* Runs a linked based queue
     * @param text file that requires text file containing desired information
     */
    public static void runLinkedListQueue(Scanner text) {
        Scanner input = new Scanner(System.in);
        Scanner nums = new Scanner(System.in);

        System.out.println("Initiating a linked based queue for you...");
        LinkedListQueue<Node> queue = new LinkedListQueue<>();

        System.out.println("Linked List Queue initiated. Your queue is empty.");
        System.out.println("Enqueue (a), Dequeue (r), Peek (p), Display (d), Quit (q)");

        String response = input.nextLine();

        System.out.println("Your input: " + response);

        while(!response.equals("q")){
            while(!"arpdq".contains(response)){
                System.out.println("Please enter a, r, p, d, or q please");
                response = input.nextLine();
            }

            switch(response){
                case "a":
                    System.out.println("Do you wanna add your own shit [0] or from the example.txt [1] file?");
                    int push = nums.nextInt();

                    while(!(push == 0 | push == 1)){
                        System.out.println("Bruh either 0 or 1, not whatever you put lol");
                        push = nums.nextInt();
                    }

                    if(push == 0) {
                        System.out.println("Enter whatever fam that you want to enqueue?");
                        String example_character = input.nextLine();
                        System.out.println("Put a number in that you want to enqueue?");
                        String example_num = input.nextLine();

                        queue.enqueue(new Node(example_character, example_num));
                        System.out.println("Successfully enqueued" + queue.peek() + " into your queue boiiii,");
                    }
                        }

                    }
            }
        }
    }
}