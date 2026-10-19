package Problem_Solving.LinkedList.GeeksForGeeks.Basics;


/**
 * Given a singly linked list with N nodes and a number X.
 * The task is to find the node at the given index (X)(1 based index) of linked list.
 * <p>
 * https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
 */
public class GetTheNodeAtTheGivenIndex {
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

    public static int getNth(int ind) {
        ListNode temp = head;
        if (ind == 1) {
            return head.data;
        } else {
            int count = 1;
            while (count < ind) {
                temp = temp.next;
                count++;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {

        head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(34);
        ListNode sixth = new ListNode(67);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        displayList();
        System.out.println(getNth(5));


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

