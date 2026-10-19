package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _15_DetectALoop {

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

    public static boolean detectALoop() {
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (slowptr == fastptr) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        creatingList();
//        display();
        boolean a = detectALoop();
        if (a) {
            System.out.println("Loop detcted");
        } else {
            System.out.println("Loop not detected");
        }
    }

    static class ListNode {
        ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
