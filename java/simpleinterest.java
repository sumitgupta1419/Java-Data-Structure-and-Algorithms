
import java.util.Scanner;


public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter principle");
        float p = sc.nextFloat();
         System.out.println("enter interest");
         float r = sc.nextFloat();
          System.out.println("enter time");
          float t = sc.nextFloat();

          float simpleinterest  =( p*r*t)/100;
          System.out.println(simpleinterest);


    }
    
}
