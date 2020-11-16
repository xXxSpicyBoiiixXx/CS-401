/*
# FILE: main.java
# USAGE: --
# DESCRIPTION: Driver file
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/15/2020
REVISION: --
*/

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Doubly Linked List");

        System.out.println("We are initiating a list for you.");

        System.out.println("Initiating list....");
        DoublyLinkedList<DoubleLinkedNode> newNode = new DoublyLinkedList<>();

        System.out.println("What would you like to do? Please choose an option below.");
        System.out.println("[I]nsert");
        System.out.println("[D]elete");
        System.out.println("[S]earch");
        System.out.println("[Y]Display");
        System.out.println("[E]xit");

        String response = input.nextLine();

        System.out.println("Your input: " + response);

        while(!response.equals("E")){
            while(!"IDSY".contains(response)){
                System.out.println("Please enter I, D, S, Y, or E please");
                response = input.nextLine();
            }
        }

        switch(response){

            case "I":
                System.out.println("Okay, so now where do you want to insert your stuff?");
                System.out.println("[H]ead, [T]ail, or [I]ndex?");

                response = input.nextLine();

                while(!"HTI".contains(response)){
                    System.out.print("Please enter H, T, or I");
                    response = input.nextLine();
            }
                switch(response) {
                    case "H":
                        System.out.println("Enter something for the head");
                        String some_input = input.nextLine();
                        newNode.insertAtStart(some_input);

                    case "T":
                        String.out.println("Enter something for the tail");
                        String some_input = input.nextLine();
                        newNode.insertAtTail(some_input);

                    case "I":
                        String.out.println("Enter whatever you want");
                        String some_input = input.nextLine();
                        String.out.println("Enter an index to input it in");
                        String index = input.nextInt();
                        newNode.insertAtIndex(some_input, index);
                }

            case "D":

        }


    }

}
