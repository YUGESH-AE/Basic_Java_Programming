package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _14_RemoveAGivenKey {
    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void removeKey(int value) {
        ListNode key = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != key.data) {
            temp = current;
            current = current.next;
        }
        if (current == null) return;
        temp.next = current.next;
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(11);
        ListNode fourth = new ListNode(20);
        ListNode fifth = new ListNode(31);
        ListNode sixth = new ListNode(45);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        display();
        System.out.println();
        removeKey(31);
        display();


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
