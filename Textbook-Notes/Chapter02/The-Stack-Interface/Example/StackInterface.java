public interface StackInterface<T> 

{	
	// Throws StackOverflowException if the stack is full 	
	// Otherwise just palce element at the top of this stack
	void push(T elements) throws StackOverflowException;

	// Throws StackUnderflowException if the stack is empty
	// Otherwise removes top element
	void pop() throws StackUnderflowException;

	// Throws StackUnderflowException if the stack is empty
	// Otherwise returns top element of the stack
	T top() throws StackUnderflowException;

	// Returns true if the stack is full, otherwise false
	boolean isFull();

	// Return true if the stack is empty, otherwise false
	boolean isEmpty();

}
