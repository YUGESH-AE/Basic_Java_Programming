package Java_Fundamentals.Arrays;

public class jaggedArray {
    public static void main(String[] args) {

        int[][]n=new int[3][];
        n[0]=new int[4];
        n[1]=new int[3];
        n[2]=new int[5];

        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i[]:n){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
