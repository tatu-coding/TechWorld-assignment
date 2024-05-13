package tyuukan_kadai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExpressionParser {
	
	private static final Map<String, Integer> precedence;
	private static final Map<String, Integer> associativity;
	
	static {
		precedence = new HashMap<>();
		precedence.put("+", 2);
		precedence.put("-", 2);
		precedence.put("*", 3);
		precedence.put("/", 3);
	
		associativity = new HashMap<>();
		associativity.put("+", 1);
		associativity.put("-", 1);
		associativity.put("*", 1);
		associativity.put("/", 1);
	}
	
	public static String[] infixtoRPN(String[] inputTokens) {
		ArrayList<String> out = new ArrayList<>();
		Stack<String> stack = new Stack<>();
		
		for(String token : inputTokens) {
			if(isNumeric(token)) {
				out.add(token);
			} else if (token.equals("(")) {
				stack.push(token);
			} else if (token.equals(")")) {
				while (!stack.isEmpty() && !stack.peek().equals("(")) {
					out.add(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && !stack.peek().equals("(") && isHigherPrecedence(token, stack.peek())) {
					out.add(stack.pop());
				}
				stack.push(token);
			}
		}
		
		while(!stack.isEmpty()) {
			out.add(stack.pop());
		}
		
		return out.toArray(new String[0]);
		
		
	}
	
	private static boolean isHigherPrecedence(String op, String sub) {
		return (associativity.get(op) == 1 && precedence.get(op) <= precedence.get(sub)) ||
				(associativity.get(op) == -1 && precedence.get(op) < precedence.get(sub));
	}
	
	private static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static double evaluateRPN(String[] tokens) {
		Stack<Double> stack = new Stack<>();
		
		for (String token : tokens) {
			if (isNumeric(token)) {
				stack.push(Double.parseDouble(token));
			} else {
				double right = stack.pop();
				double left = stack.pop();
				switch (token) {
					case "+":
						stack.push(left + right);
						break;
					case "-":
						stack.push(left - right);
						break;
					case "*":
						stack.push(left * right);
						break;
					case "/":
						stack.push(left / right);
						break;
				}
			}
		}
	
		return stack.pop();
		
	}

}
