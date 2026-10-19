package Linear_Data_structure.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(40);
        s.push(100);
        System.out.println("The peek data in stack::" + s.peek());
        s.pop();
        System.out.println("The peek data in stack::" + s.peek());
    }
}

