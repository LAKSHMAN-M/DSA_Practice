package com.linkedlist;

public class Leetcode {


    ListNode head, tail;
    private int size = 0;

    public Leetcode() {
    }

    public void insertFirst(int value) {
        ListNode temp = new ListNode(value);
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
        ListNode temp = new ListNode(value);
        tail.next = temp;
        tail = temp;
        this.size += 1;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode() {
        }
    }

    //Leetcode Problems
//    1. LinkedList cycle : https://leetcode.com/problems/linked-list-cycle/description/
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode slow = head, fast = head;
        int len = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                do {
                    slow = slow.next;
                    len++;
                } while (slow != fast);
            }
        }
        return len;
    }


    //    2. Detect Cycle II : https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int len = 0;
        boolean hasCycle = false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                ListNode node = slow;
                do {
                    node = node.next;
                    len++;
                } while (slow != node);
            }
        }
        if (!hasCycle) return null;
        ListNode f = head, s = head;
        while (len != 0) {
            s = s.next;
            len--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return f;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public boolean isPalindrome(ListNode head) {
        ListNode reverse = new ListNode();
        reverse = reverse.next;
        ListNode dummyhead = head;
        while (dummyhead != null) {
            ListNode node = new ListNode(dummyhead.val);
            node.next = reverse;
            reverse = node;
            dummyhead = dummyhead.next;
        }
        while (reverse != null) {
            if (reverse.val != head.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    //middle of the node
    static ListNode getMid(ListNode head) {
        ListNode midPrev = head;
        while (head != null && head.next != null) {
            midPrev = midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public ListNode reverseList(ListNode head) {
        ListNode rev = reverse(head, null);
//        ListNode temp = rev;
//        while (temp != null){
//            System.out.print(temp.val+" -> ");
//            temp = temp.next;
//        }
//        System.out.print("NULL\n");
        return rev;
    }

    private static ListNode reverse(ListNode head, ListNode prev) {
        if (head == null) return prev;
        ListNode next = head.next;
        head.next = prev;
        return reverse(next, head);
    }

    public ListNode reverseAtKTime(ListNode head, int k) {
        if(k <= 1 || head.next == null) return head;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode, curr = head, first = prev, newEnd = curr;
        while (curr != null) {
            boolean kthNode = isKthNodePresent(curr, k);//check for kth is present or not
            if (!kthNode) { // if absent then joint the last two nodes
                prev.next = curr;
                break;
            }
            //if kth node is present then reverse them for k times
            for (int i = 0; curr != null && i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            //change the positions of the node pointers
            first.next = prev;
            newEnd.next = curr;
            prev = newEnd;
            first = newEnd;
            newEnd = curr;
        }
        head = dummyNode.next;
        return head;
    }

    private boolean isKthNodePresent(ListNode curr, int k) {
        ListNode temp = curr; // if curr node have k nodes then will return true otherwise false
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }
        return k == 0;
    }
    //         dummyNode -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL
    //first iteration  ==> first = dummyNode, prev = dummyNode, curr = head(1), newEnd = head(1)
    //second iteration ==> first = 3, prev = 3, curr = 4, newEnd = 4
    //third iteration  ==> first = 6, prev = 6, curr = 7, newEnd = 7

    public static void main(String[] args) {
        Leetcode node = new Leetcode();
        node.insertEnd(1);
        node.insertEnd(2);
        node.insertEnd(3);
        node.insertEnd(4);
        node.insertEnd(5);
        node.insertEnd(6);
        node.insertEnd(7);
        node.insertEnd(12);
        node.insertEnd(13);
        node.insertEnd(14);
        node.insertEnd(15);
        node.insertEnd(16);
        node.insertEnd(17);
        for(ListNode i = node.head; i != null; i = i.next){
            System.out.println(i.val);
        }
        node.display();
//        System.out.println(node.isKthNodePresent(node.head, 3));
//        node.display();
        Leetcode rev = new Leetcode();
        rev.head = rev.reverseAtKTime(node.head, 3);
        rev.display();
    }
}
