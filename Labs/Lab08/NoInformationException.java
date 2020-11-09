/*
# FILE: NoInformationException.java
# USAGE: --
# DESCRIPTION: Custom made exception that extends the already exceptions
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
 * New custom exception to use with in the code
 * Will be thrown around in the code
 */
public class NoInformationException extends Exception {
    public NoInformationException(String message) {
        super(message);
    }
}
