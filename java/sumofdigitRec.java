public class sumofdigitRec {
    static  int sod(int n){
        // base case
        if(n>=0&&n<=9){
            return  n;
        }
        // recursive work-small ans
        int smallans=sod(n/10);

        // self work
        int ans=smallans+n%10;
        return ans;


    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(sod(1234));
    }
}
