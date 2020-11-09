# Lab 08

### Exclude Files 

The following files should be excluded and deleted when running the makefile in the terminal. This is due to them being unused are not relative to the program as they were intial files given.

* CircularListTest.java
* out.txt

### Running the ciruclar linked list elimination game 

First type "make clean" to get rid of any .class files. From there compile the files with the "make" command and then type "make run" which will run the Main.java file and start the circular linked list elimination game. 

### How this program works 

This program will take the useage of circular lists and make an elimination game. This will read in a text file of names and then place all the names in a circular list and the user will elimnate memberes until there is one clear winner or exits the program. 

### Main.java 

This is the main driver file 

### CLNode.java

This is where the node of the circular list lies. 

### CircularList.java

This is where our circular linked list will be located. 

### ListInterface.java

This is where interfaces lie for the circular linked lists.

### CircleGame.java 

This is where our linked circular lists will be utilized for the various options in the elimination game 

### Input files 

There are three input files which containt 10, 100, and 1000 names. You can obviously make your own text files as well. 

1. 10names.txt
2. 100names.txt
3. 1000names.txt

### NoInformationException.java

Custom exception for the game.


