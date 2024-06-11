package com.linkedlist;

public class List {
    private Node head, tail;
    private int size;

    public List() {
    }

    public List(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        this.size += 1;
    }

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

    public void insert(int value) {
        insertEnd(value);
    }

    public void insert(int index, int value) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == getSize() - 1) {
            insertEnd(value);
            return;
        }
        Node curr = getNode(index - 1);
        Node temp = new Node(value, curr.next);
        curr.next = temp;
        this.size += 1;
    }


    //insert using Recursion
    public void insertRec(int index, int value) {
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            this.size += 1;
            return temp;
        }
        node.next = insertRec(index - 1, value, node.next);
        return node;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        this.size -= 1;
        return value;
    }

    public int deleteEnd() {
        if (getSize() <= 1) {
            return deleteFirst();
        }
//        Node node = getNode(getSize() - 2);
//        node.next = null;
//        tail = node;
        tail = getNode(getSize() - 2);
        tail.next = null;
        this.size -= 1;
        int value = tail.value;
        return value;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        } else if (index == getSize() - 1) {
            return deleteEnd();
        } else {
            Node node = getNode(index - 1);
            int value = node.next.value;
            node.next = node.next.next;
            this.size -= 1;
            return value;
        }
    }

    private class Node {
        private int value;

        private Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
