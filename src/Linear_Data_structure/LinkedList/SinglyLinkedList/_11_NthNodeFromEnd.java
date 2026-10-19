package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _11_NthNodeFromEnd {
    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static ListNode nthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Invalid n value");
        }
        ListNode refptr = head;
        ListNode mainptr = head;
        int count = 0;
        while (count < n) {
            refptr = refptr.next;
            count++;
        }
        while (refptr != null) {
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr;
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
        System.out.println("Nth node from end::" + nthNodeFromEnd(2).data);


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
