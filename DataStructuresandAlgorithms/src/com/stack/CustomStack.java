package com.stack;

import java.util.*;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;
    private int size = 0;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
        this.size = size;
    }

    public Integer push(int value) throws Exception {
        if (isFull()) {
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = value;
        return value;
    }

    public Integer pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        int remove = data[ptr];
        data[ptr] = 0;
        ptr--;
        return remove;
    }

    public Integer peek() throws StackException {
        if (isEmpty()) throw new StackException("Stack is empty");
        return data[ptr];
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
}

