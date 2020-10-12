/*
# FILE: ParentheseValidator.java
# USAGE: --
# DESCRIPTION: Validates that an inputed string has open brackets closed by the same type of brackets in the correct order. 
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/26/2020
REVISION: --
*/


package Lab05;

import java.util.HashMap;

public class ParenthesesValidator {

	static boolean isValid(String s) {
		
		// Using Arrays are faster than using a stack but we will use 
		// stacks for the excersize, but I would rather use arrays for this. 
		// This still works. 
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		CharStack<Character> stack = new CharStack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
	 
			if (map.keySet().contains(x)) {
				stack.push(x);
			} else if (map.values().contains(x)) {
				
				if (!stack.isEmpty() && map.get(stack.peek()) == x) {
					
					stack.pop();
				} else {
					
					return false;
				}
			}
		}
	 
		return stack.isEmpty();
			
	}
}
