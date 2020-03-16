package Strings._20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	
	private final static Map<Character, Character> parentheses = new HashMap<>();
	
	static {
		parentheses.put('{', '}');
		parentheses.put('[', ']');
		parentheses.put('(', ')');
	}
	
	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	 * determine if the input string is valid.
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		if(s == null || "".equals(s)) return true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(parentheses.containsKey(ch)) {
				stack.push(parentheses.get(ch));
			}else {
				if(!stack.empty() && ch == stack.peek()) 
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
    }
}
