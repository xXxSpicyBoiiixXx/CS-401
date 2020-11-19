
import java.lang.*;

public class DoublyLinkedCharList {
	private DoubleLinkedCharNode head;
	private DoubleLinkedCharNode tail;
	public  int size = 0;
	public DoublyLinkedCharList() {
		this.head = null;
		this.tail = null;
	}
	
	// Create a node using the input newInfo and add this before the head
	public void push(char newInfo) {
		/* 1. Fill your code here */
		DoubleLinkedCharNode newNode = new DoubleLinkedCharNode(newInfo);

		if(head == null)
		{
			newNode.setNext(null);
			newNode.setPrevious(null);
			head = newNode;
			tail = newNode;
			size++;
		}

		else
		{
			newNode.setNext(head);
			newNode.setPrevious(null);
			head.setPrevious(newNode);
			head = newNode;
			size++;
		}
		/* 1.End of your code here */
	}
	
	// Create a node using the input newInfo and add this after the tail
	public void append(char newInfo) {
		/* 2. Fill your code here */
		DoubleLinkedCharNode newNode = new DoubleLinkedCharNode(newInfo);

		if(tail == null){
			newNode.setNext(null);
			newNode.setPrevious(null);
			head = newNode;
			tail = newNode;
			size++;
		}

		else{
			tail.setNext(newNode);
			newNode.setNext(null);
			newNode.setPrevious(tail);
			tail = newNode;
			size++;
		}
		/* 2. End of your code here */
	}
	
	// Create a node using the input newInfo and add this node before a given node
	public void insertBefore(char newInfo, DoubleLinkedCharNode node) {
		/* 3. Fill your code here */
		DoubleLinkedCharNode newNode = new DoubleLinkedCharNode(newInfo);

		if(head == null && tail == null)
		{
			throw new IllegalArgumentException("No nodes in list");
		}
		else {
			newNode.setPrevious(node.getPrevious());
			newNode.setNext(node);
			size++;
		}
		/* 3. End of your code here */
	}
	
	// remove the given node from the list
	public void delete(DoubleLinkedCharNode node) {
		/* 4. Fill your code here */
		if(head == null && tail == null)
		{
			throw new IllegalArgumentException("No nodes in list");
		}

		else {
			DoubleLinkedCharNode temp = new DoubleLinkedCharNode(head.getInfo());

			Character info = new Character(temp.getInfo());

			while(null != temp.getNext() && info.equals(node))
			{
				temp = temp.getNext();
				info = temp.getInfo();
			}

			if(info.equals(node))
			{
				temp.setNext(node.getNext());
				temp.setPrevious(node.getPrevious());
				node.setPrevious(node.getNext());
				node.setNext(node.getPrevious());
				size--;
			}

		}
		/* 4. End of your code here */
	}
	
	// return the size of the list
	public int size() {
		/* 5. Fill your code here */
		return size;
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
		if(index < 0 || index > size){
			throw new IllegalArgumentException("Index is invalid");
		}

		if(index == 0){
			push(newInfo);
		}

		else if(index == size - 1){
			append(newInfo);
		}
		else{
			DoubleLinkedCharNode currentNode = head;

			for(int i = 0; i < index; i++){
				currentNode = currentNode.getNext();
			}

			DoubleLinkedCharNode previosNode = currentNode.getPrevious();
			DoubleLinkedCharNode newNode = new DoubleLinkedCharNode(newInfo);
			newNode.setNext(currentNode);
			newNode.setPrevious(previosNode);
			previosNode.setNext(newNode);
			currentNode.setPrevious(newNode);
			size++;
		}
		/* 6. End of your code here */
	}
	
	// Delete the node at input index and return the info of deleted node.
	// E.g. if the list is a, b, c, d, e, after deleteAt(2), the list will be a, b, d, e
	// If you input an index which is less than 0 or greater than/equal to the size of list, don't delete anything, return null
	public void deleteAt(int index) {
		/* 7. Fill your code here */
		if(index < 0 || index >= size)
		{
			throw new IllegalArgumentException("Invalid Index");
		}

		DoubleLinkedCharNode nodeDeleted = head;

		for(int i = 0; i < index; i++){
			nodeDeleted = nodeDeleted.getNext();
		}

		DoubleLinkedCharNode previousNode = nodeDeleted.getPrevious();
		DoubleLinkedCharNode nextNode = nodeDeleted.getNext();

		previousNode.setNext(nextNode);
		nextNode.setPrevious(previousNode);
		size--;

		/* 7. End of your code here */
	}
	
	
	// Get the info of the node at input index. 
	// E.g. if the list is a, b, c, d, e, after getNodeAt(2), it will return a node c.
	// if index < 0 or >= size(), return null;
	public DoubleLinkedCharNode getNodeAt(int index) {
		/* 8. Fill your code here */
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Invalid Index");
		}

		DoubleLinkedCharNode locationNode = head;

		for(int i = 0; i < index; i++){
			locationNode = locationNode.getNext();
		}

		return locationNode;

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
