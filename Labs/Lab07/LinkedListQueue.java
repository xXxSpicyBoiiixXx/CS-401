/*
# FILE: LinkedListQueue.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/30/2020
REVISION: --
*/

public class LinkedListQueue<T> {

    // Using the linked list for our queue
    private LinkedList<T> queue;

    // Constructing an empty queue
    LinkedListQueue() {
        queue = new LinkedList<>();
    }

    /*
     * Adds an object to th end of the queue
     * @param element, whatever the elements is it will be added
     */
    void enqueue(T element){
        queue.addToTail(element);
    }

    /*
     * Dequeue will remove the first element that was inserted
     * aka also the front of the queue
     */
    void dequeue() {
        if(!queue.isEmpty()){
            queue.removeHead();
        }
        else {
            ;
        }
    }

    /*
     * SHows the head of the queue
     * @return T object that is the front of the queue
     */
    T peek()
    {
        if(!queue.isEmpty()){
            return (T) queue.getHead().getInfo();
        }
        else{
            return null;
        }
    }

    /*
     * Checks if the queue is empty
     * @ return true if the queue is empty, false otherwise
     */

    boolean isEmpty(){
        return queue.isEmpty();
    }

    /*
     * Checks if the queue is full
     * This is meaningless unless we have an array made queue
     * @return false
     */

    public boolean isFull(){
        return false;
    }

    /*
     * Displays the queue in use
     */

    public void display(){
        if(queue != null){
            queue.print();
        }
    }
}

