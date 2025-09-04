
import java.util.Scanner;

//USING WHILE LOOP


public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
       // int num=1;
       // int sum=0;

        //while(num<=n){
          //  System.out.println(num);
           // sum=sum+num;
           // num++;
          //  System.out.println(sum);
       // }



       // USING FOR LOOP

      // for(int num=1;num<=n;num++){//
        //   System.out.println(num);
     //  }


     // USING DO WHILE LOOP

     int num=sc.nextInt();
      int sum=0;
      do{
        sum+=num;
        num=sc.nextInt();
      }
      while(num!=-1);
      System.out.println(sum);
       
    }
}
