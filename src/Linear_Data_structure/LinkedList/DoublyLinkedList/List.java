package Linear_Data_structure.LinkedList.DoublyLinkedList;

public class List {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);
        d.displayForward();
        System.out.println("\n");
        d.displayBackward();
        System.out.println("\n");
        d.addLast(40);
        d.addLast(50);
        d.addLast(70);
        d.deleteFirst();
        d.deleteLast();
        d.displayForward();
        System.out.println("\n");
        d.displayBackward();
    }
}
