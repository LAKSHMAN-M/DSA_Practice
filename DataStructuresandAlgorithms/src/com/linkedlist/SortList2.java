package com.linkedlist;
import com.linkedlist.Leetcode.*;

public class SortList2 {
    public static void main(String[] args) {
        Leetcode list = new Leetcode();
        list.insertFirst(10);
        list.insertFirst(100);
        list.insertFirst(1012);
        list.insertFirst(1);
        list.insertFirst(-10);
        ListNode node = list.head;
        SortList2 obj = new SortList2();
        ListNode sortedNode = obj.mergeSort(node);
        while (sortedNode != null){
            System.out.print(sortedNode.val + " -> ");
            sortedNode = sortedNode.next;
        }
        System.out.print("NULL\n");
    }

    // Merge Sort
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode leftHead = mergeSort(head);
        ListNode rightHead = mergeSort(mid);

        return mergeTwoLists(leftHead, rightHead);
    }

    // Merge two sorted lists
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        // Attach remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;
    }

    // Get middle node
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode midPrev = null;

        while (fast != null && fast.next != null) {
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (midPrev != null) {
            midPrev.next = null;
        }

        return slow;
    }
}
