package Problem_Solving.LinkedList.GeeksForGeeks.Basics;


/**
 * Given two Singly Linked List of N and M nodes respectively.
 * The task is to check whether two linked lists are identical or not.
 * Two Linked Lists are identical when they have same data and with same arrangement too.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList1: 1->2->3->4->5->6
 * LinkedList2: 99->59->42->20
 * Output: Not identical
 * Example 2:
 * <p>
 * Input:
 * LinkedList1: 1->2->3->4->5
 * LinkedList2: 1->2->3->4->5
 * Output: Identical
 * <p>
 * https://practice.geeksforgeeks.org/problems/identical-linked-lists/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
 */
public class IdenticalLinkedList {

    private static Node head;

    public IdenticalLinkedList() {
        this.head = null;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static Node getFirstList() {
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        return head;

    }

    public static Node getSecondList() {
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
//        sixth.next=seventh;
        return head;
    }

    public static boolean isIdentical(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return (temp1 == null && temp2 == null);
    }

    public static void main(String[] args) {


        display(getFirstList());
        System.out.println();
        display(getSecondList());

        System.out.println();

        System.out.println(isIdentical(getFirstList(), getSecondList()));
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
