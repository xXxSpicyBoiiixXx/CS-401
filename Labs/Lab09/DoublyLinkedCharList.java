
public class DoublyLinkedCharList {
	private DoubleLinkedCharNode head;
	private DoubleLinkedCharNode tail;
	
	public DoublyLinkedCharList() {
		this.head = null;
		this.tail = null;
	}
	
	// Create a node using the input newInfo and add this before the head
	public void push(char newInfo) {
		/* 1. Fill your code here */
		/* 1.End of your code here */
	}
	
	// Create a node using the input newInfo and add this after the tail
	public void append(char newInfo) {
		/* 2. Fill your code here */
		/* 2. End of your code here */
	}
	
	// Create a node using the input newInfo and add this node before a given node
	public void insertBefore(char newInfo, DoubleLinkedCharNode node) {
		/* 3. Fill your code here */
		/* 3. End of your code here */
	}
	
	// remove the given node from the list
	public void delete(DoubleLinkedCharNode node) {
		/* 4. Fill your code here */
		/* 4. End of your code here */
	}
	
	// return the size of the list
	public int size() {
		/* 5. Fill your code here */
		/* 5. End of your code here */
	}
	
	// return True if the list is empty; otherwise, return false
	public boolean isEmpty() {
		return head == null;
	}
	
	
	// create a node using input newInfo and insert it at the given index.
	//  e.g. if the list is a, b, c, d, e. 
	// Then corresponding index of the list will be: 
	// char : a b c d e 
	// index: 0 1 2 3 4
	// If we insertAt('x', 2), after insertion the list will be: a b x c d e
	// Hint: If you input an index which is less than 0, then push the node to the head. 
	// E.g. insertAt('x', -3), the list will become: x a b c d e
	// if you input an index which is greater than the size of list, then append the node to the tail. 
	// E.g. insertAt('x', 6), the list will become: a b c d e x
	public void insertAt(char newInfo, int index) {
		/* 6. Fill your code here */
		/* 6. End of your code here */
	}
	
	// Delete the node at input index and return the info of deleted node.
	// E.g. if the list is a, b, c, d, e, after deleteAt(2), the list will be a, b, d, e
	// If you input an index which is less than 0 or greater than/equal to the size of list, don't delete anything, return null
	public void deleteAt(int index) {
		/* 7. Fill your code here */
		/* 7. End of your code here */
	}
	
	
	// Get the info of the node at input index. 
	// E.g. if the list is a, b, c, d, e, after getNodeAt(2), it will return a node c.
	// if index < 0 or >= size(), return null;
	public DoubleLinkedCharNode getNodeAt(int index) {
		/* 8. Fill your code here */
		/* 8. End of your code here */
	}
	
	/* getter and setter */
	public DoubleLinkedCharNode getHead() {
		return head;
	}

	public void setHead(DoubleLinkedCharNode head) {
		this.head = head;
	}

	public DoubleLinkedCharNode getTail() {
		return tail;
	}

	public void setTail(DoubleLinkedCharNode tail) {
		this.tail = tail;
	}
	/* ! getter and setter */
	
	public String toString() {
		DoubleLinkedCharNode currentNode = head;
		String result = "";
		
		while(currentNode != null) {
			result +=  currentNode.getInfo();
			currentNode = currentNode.getNext();
		}
		return result;
	}
	
	public String toReverseString() {
		DoubleLinkedCharNode currentNode = this.tail;
		String result = "";
		
		while(currentNode != null) {
			result +=  currentNode.getInfo();
			currentNode = currentNode.getPrevious();
		}
		
		return result;
	}
	
	public boolean equals(DoublyLinkedCharList l) {
		return this.toString() == l.toString() && this.toReverseString() == l.toReverseString();
	}
}
