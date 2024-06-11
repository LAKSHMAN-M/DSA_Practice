package com.permutations;

import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        GenerateParentheses obj = new GenerateParentheses();
        System.out.println(obj.generateParenthesis(3));
    }
    public List<String> generateParenthesis(int n) {
        List<String>  list = new ArrayList<>();
        generate(new StringBuilder(), n, 0, 0, list);
        return list;
    }

    private void generate(StringBuilder str, int n, int open, int close, List<String> list) {
        if(open == n && close == open){
            list.add(str.toString());
            return;
        }
        if(open < n) {
            str.append("(");
            generate(str , n, open + 1, close, list);
            str.deleteCharAt(str.length() - 1);
        }
        if(close < open) {
            str.append(")");
            generate(str , n, open , close + 1, list);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
