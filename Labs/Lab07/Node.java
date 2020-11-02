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

    // Data to be used in a node
    private T info;

    // node to follow current node
    private Node<T> node;

    /*
     * Constructing the node
     * @param info, information to be held inside the node
     * @param node, this will follow current node and can be set to the null value
     */
    Node(T info, Node<T> node) {
        this.info = info;
        this.node = node;
    }

    /*
     * Get method for the information for the node
     * @return T object of node
     */
    public T getInfo() {
        if (info == null) {
            throw new UnderflowException("Nah fam.");
        }
        return info;
    }

    /*
     * Get method for following the node
     * @return Following the node
     */
    public Node getNode() {
        if (node == null) {
            return null;
        }
        return node;
    }

    /*
     * Set method for information in a node
     * @param newInfo info to be placed in the node
     */
    public void setInfo(T newInfo) {
        this.info = newInfo;
    }

    /*
     * Set method for the following node
     * @param newNode node to be set
     */
    public void setNode(Node<T> newNode) {
        this.node = newNode;
    }
}
