import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your  name");
        String name = sc.next();
        System.out.println("name is "+name);

        System.out.println("enter your lucky number");
        int num_1=sc.nextInt();

        System.out.println("lucky number is " + num_1);

    }
    
}
