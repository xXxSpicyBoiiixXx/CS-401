
// Defining an array of circle objects. Declaring and creating the array of objects is exacly like declaring an array of componenet are primitive types. 
// This array hold 10 reference to Circle objects. 
// To say this more technical, we can say "allCircles is an array of references to Circle objects, taht are set to null when the array is instantianted." 

Circle [] allCircles = new Circle[10];

// The objects must be instantiated separately, the following segmenet initializes the first and second circles. 
allCircles[0] = myCircle; 
allCircles[1] = new Circle(4); 
