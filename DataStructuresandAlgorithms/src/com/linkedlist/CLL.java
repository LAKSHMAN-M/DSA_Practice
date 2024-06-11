package com.linkedlist;

public class CLL {

    private Node head, tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null && tail == null){
            head = node;
            tail = head;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        this.size += 1;
    }

    public void display(){
        if(head == null){
            System.out.println("LIST IS NULL");
            return;
        }
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value+" -> "); node = node.next;
            }while(node != head);
        }
        System.out.print("HEAD");
        System.out.println();
    }
    public void delete(int value){
        Node temp = head;
//        Node prev = temp;
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        if(head.value == value){
            System.out.println(value);
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = temp.next;
            if(n.value ==value){
                System.out.println(value);
                temp.next = n.next;
                n = null;
                return;
            }
            temp = n;
        }while(temp != head);
        System.out.println(value+" is not exist in a List");
    }

    private class Node {
        private int value;
        private Node next;
        public Node() {}

        public Node(int value) {
            this.value = value;
        }
    }
}
