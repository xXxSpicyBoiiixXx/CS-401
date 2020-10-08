/*
# FILE: CharNode.java
# USAGE: --
# DESCRIPTION: 
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

public class CharNode<Test> {
	// Instead of implement a single function as before, You are required to design and implement the whole class. 
		// Design and implement your CharNode. It's a link node which contains a char
		// You can define any attributes or methods on your own
		// You will use your CharNode class in CharStack.
		// Filling your code here
		
	//variables 
	//private char info;
	//private CharNode next;
	
	//consturctor
	// CharNode();
	
	//get/set
	//getInfo
	//setInfo
	//getNext
	//setNext
	
	
	private Test data; 
	
	private CharNode<Test> node;
	
	CharNode(Test data, CharNode<Test> node) {
		this.data = data;
		this.node = node;
		
		// End of your code
	
	}
	
	public Test getData() {
		if (data == null) {
			throw new StackUnderflowException("Bruh you messed up lmfao.");
		}
		return data;
	}
	
	public CharNode getNode() {
		if (node == null) {
			return null;
		}
		return node;
	}
	
	public void setData(Test newData) {
		this.data = newData;
	}
	
	public void setNode(CharNode<Test> newNode) {
		this.node = newNode;
	}
}


