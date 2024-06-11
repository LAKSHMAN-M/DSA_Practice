package com.linkedlist;

public class SingleLinkedList {
    //head and tail nodes declaration
    private Node head, tail;
    private int size;

    //constructor
    public SingleLinkedList() {
        this.size = 0;
    }

    // Insertion at the beginning
    public void insertFirst(int value) {
        //create a temp node then assign the value to it, then make that temp node as head node
        Node temp = new Node(value);
        temp.next = head;
        head = temp;

        // what if the tail is null.
        // that means head and tail needs to points to the same node called head, tail node
        if (tail == null) {
            tail = head;
        }
        // inserted a value that means i have size +1
        this.size += 1;
    }

    //Insertion at the ending
    public void insertEnd(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node temp = new Node(value);
        tail.next = temp;
        tail = temp;
        this.size += 1;
    }

    //Displaying List items or Printing the list items
    public void display() {
        //create a temp node assign the head to it. because head never be changed when printing or calling
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    //size
    public int getSize() {
        return this.size;
    }

    //insertion at particular node
    public void insert(int index, int value) throws Exception {
        if (index > getSize() || index < 0)
            throw new Exception("Cannot insert at " + index + ", value should  be > 0 or <= " + getSize());

        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == getSize()) {
            insertEnd(value);
            return;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
//        Node nextNode = current.next;
//        Node node = new Node(value);
//        current.next = node;
//        current = node;
//        current.next = nextNode;
        Node temp = new Node(value, current.next);
        current.next = temp;
        this.size++;
    }

    public void insert(int value) {
        insertEnd(value);
    }

    //Deletion
    public int delete(int index) {
        if (index < 0) throw new NullPointerException("Index cannot be null");
        if (index == 0) return deleteFirst();
        if (index == getSize() - 1) return deleteLast();
        Node prev = getNode(index - 1);
        this.size -= 1;
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    //Delete at first
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        this.size -= 1;
        return value;
    }

    //Delete at last
    public int deleteLast() {
        int value = tail.value;
        if (getSize() <= 1) {
            return deleteFirst();
        }
        tail = getNode(getSize() - 2);
        tail.next = null;
        this.size -= 1;
        return value;
    }


    //get node
    private Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //is Empty
    public boolean isEmpty() {
        return getSize() == 0;
    }

    //search method
    public int search(int value) {
        Node temp = head;
        for (int i = 0; i < getSize(); i++) {
            if (temp.value == value) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    //contains
    public boolean contains(int value) {
        return search(value) != -1;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
