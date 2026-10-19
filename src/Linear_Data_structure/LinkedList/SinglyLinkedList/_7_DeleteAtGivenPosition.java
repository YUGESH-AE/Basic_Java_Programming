package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _7_DeleteAtGivenPosition {

    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static ListNode deleteAtPosition(int position) {
        if (position == 1) {
            ListNode current = head;
            head = head.next;
            return current;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            return current;
        }
    }

    public static void main(String[] args) {
        head = new ListNode(21);
        ListNode second = new ListNode(45);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(90);

        head.next = second;
        second.next = third;
        third.next = fourth;
        display();
        System.out.println();
        System.out.println("The element removed is::" + deleteAtPosition(3));
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
