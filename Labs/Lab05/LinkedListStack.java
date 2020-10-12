/*
# FILE: LinkedListStack.java
# USAGE: --
# DESCRIPTION: Linked list for the stack, this will correlate with the CharNode file. 
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

public class LinkedListStack<Test> {

	CharNode<Test> top;
	
	// Creation of an empty stack
	public LinkedListStack(){
		top = null;
	}
	
	// Adds a node on top
	public void addToTop(Test data) {
		
		CharNode<Test> newNode = new CharNode<>(data, null);
		
		if(top == null) {
			top = newNode;
		}
		else {
			newNode.setNode(top);
			top = newNode;
		}
	}
	
	// Returns the top of the stack, if empty nothing will happen
	public CharNode getTop() {
		return top;
	}
	
	public void print() {
		
		if(top == null) {
			return;
		}
		else {
			CharNode<Test> currNode = top;
			
			while(currNode.getNode() != null) {
				System.out.println(currNode.getData());
				currNode = currNode.getNode();
			}
			
			System.out.println(currNode.getData());
		}
	}
	
	
	// Pops the top off 
	public void removeTop() {
		
		if(top == null) {
			throw new StackUnderflowException("Pop attempted on an empty list");
		}
		else if(top.getNode() = null) {
			top = null;
		}
		else {
			top = top.getNode();
		}
	}
	
	// Retunrs if the stack is empty
	public boolean isEmpty() {
		return top == null;
	}
	
	
}
