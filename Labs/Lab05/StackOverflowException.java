/*
# FILE: StackOverflowflowException.java
# USAGE: --
# DESCRIPTION: Not used in the code as there should not be an overflow but included here just in case.
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


// Throws error if the stack is overflowing but this should not happen
public class StackOverflowException extends RuntimeException {

    public StackOverflowException() {
        super();
    }

    public StackOverflowException(String message) {
        super(message);
    }
}