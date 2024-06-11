package com.recursion.arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Geek_onacciSeries
 {
     static int display(int a, int b, int c, int n){
         if(n == 1) return a;
         if(n == 2) return b;
         if(n == 3) return c;
         else return display(a, b, c, n - 1) + display(a, b, c, n - 2) + display(a, b, c, n - 3);
     }
	public static void main (String[] args)
	 {
	 //code
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    
    while(t > 0){
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n = s.nextInt();
        int ans = display(n1, n2, n3, n);
        System.out.println(ans);
        t--;
    }
	}
}