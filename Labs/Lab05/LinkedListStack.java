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
}
