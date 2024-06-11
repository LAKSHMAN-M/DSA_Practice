package com.recursion.arrays;

public class LengthOfString {
//	this will call the function again till the string becomes empty
//	for eg : string = abc its substring(1) == bc likewise we pass to the 
//	function and increment its count by 1
	static int length(String str) {
		if(str.equals("")) return 0;
		return length(str.substring(1)) + 1;
	}
	public static void main(String[] args) {
		System.out.println(length("12345"));
	}
}
