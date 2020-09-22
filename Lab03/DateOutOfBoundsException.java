/*
# FILE: DateOutOfBoundsException.java
# USAGE: --
# DESCRIPTION:
# OPTIONS: --
# REQUIREMENTS: User Input
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/13/2020
REVISION: --
*/

package Lab03;


// Message outputed to the user if there is a invalid date inputed
public class DateOutOfBoundsException extends Exception
{
  public DateOutOfBoundsException()
  {
    super();
  }

  public DateOutOfBoundsException(String message)
  {
    super(message);
  }
}
