package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _1_SinglyLinkedList {
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

    public static void main(String[] args) {

        head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(11);

        head.next = second;
        second.next = third;
        third.next = fourth;

        displayList();

        System.out.println("The length of the linked list is::" + lengthOfList());
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
