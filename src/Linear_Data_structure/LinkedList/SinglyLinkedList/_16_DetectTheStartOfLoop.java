package Linear_Data_structure.LinkedList.SinglyLinkedList;

public class _16_DetectTheStartOfLoop {
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

    public static ListNode detectStartOfLoopAndReturnNode() {
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (slowptr == fastptr) {
                return getThestartNodeOfLoop(slowptr);
            }
        }
        return null;
    }

    public static ListNode getThestartNodeOfLoop(ListNode slowptr) {
        ListNode temp = head;
        while (slowptr != temp) {
            temp = temp.next;
            slowptr = slowptr.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        creatingList();
        System.out.println("The starting point of the loop::" + detectStartOfLoopAndReturnNode().data);
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
