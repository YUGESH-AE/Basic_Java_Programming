package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _5_DeleteAtBegining {

    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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
        System.out.println("First node removed::" + deleteFirst().data);
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
