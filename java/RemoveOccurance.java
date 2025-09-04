
import java.util.Scanner;

public class RemoveOccurance {
    static String removeA(String s,int idx){
        // base case
        if(idx==s.length()) return " ";

        // recursive work.....
        String  smallAns=removeA(s, idx+1);

        char currchar=s.charAt(idx);
        // self work 
        if(currchar!='a'){
            return currchar+smallAns;
        } else{
            return  smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeA(s, 0));
    }
}
