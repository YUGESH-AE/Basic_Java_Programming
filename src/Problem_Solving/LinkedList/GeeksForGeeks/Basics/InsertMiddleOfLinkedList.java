package Problem_Solving.LinkedList.GeeksForGeeks.Basics;


/**
 * Given a linked list of size N and a key.
 * The task is to insert the key in the middle of the linked list.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList = 1->2->4
 * key = 3
 * Output: 1 2 3 4
 * Explanation: The new element is inserted
 * after the current middle element in the
 * linked list.
 * <p>
 * Input:
 * LinkedList = 10->20->40->50
 * key = 30
 * Output: 10 20 30 40 50
 * Explanation: The new element is inserted
 * after the current middle element in the
 * linked list and Hence, the output is
 * 10 20 30 40 50.
 * <p>
 * <p>
 * https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
 */
public class InsertMiddleOfLinkedList {
    private static Node head;

    public InsertMiddleOfLinkedList() {
        this.head = null;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void insertMiddle(int value) {
        Node toAdd = new Node(value);
        if (head == null) {
            head = toAdd;
        } else {
            Node slow = head, fast = head, temp = null;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            temp = slow.next;
            toAdd.next = temp;
            slow.next = toAdd;
        }
    }

    public static void insertInMid(int data) {
        if (head == null)
            head = new Node(data);
        else {
            //creating new node.
            Node toAdd = new Node(data);

            //we take two pointers one of which moves to next node in each
            //iteration and the other moves two nodes in one iteration.
            Node slow = head, fast = head;

            //when fast will reach end, slow will be at the middle point.
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            //we store the next node after slow in link part of the new node.
            toAdd.next = slow.next;
            //we also store the new node in link part of the slow node.
            slow.next = toAdd;

        }
    }

    public static void main(String[] args) {
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

        display();
        System.out.println();
        insertMiddle(45);
//        insertInMid(45);
        display();
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
