/*
# FILE: ParentheseValidator.java
# USAGE: --
# DESCRIPTION: 
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

public class ParenthesesValidator {
	// Design and implement a parentheses validator. Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
		// determine if the input string is valid. Return true if it is valid, otherwise, return false.
		// An input string is valid if:
		// (1)	Open brackets must be closed by the same type of brackets.
		// (2)	Open brackets must be closed in the correct order.
	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
}
