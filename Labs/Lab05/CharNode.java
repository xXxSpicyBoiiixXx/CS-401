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


