package Problem_Solving.LinkedList.GeeksForGeeks.Basics;


/**
 * Given a singly linked list and a number k, you are required to complete the function modularNode()
 * which returns the modular node of the linked list.
 * A modular node is the last node of the linked list whose Index is divisible by the number k,
 * i.e. i%k==0.
 * <p>
 * Note: If no such node is available, return -1. We are following 1 indexing.
 * <p>
 * Input: LinkedList: 1->2->3->4->5->6->7
 * k = 3
 * Output: 6
 * Explanation: Indexing of the linked list is
 * same as the values of the Node. The maximum
 * index is which is divisble by 3 is 6 and the
 * node value of the 6th index is 6.
 * <p>
 * Input: LinkedList: 19->28->37->46->55
 * k = 2
 * Output: 46
 * Explanation: Index start from 1 and end at 5.
 * The maximum Index which is divisble by 2 is 4
 * and 4th Node in the list is 46.
 * <p>
 * https://practice.geeksforgeeks.org/problems/modular-node/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
 */
public class ModularNode {

    private static Node head;

    public ModularNode() {
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

    public static int moduarNode(int k) {
        Node temp = head;
        int count = 1;
        int ind = 0;
        while (temp != null) {
            if (count % k == 0) {
                ind = temp.data;
            }
            count++;
            temp = temp.next;
        }
        if (ind > 0) {
            return ind;
        } else {
            return -1;
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
        System.out.println(moduarNode(6));
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
