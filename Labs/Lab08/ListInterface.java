/*
# FILE: CircularList.java
# USAGE: --
# DESCRIPTION: This is used in the CircularList file to throw exceptions and all
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/06/2020
REVISION: --
*/

import java.util.Collection;

/*
 * Everything that was provided in the lab was commented out at the end of this code
 * I needed to make some changes, I didn't like the set up
 */
public interface ListInterface<T> {

    // Quick references
    int size();
    boolean isEmpty();
    CLNode<T> next();
    CLNode<T> next(T information) throws NoInformationException;
    boolean exists(T information);
    void add(T information);
    void add(Collection<T> collection);
    CLNode<T> remove();
    CLNode<T> removeHead();
    CLNode<T> remove(T information) throws NoInformationException;


    /*void add(int index, T element);
    // Throws IndexOutOfBoundsException if passed an index argument
    // such that index < 0 or index > size().
    // Otherwise, adds element to this list at position index; all current
    // elements at that position or higher have 1 added to their index.

    T set(int index, T newElement);
    // Throws IndexOutOfBoundsException if passed an index argument
    // such that index < 0 or index >= size().
    // Otherwise, replaces element on this list at position index with
    // newElement and returns the replaced element.

    T get(int index);
    // Throws IndexOutOfBoundsException if passed an index argument
    // such that index < 0 or index >= size().
    // Otherwise, returns the element on this list at position index.

    int indexOf(T target);
    // If this list contains an element e such that e.equals(target),
    // then returns the index of the first such element.
    // Otherwise, returns -1.

    T remove(int index);
    // Throws IndexOutOfBoundsException if passed an index argument
    // such that index < 0 or index >= size().
    // Otherwise, removes element on this list at position index and
    // returns the removed element; all current elements at positions
    // higher than index have 1 subtracted from their position
     */
}