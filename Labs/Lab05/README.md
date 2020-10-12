# Lab 05

## Notes

* This lab contains stacks, nodes, and linked lists without the used of bulit libraries. Also, there is a parentheses validator that the user can choose to implement instead of stack with the main file. For the lab there is text file implementation that will pull for that file instaed of user input if the user chooses to do so. In addition, I have added some important take away from the lab below. 

* I did add a generic makefile but that will not work completly with this lab as I am going to implement vim programming instead of the eclipsse IDE as we have been using, if there are any questions about this change please let me know. 

### Node Object
Nodes are objects that contain information about certain attributes. The formal definiation is that a node object represents a single node which can be an element node, attribute node, text node, etc. You will notice later thaat while all objects inheritss the node methods for dealing with parnets and children, not all object can have parents or children. For examples, text nodes may not have children and if you attempt to add children you will run into a DOM error. In this lab we took a charcter node or you can call it a string as well, that took input and saved that characterist as the node. 

### Linked List
A linked list is a linear data structure where each element is a separate object. Thses are not stored at a loction but the elements are linked using pointers. In the lab we used this for our nodes, hence each node of a list is made up of two items, the data nad a reference to the next node, for the last nodei n the list the reference will be null. Hence, giving the name of linked list. 

### Stack 
A stack is an access-controlled structure in which elements are added or removed from only one end. This has a LIFO structure or Last-In-First-Out mechnicsm. Here in the lab we implemented a link-based stack where this uses defineded link list to implement a stack. 


