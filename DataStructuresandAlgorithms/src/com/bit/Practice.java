package com.bit;

public class Practice {
    public static void main(String[] args) {
        Practice obj = new Practice();
        System.out.println(obj.isSetBit(5, 1));
    }
    public boolean isSetBit(int num, int ithBit){
        int n = 1<<ithBit;
        return (num & n) != 0;
        //ith bit  2 1 0
        //number   1 0 1 ==> 5
        //n        1 0 0 ==> != 0 true
        //n        0 1 0 ==> == 0 false
    }
}
