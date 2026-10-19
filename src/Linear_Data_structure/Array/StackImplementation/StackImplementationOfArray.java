package Linear_Data_structure.Array.StackImplementation;

import java.util.NoSuchElementException;


/**
 * https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 * <p>
 * https://websparrow.org/java/stack-implementation-in-java-using-array#:~:text=Stack%20implementation%20in%20Java%20using%20Array%201%20Push,item%20which%20is%20top%20of%20the%20Stack.%20
 */
public class StackImplementationOfArray {

    private int arr[];
    private int capacity;
    private int top;

    public StackImplementationOfArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public static void main(String[] args) {
        StackImplementationOfArray stack = new StackImplementationOfArray(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.push(50);
        System.out.println(stack.peek());
        for (int i : stack.arr) {
            System.out.println(i);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int i) {
        if (isFull()) {
            throw new RuntimeException("Stack if Full.");
        }
//        top+=1;
//        int max_position=top;
//        arr[max_position]=i;

        arr[++top] = i;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is Empty.");
        }
//        int max_to_return=top;
//        int to_return=arr[max_to_return];
//        top-=1;
//        return to_return;
        return arr[--top];
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is Empty.");
        }
        return arr[top];
    }
}
