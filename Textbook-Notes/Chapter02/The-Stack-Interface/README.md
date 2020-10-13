# The Stack Interface 

* This is a formal view of our ADT of the stack. 

* Looking at exceptional cases. Creating the stack as an empty or null stack will not create anny error. The other operation that are consistent of push, pop, and top will have some exceptions thrown in. 

* Both opertaions of pop and top both refer to manipulating the top element, where if the stack is empty then there is no top element to manipulate. There are three errors java may throw at you. 

1. Handle the error within the method itself 
2. Throw an exception 
3. Ignore it

* How would the error be handled? We know that pop is a transformer, so it could simply do nothing when it is invoked on an empty stack. For the top though, whcih must return an object or the top of the stack, the return type will be null. This seems like good enough but it may complicate code later on. 

* Here's an alternative, suppose we make a precondition that a stack must not be empty before calling the top or pop? Then we don't have to worry about the handling the situation wihin the ADT. We can't expect this so we can implement somehting called an isEmpty() finction that will return a boolean value of true if the stack is empty. Below is sort of an example.

if(!myStack.isEmpty())
	myObject = myStack.top();

* We can do better by implemented an exception thing for a try catch statement with a StackUnderflowStatement, we can see that in examples.  
