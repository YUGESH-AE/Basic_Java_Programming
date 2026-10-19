package Problem_Solving.LinkedList.GeeksForGeeks.Basics;


/**
 * Find the Sum of Last N nodes of the Linked List
 * <p>
 * Given a single linked list of size M, your task is to complete
 * the function sumOfLastN_Nodes(),
 * which should return the sum of last N nodes of the linked list.
 * <p>
 * https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions
 */
public class SumOfLastNNodesInLinkedList {

    private static Node head;

    public SumOfLastNNodesInLinkedList() {
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

    public static int sum(int k) {
        int sum1 = 0;
        Node refptr = head, mainptr = head;
        int count = 0;
        while (count < k) {
            sum1 += refptr.data;
            refptr = refptr.next;
            count++;
        }
        int sum2 = 0;
        while (refptr != null) {
            sum1 += refptr.data;
            refptr = refptr.next;
            sum2 += mainptr.data;
            mainptr = mainptr.next;
        }
        int total = sum1 - sum2;
        return total;
    }

    public static void main(String[] args) {

        head = new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);
        Node fou = new Node(40);
        Node fif = new Node(50);
        head.next = sec;
        sec.next = third;
        third.next = fou;
        fou.next = fif;

        display();
        System.out.println();
        System.out.println(sum(2));
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
