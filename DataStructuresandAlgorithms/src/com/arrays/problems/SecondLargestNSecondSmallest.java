package com.arrays.problems;

public class SecondLargestNSecondSmallest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 33, 98, 0, 99};
        secondLarNSmall(arr);
    }

    static void secondLarNSmall(int[] arr) {
        int lar = Integer.MIN_VALUE;
        int sLar = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            //Largest Element and Second Largest Element
            if (num > lar) {
                sLar = lar;
                lar = num;
            } else if (num > sLar && num != lar) {
                sLar = num;
            }
            //Smallest element and Second smallest element
            if(num < smallest){
                sSmallest = smallest;
                smallest = num;
            }else if(num < sSmallest && num != smallest){
                sSmallest = num;
            }
        }

        System.out.println("Largest " + lar + "\nSecond Largest " + sLar);
        System.out.println("Smallest " + smallest + "\nSecond Smallest " + sSmallest);
    }
}
