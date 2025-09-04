
import java.util.Scanner;

public class pairSum {
    static int pairSum(int []arr,int target){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    
}

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n =sc.nextInt();
    int []arr= sc.nextInt[n];

    System.out.println("enter" + n + "elemen");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    System.out.println("enter targeted sum");
    int target=sc.nextInt();

    System.out.println(pairSum(arr,target));

}
