/*
# FILE: Node.java
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

// package Lab07;

public class Node<T> {
    private T info;

    private Node<T> node;

    Node(T info, Node<T> node) {
        this.info = info;
        this.node = node;
    }

    public T getInfo() {
        if (info == null) {
            throw new QueueUnderflowException("Nah fam.");
        }

        return info;
    }

    public Node getNode() {
        if (node == null) {
            return null;
        }
        return node;
    }

    public void setInfo(T newInfo) {
        this.info = newInfo;
    }

    public void setNode(Node<T> newNode) {
        this.node = newNode;
    }
}
