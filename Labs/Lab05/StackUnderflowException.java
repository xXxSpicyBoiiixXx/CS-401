/*
# FILE: StackUnderflowException.java
# USAGE: --
# DESCRIPTION: Checks for underflow.
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/05/2020
REVISION: --
*/

package Lab05;


// If the stack is empty an error message will appear.

public class StackUnderflowException extends RuntimeException {
	
	public StackUnderflowException() {
		super();
	}
	
	public StackUnderflowException(String message) {
		super(message);
	}

}
