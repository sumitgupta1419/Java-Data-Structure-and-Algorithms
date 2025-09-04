
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(s);
        char ch=s.charAt(3);
        System.out.println(ch);

        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            //  substring method
            
        System.out.println(s.substring(2, 4));
         System.out.println(s.substring(2, 6));
          System.out.println(s.substring(2));

        }

    }
}
