
import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int sumofdigit=0;
        int original=0;
        while(n>0){
            sumofdigit +=n%10;
            n=n/10;
        }
        System.out.println("sum of digits"+original+"="+sumofdigit);
    }
}
