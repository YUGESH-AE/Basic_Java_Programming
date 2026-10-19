package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _3_InsertAtEnd {

    private static ListNode head;

    public static void insertAtEnd(int value) {
        ListNode end = new ListNode(value);
        if (head == null) {
            head = end;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = end;
    }

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        insertAtEnd(21);
        insertAtEnd(31);
        insertAtEnd(1);
        insertAtEnd(10);

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
