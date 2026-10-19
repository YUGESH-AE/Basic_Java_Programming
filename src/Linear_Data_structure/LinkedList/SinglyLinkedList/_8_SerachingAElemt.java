package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _8_SerachingAElemt {
    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static boolean searchAnElemt(int search) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == search) {
                return true;
            }
            current = current.next;
        }
        return false;
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
        boolean s = searchAnElemt(1);
        if (s) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

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
