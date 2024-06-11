package com.stack;

import java.util.Stack;

public class ValidParenttheses {
    public static void main(String[] args) {
        String str = "(((){}))";
        System.out.println(isValid(str));
    }

//    static boolean validParentheses(String str) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : str.toCharArray()) {
//            if (isOpeningParentheses(c)) {
//                stack.push(c);
//            } else if (isClosingParentheses(c)) {
//                char topChar = stack.peek();
//                if (stack.isEmpty()) {
//                    return false;
//                } else if (isMatching(topChar, c)) {
//                    stack.pop();
//                } else {
//                    return false;
//                }
//            }
//        }
//        if(stack.isEmpty()){
//            return true;
//        }
//        return false;
//    }
//
//    static boolean isOpeningParentheses(Character c) {
//        return c == '(' || c == '[' || c == '{';
//    }
//
//    static boolean isClosingParentheses(Character c) {
//        return c == ')' || c == ']' || c == '}';
//    }
//
//    static boolean isMatching(Character opening, Character closing) {
//        return (opening == '(') && (closing == ')') || ((opening == '[') && (closing == ']')) || ((opening == '{') && (closing == '}'));
//    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(isOpening(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(isMatchingPair(stack.peek(), c)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    static boolean isOpening(Character c){
        return c == '('|| c == '['|| c == '{';
    }
    // static boolean isClosing(Character c){
    //     return c == ')'|| c == ']'|| c == '}';
    // }

    static boolean isMatchingPair(Character opening, Character closing){
        return  (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }
}
