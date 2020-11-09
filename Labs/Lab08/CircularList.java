/*
# FILE: CircularList.java
# USAGE: --
# DESCRIPTION: This is where our linked circular list will be contained for our game.
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/06/2020
REVISION: --
*/

// Implementing ListInterface file

import java.util.Collection;

public class CircularList<T> implements ListInterface<T> {

    public CLNode<T> head;
    public CLNode<T> tail;
    private int size;
    private CLNode<T> current;

    /*
     * Constructs an empty circular list
     */
    public CircularList() {
        head = null;
        tail = null;
        current = null;
    }

    /*
     * This give some information feed into the circular list
     * @param information, in this case its from the text file for names
     */
    public CircularList(T information) {
        head = new CLNode<T>(information);
        tail = null;
        head.next = tail;
        current = head;
    }


    /*
     * A collection that will add things to the circular list
     * @param collection, makes a circular list
     */
    public CircularList(Collection<T> collection) {
        head = null;
        tail = null;
        current = null;
        add(collection);
    }

    /*
     * This returns the size of the list
     * @return size, this number is how many items are within the list
     */
    public int size() {
        return size;
    }

    /*
     * Checks if the list is empty
     * @return head, which will be a null value
     */
    public boolean isEmpty() {
        return head == null;
    }

    /*
     * A node that follows for the next incoming node
     * @return head.next, this is the next object in the list
     */
    public CLNode<T> next() {
        return head.next;
    }

    /*
     * Searches through the list for any given list
     * @param information, this is feed into by the user
     */
    public CLNode<T> next(T information) throws NoInformationException {
        CLNode<T> current = head;
        while (current != null) {
            if (current.information.equals(information)) {
                return current.next;
            }

            current = current.next;
        }
        throw new NoInformationException("\"" + information + "\"" + "isn't here boi!!!!");
    }

    /*
     * This reassure that some given information exists
     * @param information, this is user feed in
     * @return true if the information is within the list, false otherwise
     */
    public boolean exists(T information) {

        CLNode<T> current = head;

        while (current != null) {
            if (current.information.equals(information)) {
                return true;
            }

            current = current.next;

            if (current.equals(head)) {
                break;
            }
        }
        return false;
    }

    /*
     * This adds to the size of the list and the list itself, size will increment by one
     * @param information, this is user feed in through the file
     */
    public void add(T information) {
        if (head == null) {
            head = new CLNode<T>(information);
            tail = null;
            head.next = tail;
            current = head;
        } else {
            current.next = new CLNode<T>(information);
            current = current.next;
            tail = current;
        }

        size++;
    }

    /*
     * This will add to the collection mark that is following the list
     * @param collection, this is where it will be user inputted and will add it to the collection
     */
    public void add(Collection<T> collection) {
        for (T item : collection) {
            add(item);
        }
    }

    /*
     * This will remove an item from the circular list
     * @return current, this is the placement of the current node, size of the list will also be denoted by one
     */
    public CLNode<T> remove() {
        CLNode<T> previous = head;
        CLNode<T> current = head.next;

        while (current != null) {
            if (current.equals(tail)) {
                previous.next = null;
                tail = previous;
                tail.next = null;
                break;
            }

            previous = previous.next;
            current = current.next;
        }
        size--;
        return current;
    }

    /*
     * This will remove to the collection mark that is following the list
     */
    public CLNode<T> removeHead() {
        CLNode<T> originalHead = head;
        head = head.next;
        size--;
        return originalHead;
    }

    /*
     * This search the list and remove the requested parameter.
     * @param information, this is user feed in
     * @return The node that was removed
     */
    public CLNode<T> remove(T information) throws NoInformationException {
        if (information.equals(tail.information)) {
            remove();
        } else if (information.equals(head.information)) {
            remove();
        }

        boolean removed = false;

        CLNode<T> previous = head;
        CLNode<T> current = head.next;
        CLNode<T> removedNode = null;

        while (current != null) {
            if (current.information.equals(information)) {
                removedNode = current;
                previous.next = current.next;
                current = current.next;

                if (current.next == null) {
                    tail = current;
                }

                removed = true;
                break;
            }

            previous = previous.next;
            current = current.next;
        }

        if (!removed) {
            throw new NoInformationException("\"" + information + "\"" + "isn't here boi!!!!");
        }
        size--;
        return removedNode;
    }

    @Override
    public String toString() {
        CLNode<T> current = head;
        StringBuilder builder = new StringBuilder();

        while (current != null) {
            if (current != tail) {
                builder.append(current.information).append("--->");
            } else {
                builder.append(current.information).append("FIN");
            }

            current = current.next;
        }
        return builder.toString();
    }
}
/*
public class CircularList<T> implements ListInterface<T> {
    protected CLNode<T> tail;           // tail node that contains the last element of circular list
    protected int numElements = 0;      // number of elements in this list

    // Instance variables that you may need for your method
    protected CLNode<T> previous;       // preceding node of target found
    protected boolean found;            // true if target found
    protected int targetIndex;          // index of the target found


    // Constructing an initially empty list
    public CircularList(){
        tail = null;
        numElements = 0;
    }

     * Displays the end of the tail
     * @return displays the information at the tail end of the data structure

    public T getTail() {
        return tail.getInfo();
    }


     * Checks if the list is empty
     * @return a numElements value of null, true if the linked list is empty, false otherwise

    public boolean isEmpty() {
        return numElements == 0;
    }

     * Gives the number of elements in the circular list
     * @return the value in numElements

    public int size() {
        return numElements;
    }

     * Displays the whole list per request of the user
     * @retunr circularListString which displays the information in the terminal setting

    // toString method
    public String toString() {
        String circularListString = "[";
        if (!isEmpty()){
            CLNode<T> curr = tail;
            do {
                curr = curr.getLink();
                if (curr != tail) {
                    circularListString += curr.getInfo() + ", ";
                } else {
                    circularListString += curr.getInfo();
                }
            } while (curr != tail);
        }
        circularListString += "]";
        return circularListString;
    }



     * Returns the first element of the list
     * @return the elements at the front of the list or null if it is empty

     * Add the element to the end of the list, that is, make the new element to be tail.
     * @param element, the new object or whatever the information is put in.

    public void add(T element) {

        if(size() == 0){
            tail = new CLNode<>(element, null);
            tail.setLink(tail);
        }

    }

    Find the first occurance of the element in this list.
    Note: find process should start from the first element of the list, not the tail
    i.e. list [5,2,3,5], find(5) should find the leftmost 5 instead of the 5 at the end.

    public void find(T element) {

    }
    Remove the first occurance of the element in this list.
    Return true if success, false if not found.
    You may use find() for this implementation.

    public boolean remove(T element) {

    }

    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index > size().
    Otherwise, adds element to this list at position index; all current
    elements at that position or higher have 1 added to their index

    @Override
    public void add(int index, T element) {

    }

    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index >= size().
    Otherwise, replaces element on this list at position index with
    newElement and returns the replaced element.

    @Override
    public T set(int index, T newElement) {

    }

    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index >= size().
    Otherwise, returns the element on this list at position index.

    @Override
    public T get(int index) {

    }

    If this list contains an element e such that e.equals(target),
    then returns the index of the first such element.
    Otherwise, returns -1

    @Override
    public int indexOf(T target) {

    }

    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index >= size().
    Otherwise, removes element on this list at position index and
    returns the removed element; all current elements at positions
    higher than index have 1 subtracted from their position

    @Override
    public T remove(int index) {
      }

 */