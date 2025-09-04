
import java.util.Scanner;

public class question {

    static  boolean issorted(int[] arr){
        boolean check=true;

        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                // nnot sorted
                check=false;
                break;
            }
        }
        return check;
    }

    static int countocurence(int[] arr,int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return  count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();

        int[]arr=new int[n];
        System.out.println("enter " + n + " element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // System.out.println("enter x");
        // int x=sc.nextInt();

        // System.out.println("COUNT OFF X:"+ countocurence(arr, x));
        System.out.println("is sorted" + issorted(arr));
    }
}
