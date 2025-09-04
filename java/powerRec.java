public class powerRec {
    static int pow(int p,int q){
        // base casse
        if(q==0) return 1;

        // recursive work
        int smallAns=pow(p, q-1);
        return smallAns*p;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }
}
