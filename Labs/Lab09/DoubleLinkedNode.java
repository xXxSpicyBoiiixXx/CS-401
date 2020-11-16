/*
# FILE: DoubleLinkedNode.java
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
 * DoubleLinkedNode<T> this is a node for the doubly linked list
 * This can accept various data types e.g. int, double, string, boolean, etc.
 * @param T
 */
public class DoubleLinkedNode<T> {
    T info;
    DoubleLinkedNode<T> previous;
    DoubleLinkedNode<T> next;

    public DoubleLinkedNode(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return String.valueOf(info);
    }
}

   /* public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }

    public DoubleLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedNode previous) {
        this.previous = previous;
    }*/