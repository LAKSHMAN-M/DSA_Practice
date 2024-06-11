package com.linkedlist;

import com.linkedlist.Leetcode.*;

public class SortList {
    public static void main(String[] args) {
        Leetcode list = new Leetcode();
        list.insertFirst(10);
        list.insertFirst(100);
        list.insertFirst(1012);
        list.insertFirst(1);
        list.insertFirst(-10);
        ListNode node = list.head;
        SortList obj = new SortList();
        ListNode ans = obj.mergeSort(node);
        while (ans != null){
            System.out.print(ans.val+" -> ");
            ans = ans.next;
        }
        System.out.print("NULL\n");

    }
    //mergeSort
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode leftHead = mergeSort(head);
        ListNode rightHead = mergeSort(mid);

        return mergeTwoLists(leftHead, rightHead);

    }

    //merge two sorted lists
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
        temp.next = list1 != null ? list1 : list2;
        return dummyNode.next;
    }

    //get middle node
//    private ListNode getMid(ListNode head) {
//        ListNode midPrev = head;
//        while (head != null && head.next != null) {
//            midPrev = midPrev != null ? head : midPrev.next;
//            head = head.next.next;
//        }
//        ListNode mid = midPrev.next;
//        midPrev.next = null;
//        return mid;
//    }
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode midPrev = null;

        while (fast != null && fast.next != null) {
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Disconnect the first half from the second half
        if (midPrev != null) {
            midPrev.next = null;
        }
        return slow;
    }

}
//https://ray.so/DdUlZvA