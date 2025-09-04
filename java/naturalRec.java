
import java.util.Scanner;

public class naturalRec { 
static void printDecresing(int n){
    // base case
    if(n==1){
        System.out.println(1);
    }
    // self work
    System.out.println(n);
    // recursive work
    
    printDecresing(n - 1);
}





static  void printincreasing(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    printincreasing(n-1);
    System.out.println(n);

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    printincreasing(n);
    // printDecresing(n);

}
}