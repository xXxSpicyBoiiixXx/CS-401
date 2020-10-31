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

//package Lab07;

public class CharQueue{

    CharNode front;
    private int max_size;

    public CharQueue(int max_size){
        this.front = null;
        this.max_size = max_size;
    }

    public void enqueue(char c){
        if(isFull()) {
			throw new OverflowException("Enqueue Doesn't work fam");
        }
        else
        {
            rear = (rear + 1) % elements.length;
            elements[rear] = element;
            numElements = numElements + 1;
        }

    }

    public char dequeue(){

        if(isEmpty()) {
            throw new UnderflowException("Dequeue Doesn't work fam");
        }
        else {
            T toReturn = elements[front];
            elements[front] = null;
            front = (front + 1) % elements.length;
            numElements = numElements - 1;
            return toReturn;
        }

        // Returns true if this queue is empty; otherwise, returns false.
        public boolean isEmpty(){
        }

        // Returns true if current size is equal to max_size; otherwise return false;
        public boolean isFull(){
        }

        // Returns the number of elements in this queue.
        public int size(){
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