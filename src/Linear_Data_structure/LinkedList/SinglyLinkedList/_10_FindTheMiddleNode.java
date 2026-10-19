package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _10_FindTheMiddleNode {
    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static ListNode middleNode1() {
        if (head == null) {
            return null;
        }
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }

    public static ListNode middleNode2() {
        if (head == null) {
            return null;
        }
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr.next != null && fastptr.next.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }

    public static void main(String[] args) {
        head = new ListNode(21);
        ListNode second = new ListNode(45);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(90);
        ListNode fifth = new ListNode(100);
        ListNode sixth = new ListNode(200);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        display();
        System.out.println();
        System.out.println("The middle node1 is::" + middleNode1().data);
        System.out.println("The middle node2 is::" + middleNode2().data);

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
