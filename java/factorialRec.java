public class factorialRec {
    static  int factorial(int n){
        // base case

        if(n==0)  return 1;
        
        // small problem rcursive work

        int smallAns=factorial(n-1);

        //  big proble,-self work
        int ans=n*smallAns;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
