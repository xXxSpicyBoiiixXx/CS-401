/*
# FILE: LinkedListStack.java
# USAGE: --
# DESCRIPTION: 
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

public class LinkedListStack {

	private CharStack<Test> stack;
	
	LinkedListStack() {
		stack = new CharStack<>();
	}
	
	public void push(Test object) {
		stack.addToTop(object);
	}
	
	public void pop() {
		
		if (!isEmpty()) {
			stack.removeTop();
		}
		else {
			return; 
		}
	}
	
	public Test peek() {
		
		if(!isEmpty())
		{
			return (Test) stack.getTop().getInfo();
		}
		else {
			return null;
		}
	}
	
	public void display() {
		
		if (stack != null) {
			stack.print();
		}
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	
	public boolean isFull() {
		return false; 
	}
}
