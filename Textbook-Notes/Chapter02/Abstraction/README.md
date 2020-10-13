# Abstraction

* Abstraction: A model of a system that includes only the details essentail to the perspective of the viewer of the system. 

* An important note, abstraction is a key tool in the contruction of large complex systems. We partition our systems into separate modules, each with their own responsibilities. The details of each module are hidden inside the module, this means that a module present only a controlled interface to its functionality to the outside. 

* Module: A cohesive system subunit that performs a share of the work. In java the primary module mechanism is the class. Decompsoning a system using classes and obijects generated from classes helps us handle complexity. 

* Information Hiding: The practice of hiding details within a module with the goal of simplifying the view of the module for the rest of the system.

* Data Abstraction: The separation of a data type's logical properties from its implementation. This has the ultimate goal of hiding the irrelevant details of the computer's view of data from our own this is another view. 

* Data Encapsulation: Programming language feature that enforces information hiding, allowing internal representation of data and the details of the operations on the data to be encapsulated together within a single construct.

* Abstract Date Type (ADT): A data type whose properties (domain and operations) are specified independently of any particular implementation. 

* In ADTs there is three different levels which are application, abstract, and implementation. 

* Application Level: This is known as a user or client. This means we only need to know hwat program statements to use to create instances of the ADT and invokes its operations. 

* Abstract Level: Logical level, this level particularly gives an abstract view of the data vaules or domains and the set of operations to manipulate them. We generally are dealing with questions like.... What is the ADT? What does it model? What are its responsibilites? What is its interface?

* Implementation Level: The implementation programmer designs and develops a specific representation of the strucutre to hold the data as well as the implementation of the opertaions. The questions that we are interested in are...How do we represent and manipulate the data? How do we fulfill the responsibilites of the ADT?

* Its important to know all three levels. Sometimes we will work at the application level and use an ADT; at other times we will implement the ADT used by applications. In all cases, the abstract view will act as a guide. 

* Preconditions: Conditions of a method that must be true when invoking a method for the method to work correctly. Establishing the preconditions for a method creates a contract between the programmer who implement the method and the programmers who use the method. 

* Postconditions (effects): The results of a method expected at the exti of the method, assuming the preconditions are meet. 

* Abstract Method: Includes only a description of its parameters; no method bodies or implementations are allowed.  

* Java interfaces cannot be instantiated. They can only be implemented by classes or extended by other interfaces. 

* Utilzing java interface constructs in the example code gives sever beneifits

1. We can formally check the syntax of our specficiation. When the interface compiled, the compuler uncovers any syntactical errors in the method interface definitions.

2. We can formally verify that the syntactial part of the interface contract is satisfied by the implementation. When the implementation is compuled will match all those defined in the interface and make sure everything is where it should be. 

3. We can provide a consistent interface to applications from among alternative implemenation of the ADT. Some implementation amy optimize such and such or use this or that but overall they should all of the implementation will have the specified interface in common. 

* Polymorphic object variables are able to reference objects of different classes at differnet times during the execution of a program.  

