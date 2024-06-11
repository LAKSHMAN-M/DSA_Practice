package com.recursion.basics;

public class Print1toN {
    public static void main(String[] args) {
//        printNto1_2(1, 5);
        print1ton_2(5, 5);
    }
    public static void print1ton(int i, int n){
        System.out.println(i);
        if(i == n) return;
        else print1ton(i + 1, n);
    }
    public static void printNto1(int i){
        System.out.println(i);
        if(i == 1) return;
        else printNto1(i - 1);
    }
// don't use minus operator to print values from larger to smaller
    public static void printNto1_2(int i, int n){
        if(i > n) return;
        printNto1_2(i + 1, n);
        System.out.println(i);
    }
// don't use addition operator to print values from larger to smaller
    public static void print1ton_2(int i, int n){
        if(i < 1) return;
        print1ton_2(i - 1, n);
        System.out.println(i);
    }
}
