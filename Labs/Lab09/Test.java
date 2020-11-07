import java.lang.*; 
import java.io.*; 
import java.util.*;

public class Test {
	public static void main(String[] args) {
		double[] points = {2.5,2.5,2.5,2.5,2.5,2.5,2.5,2.5};
		int index = -1;
		double grade = 0;
//		1. public void push(char newInfo)
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();
			
			char[] input = {'a', 'b', 'c', 'd', 'e'};
			String[] expected_output = {"a", "ba", "cba", "dcba", "edcba"};
			int len = input.length;
			for(int i=0; i<len; i++) {
				l.push(input[i]);
				if(! verify(l, expected_output[i])) {
					count ++;
				}
			}
			
			double p = getPoint(count, len, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}

//		2. public void append(char newInfo)
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();
			
			char[] input = {'a', 'b', 'c', 'd', 'e'};
			String[] expected_output = {"a", "ab", "abc", "abcd", "abcde"};
			int len = input.length;
			for(int i=0; i<len; i++) {
				l.append(input[i]);
				if(! verify(l, expected_output[i])) {
					count ++;
				}
			}
			
			double p = getPoint(count, len, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}
			
//		3. public void insertBefore(char newInfo, DoubleLinkedCharNode node) 
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();
			l.append('x');
			l.append('y');
			l.append('z');
			char[] input = {'a', 'b', 'c', 'd', 'e'};
			String[] expected_output = {"xayz", "xabyz", "xabcyz", "xabcdyz", "xabcdeyz"};
			int len = input.length;
			DoubleLinkedCharNode node = l.getHead().getNext();
			
			for(int i=0; i<len; i++) {
				l.insertBefore(input[i], node);
				if(! verify(l, expected_output[i])) {
					count ++;
				}
			}
			
			l.insertBefore('f', l.getHead());
			if(! verify(l, "fxabcdeyz")) {
				count ++;
			}
			
			
			double p = getPoint(count, len+1, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}
		
//		4. public void delete(DoubleLinkedCharNode node)
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();

			char[] input = {'a', 'b', 'c', 'd', 'e'};
			int len = input.length;
			
			for(int i=0; i<len; i++) {
				l.append(input[i]);
			}
			
			DoubleLinkedCharNode node = l.getHead();
			l.delete(node);
			if(! verify(l, "bcde") || node.getNext() != null || node.getPrevious() != null)
				count ++;
			
			node = l.getTail();
			l.delete(node);
			if(! verify(l, "bcd") || node.getNext() != null || node.getPrevious() != null)
				count ++;
			
			
			node = l.getHead().getNext();
			l.delete(node);
			if(! verify(l, "bd") || node.getNext() != null || node.getPrevious() != null) {
				count ++;
			}
			
			node = l.getHead().getNext();
			l.delete(node);
			if(! verify(l, "b") || node.getNext() != null || node.getPrevious() != null) {
				count ++;
			}
			
			node = l.getHead().getNext();
			l.delete(node);
			if(! verify(l, "b")) {
				count ++;
			}
				
			double p = getPoint(count, 5, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}
		
//		5. public int size() 
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();

			char[] input = {'a', 'b', 'c'};
			int len = input.length;
			int[] expected_output = {1,2,3};
			
			if(l.size() != 0)
				count ++;
	
			for(int i=0; i<len; i++) {
				l.append(input[i]);
				
				if(l.size() != expected_output[i])
					count ++;
			}
			
			l.delete(l.getTail());
			if(l.size() != 2)
				count ++;
			
			double p = getPoint(count, 5, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}
		

//		6. public void insertAt(char newInfo, int index) 
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();
			
			l.insertAt('a', -1);
			if(! verify(l, "a"))
				count ++;
			
			l.insertAt('b', 10);
			if(! verify(l, "ab"))
				count ++;
			
			l.insertAt('c', 1);
			if(! verify(l, "acb"))
				count ++;
			
			l.insertAt('d', 0);
			if(! verify(l, "dacb"))
				count ++;
			
			l.insertAt('e', 3);
			if(! verify(l, "daceb"))
				count ++;
			
			double p = getPoint(count, 5, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}
		
		
		
//		7. public void deleteAt(int index)
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();
			
			char[] input = {'a', 'b', 'c', 'd', 'e'};
			int len = input.length;
			
			for(int i=0; i<len; i++) {
				l.append(input[i]);
			}
			
			l.deleteAt(-5);
			if(! verify(l, "abcde"))
				count ++;
			
			l.deleteAt(10);
			if(! verify(l, "abcde"))
				count ++;
			
			l.deleteAt(0);
			if(! verify(l, "bcde"))
				count ++;
			
			l.deleteAt(3);
			if(! verify(l, "bcd"))
				count ++;
			
			l.deleteAt(1);
			if(! verify(l, "bd"))
				count ++;
			
			double p = getPoint(count, 5, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}	
//		8. public DoubleLinkedCharNode getNodeAt(int index)
		{
			index ++;
			int count = 0;
			System.out.println(String.format("Block %d", index+1));
			DoublyLinkedCharList l = new DoublyLinkedCharList();
			
			char[] input = {'a', 'b', 'c', 'd', 'e'};
			int len = input.length;
			
			for(int i=0; i<len; i++) {
				l.append(input[i]);
			}
			
			if(l.getNodeAt(-1) != null)
				count ++;
			
			if(l.getNodeAt(5) != null)
				count ++;
			
			if(l.getNodeAt(0).getInfo() != 'a')
				count ++;
			
			if(l.getNodeAt(4).getInfo() != 'e')
				count ++;
			
			if(l.getNodeAt(3).getInfo() != 'd')
				count ++;
			
			double p = getPoint(count, 5, points[index]);
			System.out.println(String.format("Points: %.2f / %.2f", p, points[index]));
			grade += p;
		}
		
		
		System.out.println(String.format("Total : %.2f / %d", grade, 20));
	}
	
	public static String getReverseString(String input) {
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
       return input1.toString();
	}
	
	public static boolean verify (DoublyLinkedCharList l, String s) {
		return l.toString().equals(s) && l.toReverseString().equals(getReverseString(s));
	}
	
	public static double getPoint(double failureNum, double totalNum, double totalPoints) {
		double thred = 0.5;
		
		if(failureNum == 0)
			return totalPoints;
		else if(failureNum == 1)
			return totalPoints * thred;
		else 
			return totalPoints * thred * (totalNum - failureNum) / (totalNum - 1);
	}
}
	
