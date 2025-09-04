
import java.util.Scanner;

public class multidimensionArray {
    static  void  printarray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int r=sc.nextInt();
        System.out.println("enter no of coloum");
        int c=sc.nextInt();

        int [][] arr =new int[r][c];
        System.out.println("enter"  + r*c + "element");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        printarray(arr);






        // int[][] arr2={ { 1,5,6},
        //                {7,9,11},
        //                 {8,1,1}
        //               };

                    //   printarray(arr2);
    }
}
