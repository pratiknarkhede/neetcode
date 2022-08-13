package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String str = ")]";
		boolean isValid = isValid(str);
		System.out.println(str + " : " + isValid);

	}

	private static boolean isValid(String str) {
		//fails at "(["
		if(str.length()%2==1)return false;
		Stack<Character> stack = new Stack<>();
		char[] charArray=str.toCharArray();
		for(char ch: charArray) {
			if(ch=='('||ch=='['||ch=='{') {
				stack.add(ch);
			}
			else if(ch==')' && !stack.empty() && stack.peek()==ch) {
				stack.pop();
			}
			else if(ch==']' && !stack.empty() && stack.peek()==ch) {
				stack.pop();
			}
			else if(ch==']' && !stack.empty() && stack.peek()==ch) {
				stack.pop();
			}
		}
		return stack.empty();
	}

	private static boolean isValid1(String str) {
		if(str.length()%2==1)return false;
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		
		//identify which closing bracket matches with which opening bracket 
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for (char ch : str.toCharArray()) {			
			if (map.containsKey(ch)) {
				// if closing bracket and stack is empty before adding it 
				// or if closing bracket does not match with opening bracket at top, return false
				if (stack.empty() || (map.get(ch) != stack.peek())) {
					return false;
				} else {
					stack.pop();
				}
			} else {
				// if not a closing bracket add to stack
				stack.add(ch);
			}

		}
		return stack.empty();
	}
}
