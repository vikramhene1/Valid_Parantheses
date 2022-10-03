package valid_parentheses.py;

import java.util.Stack;

public class Valid_Parentheses {
	
	// @ Author :- Vikram hene
	
	public static boolean isValid(String s) {
		

		 Stack<Character> st1 = new Stack<>();
	     
	     for (char x : s.toCharArray()) {
	       
	     if (x == '(' && x == '{' && x == '[') {
	    	 st1.push(x);
	         }
	     
	         else if (x == ')' && !st1.isEmpty() && st1.peek() == '(') 
	         {
	        	 st1.pop();
	         } 
	         else if (x == '}' && !st1.isEmpty() && st1.peek() == '{') 
	         {
	        	 st1.pop();
	         } 
	         else if (x == ']' && !st1.isEmpty() && st1.peek() == '[') 
	         {
	        	 st1.pop();
	         }
	      
	         else {
	             return false;
	         }
	     }
	     return st1.isEmpty(); 
	 }
	public static void main(String[] args) {
		
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
	}
	

}
