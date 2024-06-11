package com.hashing;
//  collision resolution technique using separate chaining
public class HashTable {
    private int size;
    private static int capacity;//Number of Buckets
    private HashNode[] buckets; // an array of HashNodes

    public HashTable(){
        this(10);//default capacity
    }
    public HashTable(int capacity){
        this.size = 0;
        this.capacity = capacity;
        buckets = new HashNode[capacity];
    }
    private class HashNode{

        private Integer key;
        private String value;
        public HashNode next;

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    private int getBucketIndex(int n){
        return n % capacity;
    }
    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("Key and value should  Not be null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex]; // we are at buckets[bucketIndex]
        while(head != null){
            boolean checkKeyPresent = head.key == key;
            if(checkKeyPresent) {
                // Update the previous value to current value
                head.value.equals(value);
                return;//after update no need to perform go back to called function
            }
            head = head.next;//check if next nodes, if key is present oor not
        }
        size++;// when new element is added increment size by one
        head = buckets[bucketIndex];//we are trying to insert at st position so set head to start index
        HashNode node = new HashNode(key, value); // (key, value).next ==> null
        node.next = head;//node.next ==> points to head
        buckets[bucketIndex] = node;// we have assigned a value to the index of (bucketIndex)
    }
    public String getValue(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key == key){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    //remove element
    public void remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;

        while(head != null){
            if(head.key == key){
                size--;
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null ) return;
        if(previous != null){
            previous.next = head.next;
        }else{
            buckets[bucketIndex] = head.next;
        }
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(101, "ramu");
        System.out.println(table.size);
        table.remove(101);
        System.out.println(table.size);
        System.out.println(table.getValue(101));
    }
}

