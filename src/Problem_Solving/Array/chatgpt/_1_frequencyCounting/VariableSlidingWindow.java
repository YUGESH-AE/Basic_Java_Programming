package Problem_Solving.Array.chatgpt._1_frequencyCounting;

public class VariableSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(arr, 7));

    }

    public static int minSubArrayLen(int[]a,int target){
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int right=0;right<a.length;right++){
            sum+=a[right];
            while (sum>=target){
                min=Math.min(min,right-left+1);
                sum-=a[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
