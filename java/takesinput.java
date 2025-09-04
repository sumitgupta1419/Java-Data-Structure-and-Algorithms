
import java.util.Scanner;

public class takesinput {


    static  void  printarray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        // int n= sc.nextInt();
        int [] arr=new int[5 ];

        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;


        // System.out.println("enter"  + n + "element");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
     System.out.println("original array");
    printarray(arr);



    // TRYING TO COPY ARR TO ARR_2

    int [] arr_2=arr;
    System.out.println("copied array");
    printarray(arr_2);

// changing some values of arr_2
arr_2[0]=0;
arr_2[1]=0;



System.out.println("original array after  changing arr_2");
printarray(arr);

System.out.println("copied arr_2 after changing arr_2");
printarray(arr_2);









        }
    }

