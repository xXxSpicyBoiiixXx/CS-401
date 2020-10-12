/*
# FILE: main.java
# USAGE: --
# DESCRIPTION: Driver file for the lab 5 for either a stack or check parentheses.
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/05/2020
REVISION: --
*/

package Lab05;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Checks if the file "Example.txt" is in the system. Otherwise a file execpetion will be thrown.
		File file = new File("Example.txt");
		Scanner text = new Scanner(file);
		Scanner input = new Scanner(System.in);
		
		// Asks the user if they want to implement a stack or validate their string
		System.out.println("Welcome! Do you want to implement a [S]tack or validate a string for [P]arentheses?");
		
		// User input 
		String SorQorP = input.nextLine();
		
		// Validates input from user
		while(!"SQP".contains(SorQorP)) {
			
			System.out.println("!!!INVALID INPUT. PLEASE ENTER [S] FOR STACK OR [P] for Parenthese!!!");
			SorQorP = input.nextLine();
			
			}
		
		// If "S" will run the stack and "P" for the parentheses valid function. 
		if (SorQorP.equals("S")) 
		{
			Stack(text);
		}
		
		else if(SorQorP.equals("P"))
		{
			Parentheses(text);
		}
		
		input.close();
		
	}

	
	// Stack implementation for user. Will ask the user what they want to implement in their stack. There is a user file that they 
	// can implement but they can also validate their own input.
	public static void Stack(Scanner text) {
		
		Scanner input = new Scanner(System.in);
		Scanner nums = new Scanner(System.in);
		
		System.out.println("...Initializing a stack....");
		
		CharStack<Character> stack = new CharStack<>();
		
		System.out.println("Character stack created. The stack is currently empty. Please choose an option below.");
		System.out.println();
		System.out.println("[A] Push");
		System.out.println("[R] Pop");
		System.out.println("[P] Peek");
		System.out.println("[D] Display");
		System.out.println("[Q] Quit");
		
		String response = input.nextLine();
		
		System.out.println("Your input: " + response);
		
		while (!response.equals("Q")) {
			while(!"ARPDQ".contains(response)) {
				System.out.println("!!!INVALID INPUT. PLEASE TRY AGAIN FOR THE CHOICES BELOW!!!");
				System.out.println();
				System.out.println("[A] Push");
				System.out.println("[R] Pop");
				System.out.println("[P] Peek");
				System.out.println("[D] Display");
				System.out.println("[Q] Quit");
				
			}
			
			switch (response) {
			
			case "A":
				System.out.println("Do you want to push your own inputted character/string [1] or from the character file [2]?");
				
				int push = nums.nextInt();
				
				while(!(push == 1 || push == 2)){
					System.out.println("!!!INVALID INPUT.PLEASE TRY AGAIN FOR THE CHOICES BELOW!!!");
					System.out.println();
					System.out.println("[1] Custom Input");
					System.out.println("[2] File Input");
					push = nums.nextInt();						
			}
				
				if (push == 1) {
					
					System.out.println("Enter the character/string you want to input");
					String character = input.nextLine();
					
					stack.push(new CharInfo(character));
					System.out.println("Successfully pushed "+stack.peek()+" onto the stack");
				}
					else if (push == 2) {
						
						while (text.hasNextLine()) {
 							String[] split = text.nextLine().split("\\s+");
 							stack.push(new CharInfo(split[0]));
						}
						
						System.out.print("Successfully pushed Example.txt onto the stack.");
					}
				response = " ";
				break;
				
			case "R":
				if(!stack.isEmpty()) {
					stack.pop();
					System.out.println("Successfully Popped");
					response = " ";
				}
				else {
					System.out.println("This stack is empty, you need to push something first into it.");
					response = " ";
				}
				break;
			
			case "P":
				if(!stack.isEmpty()) {
					System.out.println("The top of the stack is: "+stack.peek());
					response = " ";
				}
				
				else {
					System.out.println("The stack is empty, you need to push something first into it.");
					response = " ";
				}
				break;
				
			case "D": 
				System.out.println("################################################################");
				stack.display();
				System.out.println("################################################################");
				response = " ";
				break;
			
			case "Q":
				System.exit(1);
				break;
			default: 
				response = " ";
					
				}
		}
		input.close();
	}
	
	// Will ask the user to input a string and will return weather the string is balanced or not. 
	public static void Parentheses(Scanner text) {
		
		System.out.println("Please input a string ot be compared with parenthese.");
		
		Scanner input = new Scanner(System.in);
		
		String response = input.nextLine();
		
		if (ParenthesesValidator.isValid(response)) {
            System.out.println("Balanced "); 
		}
        else {
            System.out.println("The String is not Balanced");
        }
		
		input.close();
	}
}

