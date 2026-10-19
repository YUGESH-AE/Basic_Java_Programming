package Problem_Solving.LinkedList.GeeksForGeeks.Basics;


/**
 * https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
 */


public class InsertAfterMiddleElement {
    private static ListNode head;

    public static void displayList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static int lengthOfList() {
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static ListNode insertAfterMiddle(int v) {
        ListNode data = new ListNode(v);
        ListNode temp = null;
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;

        }
        temp = slowptr.next;
        slowptr.next = data;
        data.next = temp;
        return head;
    }

    public static int middleNode() {
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;

        }

        return slowptr.data;
    }

    public static void main(String[] args) {

        head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        displayList();
        System.out.println("Middle Node::" + middleNode());
        insertAfterMiddle(35);
        displayList();


    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}