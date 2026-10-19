package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _4_InsertAtGivenPosition {

    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void insertAtGivenPosition(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public static void main(String[] args) {
        head = new ListNode(21);
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(23);
        ListNode fourth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        insertAtGivenPosition(3, 1);
        insertAtGivenPosition(5, 20);
        insertAtGivenPosition(7, 90);
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
