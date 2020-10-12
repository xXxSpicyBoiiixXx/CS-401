/*
# FILE: CharStack.java
# USAGE: --
# DESCRIPTION: Creation of the stack with our existing files
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/26/2020
REVISION: --
*/

package Lab05;

public class CharStack<Test> {
	
	// Creating of the stack from linked list
	private LinkedListStack<Test> stack;
	
	// If the stack is empty
	CharStack() {
		stack = new LinkedListStack<>();
	}
	
	// Pushes an object to the top of the stack
	public void push(Test object) {
		stack.addToTop(object);
	}
	
	// Removes the top of the stack
	public void pop() {
		
		if(!isEmpty()) {
			stack.removeTop();
		}
		else {
			return;
		}
	}
	
	// Take a looks at the top of the stack
	public Test peek() {
		
		if(!isEmpty()) {
			return (Test) stack.getTop().getData();
		}
		
		else {
			return null;
		}
	}
	
	// Displays the entire stack
	public void display() {
		if(stack != null) {
			stack.print();
		}
	}

	// Checks if the stack is empty
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	// This will never happen, but will give the return of false if the stack is full.
	public boolean isFull() {
		return false;
	}
}

