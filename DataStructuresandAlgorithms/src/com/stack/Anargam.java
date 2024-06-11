package com.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anargam {

	public static void main(String[] args) {
		String str1 = "ii";
		String str2 = "ii";
		System.out.println(anargamIII(str1, str2));
	}
//	Approach I
	static boolean anargam(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
//	Approach II
	static boolean anargamII(String str1, String str2) {
		Map<Character, Integer> hm = new HashMap<>();
		for(char c1 : str1.toCharArray())
			hm.put(c1, hm.getOrDefault(c1, 0) + 1);
		for(char c2 : str2.toCharArray())
			hm.put(c2, hm.getOrDefault(c2, 0) - 1);
		for(int i : hm.values()) {
			if(i != 0) {
				return false;
			}
		}
		return true;
	}
//	Approach III
	static public boolean anargamIII(String s, String t) {
        int[] count = new int[26];
        for(char x : s.toCharArray()) {count[x - 'a']++;}
        for(char x : t.toCharArray()) {count[x - 'a']--;}
        for(int i : count) {
        	if(i != 0) {
        		return false;
        	}
        }
        return true;
    }
}
