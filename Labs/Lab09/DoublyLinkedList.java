/*
# FILE: DoublyLinkedList.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/08/2020
REVISION: --
*/

/*
 * DoublyLinkedList.java, this is offers a list of functions for this data structure,
 * all the functionality is shown below.
 */

public class DoublyLinkedList<T> {
    DoubleLinkedNode<T> head;
    DoubleLinkedNode<T> tail;
    public int size = 0;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtStart(T element){

        DoubleLinkedNode<T> newNode = new DoubleLinkedNode<>(element);

        if(head == null){

            newNode.next = null;
            newNode.previous = null;
            head = newNode;
            tail = newNode;
            size++;
        }

        else{
            newNode.next = head;
            newNode.previous = null;
            head.previous = newNode;
            head = newNode;
            size++;
        }
    }

    public void insertAtTail(T element){

        DoubleLinkedNode<T> newNode = new DoubleLinkedNode<>(element);

        if(tail == null){

            newNode.next = null;
            newNode.previous = null;
            head = newNode;
            tail = newNode;
            size++;
        }

        else{

            tail.next = newNode;
            newNode.next = null;
            newNode.previous = tail;
            tail = newNode;
            size++;
        }
    }

    public void insertAtIndex(T element, int index){

        if(index < 0 || index > size) {
            throw new IllegalArgumentException("Index is Invalid");
        }

        if(index == 0){
            insertAtStart(element);
        }

        else if(index == size - 1){
            insertAtTail(element);
        }

        else{

            DoubleLinkedNode<T> currentNode = head;

            for(int i = 0; i < index; i++){
                currentNode = currentNode.next;
            }

            DoubleLinkedNode<T> previousNode = currentNode.previous;
            DoubleLinkedNode<T> newNode = new DoubleLinkedNode<>(element);
            newNode.next = currentNode;
            newNode.previous = previousNode;
            previousNode.next = newNode;
            currentNode.previous = newNode;
            size++;

        }
    }

    public void traverseForward(){
        DoubleLinkedNode<T> temp = head;

        while(temp != null){
            System.out.println(temp.info);
            temp = temp.previous;
        }
    }

    public void tranverseBackward(){
        DoubleLinkedNode<T> temp = tail;

        while(temp != null) {
            System.out.println(temp.info);
            temp = temp.previous;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public DoubleLinkedNode<T> searchByIndex(int index){

        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        DoubleLinkedNode<T> temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public DoubleLinkedNode<T> searchByValue(T element){

        DoubleLinkedNode<T> temp = head;

        while(null != temp.next && temp.info != element){
            temp = temp.next;
        }

        if(temp.info == element){
            return temp;
        }

        return null;
    }

    public void deleteFromHead(){
        if(head == null){
            return;
        }
        DoubleLinkedNode<T> temp = head;

        head = temp.next;
        head.previous = null;
        size--;
    }

    public void deleteFromTail(){

        if(tail == null){
            return;
        }

        DoubleLinkedNode<T> temp = tail;
        tail = temp.previous;
        tail.next = null;
        size--;
    }

    public void deleteFromIndex(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Invalid Index");
        }

        DoubleLinkedNode<T> nodeDeleted = head;

        for(int i = 0; i < index; i++){
            nodeDeleted = nodeDeleted.next;
        }

        DoubleLinkedNode<T> previousNode = nodeDeleted.previous;
        DoubleLinkedNode<T> nextNode = nodeDeleted.next;

        previousNode.next = nextNode;
        nextNode.previous = previousNode;
        size--;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        int i = 0;

        for(DoubleLinkedNode<T> counter = head; counter != null; counter = counter.next){
            result[i++] = counter.info;
        }
        return result;
    }


  /*  // Create a node using the input newInfo and add this before the head
    public void push(char newInfo) {
        DoubleLinkedNode insertAtStart = new DoubleLinkedNode(newInfo, null, null);



    // Create a node using the input newInfo and add this after the tail
    public void append(char newInfo) {
        DoubleLinkedNode insertAtEnd = new DoubleLinkedNode(newInfo, null, null);

    }

    // Create a node using the input newInfo and add this node before a given node
    public void insertBefore(char newInfo, DoubleLinkedNode node) {

    }

    // remove the given node from the list
    public void delete(DoubleLinkedNode node) {

    }

    // return the size of the list
    public int size() {
        return size;
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

        DoubleLinkedNode posSpec = new DoubleLinkedNode(newInfo, null, null);

        if(index == 1){
            push(newInfo);
            return;
        }

        DoubleLinkedNode ptr = head;

        for(int i = 2; i <= size; i++){
            if(i == index){
                DoubleLinkedNode tmp = ptr.getNext();
                ptr.setNext(posSpec);
                posSpec.setPrevious(ptr);
                posSpec.setNext(tmp);
                tmp.setPrevious(posSpec);
            }
            ptr = ptr.getNext();
        }
        size++;

    }

    // Delete the node at input index and return the info of deleted node.
    // E.g. if the list is a, b, c, d, e, after deleteAt(2), the list will be a, b, d, e
    // If you input an index which is less than 0 or greater than/equal to the size of list, don't delete anything, return null
    public void deleteAt(int index) {

        if(index == 1){
            if(size == 1){
                head = null;
                tail = null;
                size = 0;
                return;
            }

            head = head.getNext();
            head.setPrevious(null);
            size--;
            return;
        }

        if(index == size){
            tail = tail.getPrevious();
            tail.setNext(null);
            size--;
        }

        DoubleLinkedNode ptr = head.getNext();

        for(int i = 2; i <= size; i++){
            if(i == index){
                DoubleLinkedNode prev = ptr.getPrevious();
                DoubleLinkedNode next = ptr.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
                size--;
                return;
            }

            ptr = ptr.getNext();
        }


    }


    // Get the info of the node at input index.
    // E.g. if the list is a, b, c, d, e, after getNodeAt(2), it will return a node c.
    // if index < 0 or >= size(), return null;
    public DoubleLinkedNode getNodeAt(int index) {


        int i;

        if(index < 0 || index >= size){
            System.out.println("No nodes bruh, you done messed up A-ARON.\n");
        }

        if(index < )

    }


    public DoubleLinkedNode getHead() {
        return head;
    }

    public void setHead(DoubleLinkedNode head) {
        this.head = head;
    }

    public DoubleLinkedNode getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedNode tail) {
        this.tail = tail;
    }


    public String toString() {
        DoubleLinkedNode currentNode = head;
        String result = "";

        while(currentNode != null) {
            result +=  currentNode.getInfo();
            currentNode = currentNode.getNext();
        }
        return result;
    }

    public String toReverseString() {
        DoubleLinkedNode currentNode = this.tail;
        String result = "";

        while(currentNode != null) {
            result +=  currentNode.getInfo();
            currentNode = currentNode.getPrevious();
        }

        return result;
    }

    public boolean equals(DoublyLinkedList l) {
        return this.toString() == l.toString() && this.toReverseString() == l.toReverseString();
    }
   */
}