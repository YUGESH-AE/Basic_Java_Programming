package Problem_Solving.Array.chatgpt._1_frequencyCounting;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBased {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(kthLargestElement(arr,k));
    }

    public static int kthLargestElement(int[]arr,int k){

        if(arr==null||k<1||k>arr.length){
            throw new IllegalArgumentException("Invalid data");
        }

        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i:arr){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }

    public static int kthSmallestElement(int[]arr,int k){
        if(arr==null||k<1||k>arr.length){
            throw new IllegalArgumentException("Invalid data");
        }

        PriorityQueue<Integer>q=new PriorityQueue<>(Comparator.reverseOrder());

        for(int i:arr){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
