package com.linkedlist;

public class DoublyLinkedList_II {
    private Node head, tail;
    private int size;

//    private Node rev;
    public DoublyLinkedList_II() {
        this.size = 0;
    }

    public DoublyLinkedList_II(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    //creating DoublyLinkedList
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
        if(tail == null){
            tail = head;
        }
        this.size += 1;
    }

    //Displaying
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.print("NULL\n");
    }

    //insertEnd
    public void insertEnd(int value){
        if(getSize() == 0){
            insertFirst(value);
            return;
        }
        Node temp = new Node(value);
        temp.prev = tail;
        temp.next = null;
        tail.next = temp;
        tail = temp;
        this.size += 1;
    }

    public void displayReverse(){
        Node reverse = tail;
        while(reverse != null){
            System.out.print(reverse.value + " -> ");
            reverse = reverse.prev;
        }
        System.out.print("NULL\n");
    }

    //insertion a node
    public void insert(int index, int value){
        if(index == 0 ) {
            insertFirst(value);
            return;
        }
        if(index == getSize() -1 ) {
            insertEnd(value);
            return;
        }
        Node tempPrev = head;
        for (int i = 0; i < index - 1; i++) {
            tempPrev = tempPrev.next;
        }
        insertNode(value, tempPrev);
        this.size += 1;
    }

    private void insertNode(int value, Node temp) {
        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next.prev != null){
            node.next.prev = node;
        }
    }

    //insert by value
    public void insertByValue(int after, int value){
        Node temp = getNodeByValue(after);
        if(temp == null){
            System.out.println("Cannot Insert at NULL values");
            return;
        }
        insertNode(value, temp);
        this.size += 1;
    }

    //insert
    public void insert(int value){
        insertEnd(value);
    }

    //getNode
    public Node getNode(int index){
        Node res = head;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    //getNode by value
    public Node getNodeByValue(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    private class Node{
        private Node prev, next;
        private int value;
        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
}
