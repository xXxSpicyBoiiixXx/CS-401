# Basic Structuring Mechanisms

* Everything we meantioned in the previous section of "Data Strucutres" can be implemented using two mechanisms, the reference and the array. 

* Direct Addressing: The memeory location associated with the variable hold the value of the variable. This is how primitive variables are used in Java. 

* Indirect Addressing: The memory location assoicated with the variable hold the address of the location that holds the value of the variable. This is how reference variables are used in Java. 

* Primitive types such as int type are handled by value while nonprimitive types such as arrays and classes are handled by reference. This means that the variables of a primitive type holds the value of the vairable, the variable of a nonprimitive type holds a reference to the value of the vairable. 

* Aliases: An alias of an object is when there is two different "names" that point to the same object. SO they point to the same value with different names. 

* Garbage: A memory space that havs been allocated to a program but can no longer be accessed by a program. 

* Garbage Collection: When an object is unreachable, the Java run-time system markes it as garbage. It identifies unreadable object and deallocated their storage space, returning to the free pool for the creation of new objects. 

* Dynamic Memory Management: Creating and destroying objects at different points in the application by allocating and deallocating space in the free pool. 

* All java arguemnets are "passed by value." If the arguement is of a primitive type, it represents the value of the primitive. If the arguement is of a reference type, then it represent the address of the object. 

### Arrays 

* Arrays are nonprimitive, so meaning they are handeled by reference just like objects. Somethings to consider

* What are the initial values in an array in an array instanitiated by using new? If the array components are primitive types, they are set to their default value. IF the array componnents are reference types, such as arrays or classes, the componenets are set to null. 

* Can you provide initial values for an array? Yes! An alternative way to create an array is with an initializer list. This is shown below. 
int number [] = {5, 32, -1, 0, 66, 32, 32};

* What happens if we try: 
numbers[n] = value;

where n is less than 0 or when n is greater than 7. If the program attempts to use an index that is not within the bounds of the array, an ArrayIndexOutOfBoundsException is thrown. We can use number.length() to check the length of the array. 

* An array of objects is the same but instead of having a primitive type we have an array whose componenets are objects. 

* Two dimensional arrays, are strucutred in the fashion of array[rows][columns] We can note that array.length would give the number of rows in the array. To obtain the number of coloumns in a row of an array, we access the lenght field for a specific row. Look at the example code for this. 
