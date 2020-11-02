public class CircularList<T> implements ListInterface<T> {
    protected CLNode<T> tail;           // tail node that contains the last element of circular list
    protected int numElements = 0;      // number of elements in this list

    // instance variables that you may need for your method
    protected CLNode<T> previous;       // preceding node of target found
    protected boolean found;            // true if target found
    protected int targetIndex;          // index of the target found


    // constructor
    public CircularList(){
        tail = null;
        numElements = 0;
    }

    // show tail of the list
    public T getTail() {
        return tail.getInfo();
    }

    // check if list is empty
    public boolean isEmpty() {
        return numElements == 0;
    }

    // the number of elements in circular list
    public int size() {
        return numElements;
    }

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

    /////////////////// Your lab assignment starts from here ///////////////////

    /*
    Add the element to the end of the list, that is, make the new element to be tail.
     */
    public void add(T element) {
        /* 1. Fill your code here */

        /* 1. End of your code */
    }


    /*
    Find the first occurance of the element in this list.
    Note: find process should start from the first element of the list, not the tail
    i.e. list [5,2,3,5], find(5) should find the leftmost 5 instead of the 5 at the end.
    */
    public void find(T element) {
        /* 2. Fill your code here */

        /* 2. End of your code */
    }


    /*
    Remove the first occurance of the element in this list.
    Return true if success, false if not found.
    You may use find() for this implementation.
    */
    public boolean remove(T element) {
        /* 3. Fill you code here */

        /* 3. End of your code */
    }


    /*
    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index > size().
    Otherwise, adds element to this list at position index; all current
    elements at that position or higher have 1 added to their index
    */
    @Override
    public void add(int index, T element) {
        /* 4. Fill your code here */

        /* 4. End of your code */
    }


    /*
    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index >= size().
    Otherwise, replaces element on this list at position index with
    newElement and returns the replaced element.
    */
    @Override
    public T set(int index, T newElement) {
        /* 5. Fill you code here */

        /* 5. End of your code */
    }


    /*
    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index >= size().
    Otherwise, returns the element on this list at position index.
    */
    @Override
    public T get(int index) {
        /* 6. Fill your code here */

        /* 6. End of your code */
    }


    /*
    If this list contains an element e such that e.equals(target),
    then returns the index of the first such element.
    Otherwise, returns -1
    */
    @Override
    public int indexOf(T target) {
        /* 7. Fill your code here */

        /* 7. End of your code */
    }


    /*
    Throws IndexOutOfBoundsException if passed an index argument
    such that index < 0 or index >= size().
    Otherwise, removes element on this list at position index and
    returns the removed element; all current elements at positions
    higher than index have 1 subtracted from their position
    */
    @Override
    public T remove(int index) {
        /* 8. Fill your code here */

        /* 8. End of your code */
    }
}