/*
# FILE: CharQueue.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/27/2020
REVISION: --
*/

package Lab07;

//Remember Queue is a first-in-first-out data structure
public class CharQueue {
	// front is an element that is put into queue the earliest.
	CharNode front;
	// the number of element in this queue should not exceed max_size
	private int max_size;
	
	public CharQueue(int max_size){
		this.front = null;
		this.max_size = max_size;
	}
	
	// Throws OverflowException if this queue is full;
	// otherwise, adds element to the rear of this queue.
	public void enqueue(char c){
		/* 1. fill your code here */
		
		/* 1. end your code */
	}
	
	// Throws UnderflowException if this queue is empty;
	// otherwise, removes front element from this queue and returns it.
	public char dequeue(){
		/* 2. fill your code here */
		
		/* 2. end of your code here */
	}
	
	// Returns true if this queue is empty; otherwise, returns false.
	public boolean isEmpty(){
		/* 3. fill your code here */
		
	    /* 3. end your code */
	}
	
	// Returns true if current size is equal to max_size; otherwise return false;
	public boolean isFull(){
		/* 4. fill your code here */
		
	    /* 4. end your code */
	}
	
	// Returns the number of elements in this queue.
	public int size(){
		/* 5. fill your code here */
		
		/* 5. fill your code here */
	}
	
	//  transfer the queue to a string and return it.
	// if the queue is 'a', 'b', 'c' from the front to rear, the string will be "abc"
	public String toString() {
		String result = "";
		CharNode pointer = this.front;
		while(pointer != null) {
			result += pointer.getInfo();
			pointer = pointer.getLink();
		}
		return result;
	}
}