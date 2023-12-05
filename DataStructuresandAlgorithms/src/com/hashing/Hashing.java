package com.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		hashMap(scan);
	}

	protected static void forNumbers(Scanner scan) {
		// we need to array of integers
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		// we have array of integers(i.e it will have the given numbers for how many
		// times the number does repeat more)
		// precompute
		// assume that we have a hash array of size 13
		// it will store the given numbers frequency by arr index
		int hash[] = new int[13];
		for (int i = 0; i < n; i++) {
			hash[arr[i]] += 1;
		}
		System.out.println("------");
		int query = scan.nextInt();
		while (query-- != 0) {
			int number = scan.nextInt();
			// fetching
			System.out.println(hash[number]);
		}
	}

//	for characters 
	public static void forCharacters(Scanner scan) {
		String string = scan.next();
		// precompute
		int hash[] = new int[256];

		// THIS WILL WORK FOR ONLY LOWER CASE LETTERS ::: size 26

//		for (int i = 0; i < string.length(); i++) {
//			hash[string.charAt(i) - 'a'] += 1;
//		}
//		//so far we done storing chars like a number 
//		int q = scan.nextInt();
//		while(q-- !=0) {
//			char query = scan.next().charAt(0);
//			System.out.println(hash[query - 'a']);
//		}
//		
		// THIS WILL WORK FOR ONLY UPPER CASE LETTERS

//		for (int i = 0; i < string.length(); i++) {
//			hash[string.charAt(i) - 'A'] += 1;
//		}
//		// so far we done storing chars like a number
//		int q = scan.nextInt();
//		while (q-- != 0) {
//			char query = scan.next().charAt(0);
//			System.out.println(hash[query - 'A']);
//		}
		// THIS WILL WORK FOR BOTH CASE LETTERS

		for (int i = 0; i < string.length(); i++) {
			hash[string.charAt(i)] += 1;
		}
		// so far we done storing chars like a number
		int q = scan.nextInt();
		while (q-- != 0) {
			char query = scan.next().charAt(0);
			System.out.println(hash[query]);
		}
	}

//	try to use with hashMap 
	public static void hashMap(Scanner scan) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
//		precompute
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int freq = hm.getOrDefault(key, 0);
			freq++;
			hm.put(key, freq);
		}
		int q = scan.nextInt();
		while (q-- != 0) {
			int key = scan.nextInt();
			System.out.println(hm.getOrDefault(key, 0));
			
		}
//		System.out.println(hm);
	}
}
