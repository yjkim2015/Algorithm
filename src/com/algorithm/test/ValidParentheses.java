package com.algorithm.test;

import java.util.Stack;

/**
 * Input : "{[]}"
 * Output : true
 * 
 * Input : "()[]{}"
 * Output : true
 * 
 * Input : "([)]"
 * Output : false
 * 
 * Input : "(["
 * Output : false
 * 
 * @author kyj
 *
 */
public class ValidParentheses {

	public static void main(String[] agrs) {
		String exp="()[]{}";
		String exp2 = "([)]";
		
		System.out.println(isValid(exp));
	}
	
	public static boolean isValid(String s) {
		if ( s.length() % 2 != 0 ) return false;
		Stack<Character> stack = new Stack<>();
		
		for ( char one : s.toCharArray() ) {
			switch (one) {
			case ')': 
				if ( !stack.isEmpty() && stack.peek() == '(' ) {
					stack.pop();
				}
				break;
			case '}':
				if ( !stack.isEmpty() && stack.peek() == '{' ) {
					stack.pop();
				}
				break;
			case ']':
				if ( !stack.isEmpty() && stack.peek() == '[' ) {
					stack.pop();
				}
				break;
			
			default:
				stack.push(one);
			}
		}
		return stack.empty();
	}
}
