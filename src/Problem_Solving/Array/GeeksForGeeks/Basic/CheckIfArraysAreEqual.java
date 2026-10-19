package Problem_Solving.Array.GeeksForGeeks.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
Given two arrays A and B of equal size N,
the task is to find if given arrays are equal or not.
Two arrays are said to be equal if both of them contain same set of elements,
arrangements (or permutation) of elements may be different though.
Note : If there are repetitions,
then counts of repeated elements must also be same for two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be
rearranged to {0,1,2,4,5}
Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only
one common value.
Your Task:
Complete check() function which takes both the given array
and their size as function arguments and returns true
if the arrays are equal else returns false.The 0 and 1 printing is done by the driver code.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(N)

Constraints:
1<=N<=107
1<=A[],B[]<=1018

https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&category[]=Strings&sortBy=submissions
 */
public class CheckIfArraysAreEqual {
    public static void main(String[] args) {
        long[] a = {2, 7, 0, 1, 4, 3};
        long[] b = {7, 2, 1, 4, 3, 0};
//        boolean val = twoArraysEqual(a, b, a.length);
        boolean val=twoArraysEqualUsingMap(a,b,a.length);
        if (val) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static boolean twoArraysEqual(long[] A, long[] B, int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        if (Arrays.equals(A, B)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean twoArraysEqualUsingMap(long[]a,long[]b,int n){
        HashMap<Long,Long>map=new HashMap<>();
        for(int i=0;i<n;i++){
            long num=a[i];
            if(map.containsKey(num)){
                long fre=map.get(num);
                fre++;
                map.put(num,fre);
            }else {
                map.put(num,(long)1);
            }
        }
        for(int i=0;i<n;i++){
            long num=b[i];
            if(map.containsKey(num)){
                long fre=map.get(num);
                fre--;
                map.put(num,fre);
            }
        }
        for(Map.Entry<Long,Long>hm:map.entrySet()){
            if(hm.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
