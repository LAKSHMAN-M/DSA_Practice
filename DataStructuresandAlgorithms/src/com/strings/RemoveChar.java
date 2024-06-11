package com.strings;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "Lakshman is is fine!!!";//output : Lakshman   fine
        System.out.println(removeWords(str));
    }

    static String res = "";
//This will remove the character from the given string
    static String removeChar(String str, char c) {
        if (str.isEmpty()) return "";
        if (str.charAt(0) != c) res += str.charAt(0);
        return removeChar(str.substring(1), c);
    }
//same as above method
    static String removeChar(String str) {
        if (str.isEmpty()) return "";
        if (str.charAt(0) != 'a') return str.charAt(0) + removeChar(str.substring(1));
        else return removeChar(str.substring(1));
    }
    // this will all occurences of the 'is' with in a string
    static String removeWords(String str){
        if(str.isEmpty()) return "";
        if(str.startsWith("is")) return removeWords(str.substring(2));
        else return str.charAt(0) + removeWords(str.substring(1));
    }
}
