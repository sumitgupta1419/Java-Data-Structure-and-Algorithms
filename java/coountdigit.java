
import java.util.Scanner;

public class coountdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int numofdigit =0;
        int original=n;

        while(n>0){
            n=n/10;
            numofdigit++;
        }
        System.out.println("number of digit in"+original+"="+numofdigit  );
    }
}
