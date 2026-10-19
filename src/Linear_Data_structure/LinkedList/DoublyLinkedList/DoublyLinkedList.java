package Linear_Data_structure.LinkedList.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

    private ListNode<T> head;
    private ListNode<T> tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode<T> temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public void addFirst(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    public void addLast(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void addAt(T data, int position) {
        ListNode<T> newNode = new ListNode<>(data);
        if (position == 1) {
            if (isEmpty()) {
                tail = newNode;
            } else {
                head.previous = newNode;
                newNode.next = head;
            }
            head = newNode;
            length++;
        } else {
            ListNode<T> temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            ListNode<T> current = temp.next;
            newNode.next = current;
            current.previous = newNode;
            temp.next = newNode;
            newNode.previous = temp;
            length++;
        }
    }

    public T deleteFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException("There is no element to delete");
        }
        ListNode<T> temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp.data;
    }

    public T deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("There is no element to delete");
        }
        ListNode<T> temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp.data;
    }

    public T deleteAt(int position) {
        if (position == 1) {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            ListNode<T> temp = head;
            if (head == tail) {
                tail = null;
            } else {
                head.next.previous = null;
            }
            head = head.next;
            temp.next = null;
            length--;
            return temp.data;
        } else if (position == length) {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            ListNode<T> temp = tail;
            if (head == tail) {
                head = null;
            } else {
                tail.previous.next = null;
            }
            tail = tail.previous;
            temp.previous = null;
            length--;
            return temp.data;
        } else {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            ListNode<T> temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            ListNode<T> current = temp.next;
            current.next.previous = temp;
            temp.next = current.next;
            length--;
            return current.data;
        }
    }

    private static class ListNode<T> {
        private T data;
        private ListNode<T> previous;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
        }
    }
}
