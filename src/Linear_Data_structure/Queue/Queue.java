package Linear_Data_structure.Queue;

import java.util.NoSuchElementException;

public class Queue<T> {

    private ListNode<T> front;
    private ListNode<T> rear;
    private int length;

    public Queue() {
        front = null;
        rear = null;
        length = 0;
    }

    private int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(T data) {
        ListNode<T> temp = new ListNode<>(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;

    }

    public void display() {
        ListNode<T> current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        T result = front.data;
        front = front.next;
        if (rear == null) {
            return null;
        }
        length--;
        return result;
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

