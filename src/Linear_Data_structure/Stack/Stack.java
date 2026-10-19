package Linear_Data_structure.Stack;

import java.util.EmptyStackException;

public class Stack<T> {

    private ListNode<T> top;

    private int length;

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public void push(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        length--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        return data;
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
