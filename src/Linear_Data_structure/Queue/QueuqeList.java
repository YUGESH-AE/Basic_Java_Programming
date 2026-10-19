package Linear_Data_structure.Queue;

public class QueuqeList {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(20);
        System.out.println("dequeue:" + q.dequeue());
        q.display();
    }
}
