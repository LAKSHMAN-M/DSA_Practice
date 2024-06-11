package com.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//        List list = new List();
//        list.insert(2);
//        list.insert(3);
//        list.insert(9);
//        list.insert(10);
//        list.display();
//        list.insertRec(2, 22);
//        list.display();
        int[] arr = {1, 4, 3, 5, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int arr[], int s, int e){
        if(s >= e){
            return ;
        }
        int m = (s + e ) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);
        merge(arr, s, m, e);
    }
    static int[] merge(int arr[], int s, int m, int e){
        int l1 = s;
        int l2 = m + 1;
        int temp[] = new int[e - s + 1];
        int i = 0;
        while(l1 <= m && l2 <= e){
            if(arr[l1] <= arr[l2]){
                temp[i] = arr[l1];
                l1++;
            }else{
                temp[i] = arr[l2];
                l2++;
            }
            i++;
        }
        while(l1 <= m){
            temp[i] = arr[l1];
            l1++;
            i++;
        }
        while(l2 <= e){
            temp[i] = arr[l2];
            l2++;
            i++;
        }
        for (int j = 0; j < temp.length; j++) {
            arr[s++] = temp[j];
        }
        return temp;
    }
}
