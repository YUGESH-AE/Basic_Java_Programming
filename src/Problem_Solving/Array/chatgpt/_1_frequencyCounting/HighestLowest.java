package Problem_Solving.Array.chatgpt._1_frequencyCounting;

public class HighestLowest {
    public static void main(String[] args) {

//        int[] arr = {10, 5, 20, 8, 15, 20};
        int[] arr = {10, 10, 8, 8, 5, 3};
//        System.out.println(secondHighest(arr));
        System.out.println(thirdHighest(arr));
    }

    public static int secondHighest(int[] arr) {

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            } else if (i<first&&i>second) {
                second=i;
            }
        }
        return second;
    }

    public static int thirdHighest(int[]arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i:arr){
            if(i>first){
                third=second;
                second=first;
                first=i;
            } else if (i<first&&i>second) {
                third=second;
                second=i;
            }else if(i<second&&i>third){
                third=i;
            }
        }
        return third;
    }

    public static int thirdLowest(int[]arr){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;

        for(int i:arr){
            if(i<first){
                third=second;
                second=first;
                first=i;
            } else if (i>first&&i<second) {
                third=second;
                second=i;
            } else if (i>second&&i<third) {
                third=i;
            }
        }
        return third;
    }
}
