package com.stack;

import java.util.Arrays;

public class CustomQueue {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;
    private int size = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
        this.size = size;
    }

    public boolean isFull() {
        return ptr == length() - 1;
    }

    public int length() {
        return data.length;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public void display() {
        System.out.println(Arrays.toString(data));
    }

    public boolean offer(int val){
        if(isFull()){
            System.out.println("Queue is Full ");
            return false;
        }
        data[++ptr] = val;
        size++;
        return true;
    }

    public int poll(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i < length(); i++) {
            data[i - 1] = data[i];
        }
        data[ptr--] = 0;
        return removed;
    }

}
