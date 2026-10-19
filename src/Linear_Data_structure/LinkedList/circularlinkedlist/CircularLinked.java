package Linear_Data_structure.LinkedList.circularlinkedlist;

import java.util.NoSuchElementException;

public class CircularLinked {
    public static void main(String[] args) {
        CircularLinkedList<Integer> c = new CircularLinkedList<>();
        c.addFirst(40);
        c.addFirst(30);
        c.addFirst(20);
        c.addFirst(10);
        c.addLast(50);
        c.addLast(60);
        c.addAt(32, 4);
        System.out.println(c.getLength());
        c.addAt(65, c.getLength());
        c.deleteAt(c.getLength());
        c.display();
    }
}

class CircularLinkedList<T> {
    private ListNode<T> last;
    private int length;

    public CircularLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode<T> first = last.next;
        while (first != last) {
            System.out.print(first.data + "->");
            first = first.next;
        }
        System.out.println(first.data + "->null");
    }

    public void addFirst(T data) {
        ListNode<T> temp = new ListNode<>(data);
        if (isEmpty()) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void addLast(T data) {
        ListNode<T> temp = new ListNode<>(data);
        if (isEmpty()) {
            last = temp;
            last.next = temp;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public void addAt(T data, int position) {
        ListNode<T> temp = new ListNode<>(data);
        if (position == 1) {
            if (isEmpty()) {
                last = temp;
            } else {
                temp.next = last.next;
            }
            last.next = temp;
            length++;
        } else if (position == length) {
            if (isEmpty()) {
                last = temp;
                last.next = temp;
            } else {
                temp.next = last.next;
                last.next = temp;
                last = temp;
            }
            length++;
        } else {
            int count = 1;
            ListNode<T> first = last.next;
            while (count < position - 1 && first != last) {
                first = first.next;
                count++;
            }
            ListNode<T> v = first.next;
            temp.next = v;
            first.next = temp;
            length++;
        }
    }

    public T deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode<T> temp = last.next;
        if (last == temp) {
            return null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp.data;
    }

    public T deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (last == null) {
            length--;
            return null;
        } else {
            ListNode<T> first = last.next;
            {
                ListNode<T> temp = null;
                while (first != last) {
                    temp = first;
                    first = first.next;
                }
                temp.next = first.next;
                last = temp;
                length--;
                return first.data;

            }


        }
    }

    public T deleteAt(int position) {
        if (position == 1) {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            ListNode<T> temp = last.next;
            if (last == temp) {
                return null;
            } else {
                last.next = temp.next;
            }
            temp.next = null;
            length--;
            return temp.data;
        } else if (position == length) {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (last == null) {
                length--;
                return null;
            } else {
                ListNode<T> first = last.next;
                {
                    ListNode<T> temp = null;
                    while (first != last) {
                        temp = first;
                        first = first.next;
                    }
                    temp.next = first.next;
                    last = temp;
                    length--;
                    return first.data;

                }
            }

        } else {
            int count = 1;
            ListNode<T> first = last.next;
            while (count < position - 1 && first != last) {
                first = first.next;
                count++;
            }
            ListNode<T> v = first.next;
            first.next = v.next;
            v.next = null;
            length--;
            return v.data;
        }
    }

    private static class ListNode<T> {
        private ListNode<T> next;
        private T data;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
