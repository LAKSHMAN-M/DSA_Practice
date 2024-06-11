package com.stack;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    protected int front = 0, end = 0;
    private int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
//        this.size = size;
    }
    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int val){
        if(isFull()){
            System.out.println("Queue is Full ");
            return false;
        }
        data[end] = val;
        end = (end+1) % data.length;
        size++;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }
    public int front() throws StackException {
        if(isEmpty()){
            throw new StackException("Queue is Empty");
        }
        return data[front];
    }
    public int rear() throws StackException{
        if(isEmpty()){
            throw new StackException("Queue is Empty");
        }
        int e = end - 1;
        return data[e];
    }

    public void display(){
        if(isEmpty()) {
            System.out.println("END");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i++]+" -> ");
            i %= data.length;
        }while(i != end);
        System.out.println("END");
    }
}
