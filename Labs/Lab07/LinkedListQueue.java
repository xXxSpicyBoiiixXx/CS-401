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

    Node<T> head;

    public LinkedListQueue(){
        head = null;
    }
    /**
     * linked list implementing queu
    //private LLForLab4<T> queue;
     * constructor method to create empty que
     */
   LLQueueForLab4() {
       queue = new LinkedListQueue<>();

   }
    /**
     * adds an element to the end of the queue
     * @param element element to be added
     */
    void enqueue(T element) {
        Node<T> newNode = new Node<>(info, null);
        if(head == null){
            head = newNode;
        }
        else {
            Node currNode = head;
            while(currNode.getNode() != null) {
                currNode = currNode.getNode();
            }

            currNode.setNode(newNode);
        }
    }

    /**
     * removes element from front of queue
     */
    void dequeue() {
        if(head == null){
            throw new QueueUnderflowException("This is an empty.");
        }
        else if(head.getNode() == null)
        {
            head = null;
        }
        if (!queue.isEmpty()) {
            queue.removeHead();
        } else if(head.getNode() == null){
            head = null;
        }
        else {
            head = head.getNode();
        }
    }

    /**
     * shows the head of the queue
     * @return T object that is at the front of the queue
     */
    T peek() {
        if (!head.isEmpty()) {
            return (T) head.getHead().getData();
        } else {
            return null;
        }
    }

    /**
     * checks if queue is empty
     * @return true if queue is empty, false otherwise
     */
    boolean isEmpty() {
        return head == null;
    }

    /**
     * checks if queue is full, but since it's a linked list and cannot be full, always returns false
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * displays the queue
     */
    public void display() {
        if(head == null)
        {
            ;
        }
        else {
            Node<T> currNode = head;
            while(currNode.getNode() != null){
                System.out.println(currNode.getData());
                currNode = currNode.getNode();
            }
            System.out.println(curNode.getData());
        }
    }
}
