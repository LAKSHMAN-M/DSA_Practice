package com.Math;

public class Hcf {
    public static void main(String[] args) {
        int n = 18;
        int m = 24;
        while(n != m){
            if(n > m)
                n = n - m;
            else
                m = m - n;
        }
        System.out.println(n);
    }
}
