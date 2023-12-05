package com.geeksForGeeks.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedBrackets {
//	open brackets and closing brackets
	static List<Character> openBrackets = Arrays.asList('(', '[', '{');
	static List<Character> closeBrackets = Arrays.asList(')', ']', '}');
	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
		String braces = "[{()}]";
		boolean result = isBalanced(braces);
		System.out.println(result);
	}

//	isBalanced equation or not

	static boolean isBalanced(String braces) {
		for (char bracket : braces.toCharArray()) {
			if (isOpenBracket(bracket)) {
				stack.push(bracket);
			} else if (isClosingBracket(bracket)) {
				if (stack.isEmpty() || !isMatchingBracket(stack.pop(), bracket))
					return false;
			}
		}

		return stack.isEmpty();
	}

// is the bracket is open or close bracket  ===> (', '[', '}'
	static boolean isOpenBracket(char bracket) {
		if (openBrackets.contains(bracket))
			return true;
		return false;
	}

//	is the bracket is closing or not ====>  ')', ']', '}'
	static boolean isClosingBracket(char bracket) {
		if (closeBrackets.contains(bracket))
			return true;
		return false;
	}

// it will check the closing bracket and opening bracket is same type or not
	static boolean isMatchingBracket(Character open, char close) {

		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}
}
