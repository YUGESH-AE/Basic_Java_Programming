package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _2_InsertAtTheBegining {

    private static ListNode head;

    public static void insertAtBegining(int data) {
        ListNode start = new ListNode(data);
        start.next = head;
        head = start;
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
        insertAtBegining(10);
        insertAtBegining(9);
        insertAtBegining(1);
        insertAtBegining(100);
        display();
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
}
