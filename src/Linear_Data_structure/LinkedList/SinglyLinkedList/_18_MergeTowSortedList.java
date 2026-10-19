package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _18_MergeTowSortedList {

    private ListNode head;

    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        _18_MergeTowSortedList l1 = new _18_MergeTowSortedList();
        l1.insertFirst(8);
        l1.insertFirst(4);
        l1.insertFirst(1);
        l1.display();
        System.out.println();
        _18_MergeTowSortedList l2 = new _18_MergeTowSortedList();
        l2.insertFirst(6);
        l2.insertFirst(3);
        l2.display();
        System.out.println();
        _18_MergeTowSortedList result = new _18_MergeTowSortedList();
        result.head = merge(l1.head, l2.head);
        result.display();


    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
