/*
# FILE: CharNode.java
# USAGE: --
# DESCRIPTION: The charcter node for the linked list.
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
	
	private Test data; 
	
	private CharNode<Test> node;
	
	// Intialixing the object node
	CharNode(Test data, CharNode<Test> node) {
		this.data = data;
		this.node = node;
			
	}
	
	// Gets the data that was pushed in to the node
	public Test getData() {
		if (data == null) {
			throw new StackUnderflowException("Bruh you messed up lmfao.");
		}
		return data;
	}
	
	// Gets the enitre node
	public CharNode getNode() {
		if (node == null) {
			return null;
		}
		return node;
	}
	
	// Sets the entire data
	public void setData(Test newData) {
		this.data = newData;
	}
	
	// Set the node
	public void setNode(CharNode<Test> newNode) {
		this.node = newNode;
	}
}


