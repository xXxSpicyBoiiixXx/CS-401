/*
# FILE: NodeStacking.java
# USAGE: --
# DESCRIPTION: 
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 10/08/2020
REVISION: --
*/

import java.util.Scanner;

public class NodeStacking {

 // Calculates specific node in the pyramid 
    public static double weightSupporting(int row, int col) {
        
    	int weight; 
        double support; 
        
        int j = 1;
    	
        System.out.println("Please input supporting weight");
        
        Scanner input = new Scanner(System.in);
      
        weight = input.nextInt();
        support = weight;
    		
        // Going through number of rows and columns
        	for(int i = 1; i <= weight; i=i*2) {
        		System.out.println("Row: " + j + " "+ weight/i);
        
        	// Checks if the column can exists
        	if(row == j && col > i)
        	{
        		System.out.println("No node at that column");
        		return -1;
        	}
        	
        	// Adds the supporting weight
        	else if(row >= j && i != 1)
        	{
        		support = support + weight/i;
        	}
        	
        	j++;
     
        	}

        input.close();
        return support;
    	
    }
}