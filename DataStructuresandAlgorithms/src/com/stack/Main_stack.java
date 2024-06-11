package com.stack;

public class Main_stack {
    public static void main(String[] args) throws StackException {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(10);
//        queue.insert(1);
//        queue.insert(11);
//        queue.insert(14);
//        queue.insert(190);
        queue.display();
//        System.out.println(queue.remove());
//        queue.display();
        System.out.println(queue.rear());


    }
}
