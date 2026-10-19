package Linear_Data_structure.LinkedList.SinglyLinkedList;

@SuppressWarnings("ALL")
public class List<T> {
    private ListNode head;

    public void display() {
        ListNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void addFirst(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAt(int position, T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode<T> previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode<T> current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public T deleteFirst() {
        if (head == null) {
            System.out.println("delete first::" + null);
        }
        ListNode<T> temp = head;
        head = head.next;
        temp.next = null;
        return temp.data;
    }

    public T deleteLast() {
        if (head == null || head.next == null) {
            return (T) head.data;
        }
        ListNode<T> previous = head;
        ListNode<T> temp = null;
        while (previous.next != null) {
            temp = previous;
            previous = previous.next;
        }
        temp.next = null;
        return previous.data;
    }

    public T deleteAt(int position) {
        if (position == 1) {
            ListNode<T> temp = head;
            head = head.next;
            temp.next = null;
            return temp.data;

        } else {

            ListNode<T> previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous = previous.next;
                count++;
            }
            ListNode<T> current = previous.next;
            previous.next = current.next;

            return current.data;
        }
    }

    public boolean search(T value) {
        ListNode<T> key = new ListNode<>(value);
        ListNode<T> current = head;
        while (current != null) {
            if (current.data == key.data) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    public T middleNode() {
        ListNode<T> fastptr = head;
        ListNode<T> slowptr = head;
        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr.data;
    }

    public T nthNodeFromEnd(int n) {
        ListNode<T> refptr = head;
        ListNode<T> maintr = head;
        int count = 0;
        while (count < n) {
            refptr = refptr.next;
            count++;
        }
        while (refptr != null) {
            refptr = refptr.next;
            maintr = maintr.next;
        }

        return maintr.data;
    }

    public void removeDuplicateFromSortedList() {
        ListNode<T> current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            current = current.next;
        }

    }

    private static class ListNode<T> {
        private T data;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }


}
