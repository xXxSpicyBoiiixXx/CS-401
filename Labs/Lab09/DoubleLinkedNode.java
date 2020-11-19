0/*
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

public class DoubleLinkedNode<T> {
    private T info;
    private DoubleLinkedNode<T> previous;
    private DoubleLinkedNode<T> next;

    public DoubleLinkedNode() {
        info = null;
        previous = null;
        next = null;
    }

    public void setNodeInfo(T info) {
        this.info = info;
    }

    public void setPrevNode(DoubleLinkedNode<T> node) {
        this.previous = node;
    }

    public void setNextNode(DoubleLinkedNode<T> node) {
        this.next = node;
    }

    public T getNodeInfo(T info) {
        return this.info;
    }

    public DoubleLinkedNode<T> getPrevNode(DoubleLinkedNode<T> node) {
        return this.previous;
    }

    public DoubleLinkedNode<T> getNextNode(DoubleLinkedNode<T> node) {
        return this.next;
    }

    public String toString() {

        String str = "";

        try {
            str = info.toString();
        } catch (NullPointerException e) {
            str = "Empty AF";
        }
        return str;
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