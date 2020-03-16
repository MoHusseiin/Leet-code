package Arrays._394;

import java.util.Stack;

public class DecodeString {
	
	private Stack<String> strStack;
    private Stack<Integer> numStack;
	
	public DecodeString() {
		strStack = new Stack<>();
		numStack =  new Stack<Integer>();
	}
	
	public String decodeString(String s) {
		
		if(s == null || s.isEmpty()) return s;		
		StringBuilder decoded = new StringBuilder();
		int index = 0;
		while(index < s.length()) {
			char c = s.charAt(index);
			if(Character.isDigit(c)) {
				int num = 0;
				while (Character.isDigit(s.charAt(index))) {
					num = num * 10 + Character.getNumericValue(s.charAt(index)) ;
					index++;
				}
				numStack.push(num);
				continue;
			} else if(c == '[') {
				strStack.push(decoded.toString());
				decoded = new StringBuilder("");
			} else if(c == ']' && !(strStack.isEmpty() || numStack.isEmpty())) {
				StringBuilder temp = new StringBuilder(strStack.pop());
				int repetedIndex = numStack.pop();
				for (int i = 0; i < repetedIndex; i++) {
					temp.append(decoded);
				}
				decoded = temp;
			}else
				decoded.append(c);
			index++;
		}
		return decoded.toString();
    }
}
