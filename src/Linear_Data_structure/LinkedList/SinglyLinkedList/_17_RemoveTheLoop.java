package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _17_RemoveTheLoop {
    private static ListNode head;

    public static void creatingList() {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

        head = first;
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void removeLoop() {
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (slowptr == fastptr) {
                removeLoop(slowptr);
                return;
            }
        }
    }

    public static void removeLoop(ListNode slowptr) {
        ListNode temp = head;
        while (slowptr.next != temp.next) {
            temp = temp.next;
            slowptr = slowptr.next;
        }
        slowptr.next = null;
    }

    public static void main(String[] args) {
        creatingList();
        removeLoop();
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
