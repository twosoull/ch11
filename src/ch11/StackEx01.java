package ch11;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		String me = "((2+3)*12)";
		try {
		for(int i= 0; i < me.length(); i++) {
			char ch = me.charAt(i);
			
			if(ch == '(') {
				stack.push(ch+"");
			}else if( ch == ')') {
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("괄호가 일치합니다");
		}else {
			System.out.println("괄호가 일치하지 않습니다");
		}
		}catch (Exception e) {
			System.out.println("괄호가 일치하지 않습니다2.");
		}
	}
}
