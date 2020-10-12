double[][] alpha;

// intizlising the array with 100 rows and then 9 columns. 
alpha = new double[100][9];

// Putting a value in a specific area 
alpha[0][5] = 36.4;

// Printing out the number of of rows

System.out.println(alpha.length);

// To obtain the number of columbs in a row of an array, we access the length field for the specific row. Like below: 

rowLength = alpha[30].length;
System.out.println(rowLength);
