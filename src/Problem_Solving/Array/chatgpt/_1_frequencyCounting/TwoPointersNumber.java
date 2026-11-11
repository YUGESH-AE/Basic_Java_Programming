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

    public static String reverseVowels(String str) {

        char[]chars=str.toCharArray();
        int left=0,right=str.length()-1;

        while (left<right){

            while (left<right&&!isVowel(chars[left])){
                left++;
            }
            while (left<right&&!isVowel(chars[right])){
                right--;
            }

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);

    }

    private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }


    public static boolean validPalindrome(String str) {

        int left=0,right=str.length()-1;

        while (left<right){

            if(str.charAt(left)!=str.charAt(right)){
                return isPalindrome(str,left,right-1)
                        || isPalindrome(str,left+1,right);
            }
            left++;
            right--;
        }
        return true;

    }

    public static boolean isPalindrome(String str,int left,int right){
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean twoSumTarget(int[]a,int target){
        int left=0,right=a.length-1;

        while (left<right){
            int sum=a[left]+a[right];

            if(sum==target){
                return true;
            } else if (sum<target) {
                left++;
            } else if (sum>target) {
                right--;
            }
        }
        return false;
    }



    public static int[] twoSumIndices(int[] arr, int target) {

        int left=0,right=arr.length-1;

        while (left<right) {

            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[]{0, 0};
    }
}
