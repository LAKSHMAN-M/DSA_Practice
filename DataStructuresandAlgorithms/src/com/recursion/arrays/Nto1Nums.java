package com.recursion.arrays;

public class Nto1Nums {

	public static void main(String[] args) {
		nto1And1ton(5);
	}
	static void nto1(int n) {
		if(n == 0) return;
		System.out.print(n+" ");
		nto1(n - 1);
	}
	static void nto1Reverse(int n) {
		if(n == 0) return;
		nto1Reverse(n - 1);
		System.out.print(n+" ");
	}
	static void nto1And1ton(int n) {
		if(n == 0) return;
		System.out.print(n+" ");
		nto1And1ton(n - 1);
		System.out.print(n+" ");
	}


}
