package com.linkedlist;

///****************************************************************
//
// Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;

 Node()
 {
 this.data = 0;
 this.next = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 }
 }

// *****************************************************************/

public class Solution
{
    public static Node sortList(Node head)  {
        if(head == null || head.next == null) return head;
        Node newHead = head;
        Node temp = newHead;
        Node zeroHead = new Node(), oneHead = new Node(), twoHead = new Node(),
                l0 = zeroHead, l1 = oneHead, l2 = twoHead;
        while(temp != null){
            int val = temp.data;
            if(val == 0){
                l0.next = temp;
                l0 = l0.next;
            }else if(val == 1){
                l1.next = temp;
                l1 = l1.next;
            }else{
                l2.next = temp;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        l0.next = (l1.next == null) ? l1.next : l2.next;
        l1.next = l2.next;
        l0 = null; l1 = null; l2 = null; zeroHead = null; oneHead = null; twoHead = null;
        return head;
    }
}























