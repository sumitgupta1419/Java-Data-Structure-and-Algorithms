public class fibonacciRec {
    static  int fib (int n){
        // base case
        if(n==0||n==1){
            return n;
        }
        // sub problrm -recursive work
        int prev=fib(n-1);
        int preprev=fib(n-2);

        // self work
        return  prev+preprev;

    }
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
