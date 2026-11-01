package Problem_Solving.Array.chatgpt._1_frequencyCounting;

import java.util.Arrays;

public class TwoPointersNumber {
    public static void main(String[] args) {

        int[]a={1,2,3,0,4,5,8,0};
        moveZerosToEnd(a);
    }
    public static int[] twoSumInSortedArray(int[]arr,int target){
        int start=0,end=arr.length-1;

        while (start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return new int[]{start,end};
            }else if(sum>target){
                end--;
            } else {
                start++;
            }
        }
        return new int[0];
    }

    public static int removeDuplicatesFromSortedArray(int[]arr){
        if (arr.length == 0) {
            return 0;
        }
        int left=0,right=1;
        while (right<arr.length){
            if(arr[left]==arr[right]){
                right++;
            }
            else if(arr[left]!=arr[right]){
                left++;
                arr[left]=arr[right];
                right++;
            }
        }
        return left+1;
    }
    public static void moveZerosToEnd(int[]arr){
        int left=0,right=0;

        while (right<arr.length){
            if(arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isPalindrome(String str) {
       char[]c=str.toCharArray();
       int left=0,right=str.length()-1;
       while (left<right){
           if(Character.toLowerCase(c[left])!=Character.toLowerCase(c[right])){
               return false;
           }
           left++;
           right--;
       }
       return true;
    }

    public static int removeDuplicates(int[]a){
        int left=0,right=1;

        while (right<a.length){
            if(a[left]!=a[right]){
                left++;
                a[left]=a[right];
            }
            right++;
        }
        return left+1;
    }
    public static int[] moveZerosToLeft(int[]a){
        int left=0;
        for(int right=0;right<a.length;right++){
            if(a[left]==0&&a[right]!=0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
            }
        }
        return a;
    }
}
