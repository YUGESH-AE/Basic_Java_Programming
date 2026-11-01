package Problem_Solving.Array.chatgpt._1_frequencyCounting;

public class FixedSlidingWindowNumbers {
    public static void main(String[] args) {

        System.out.println(maxSumInSubArray(new int[]{1,2,3,4,5},3));
    }
    public static int maxSumInSubArray(int[]a,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }

        int maxSum=sum;

        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }

}
