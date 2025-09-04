
import java.util.Scanner;

public class prefixSum {
    static  void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]  +  " ");
        }
        System.out.println();
    }

    static int []makeprefixsumarray(int[] arr){

        int n=arr.length;
        int[]pref = newInt[n];
        pref[0]=arr[0];

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("enter" + n "element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    }
}
