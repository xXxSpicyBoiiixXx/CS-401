/*
# FILE: CLNode.java
# USAGE: --
# DESCRIPTION: Node of the program
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/06/2020
REVISION: --
*/

// Singly linked node, which stores a reference to its elements and subsequent node in the list.
public class CLNode<T> {

  public T information;
  public CLNode<T> next;

  public CLNode(T information)
  {
      this.information = information;
      this.next = null;
  }

  public CLNode(T information, CLNode<T> next)
  {
      this.information = information;
      this.next = next;
  }
}