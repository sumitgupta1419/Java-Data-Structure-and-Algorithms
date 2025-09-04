public class SearchAllindex {
    static void findAllIndex(int []a,int n,int target,int idx){

        // base case
        if(idx>=n){
            return;
        }
        // self work
        if(a[idx]==target){
            System.out.println(idx);
        }
        // recursive work
        findAllIndex(a, n, target, idx+1);

    }

    public static void main(String[] args) {
        int[]a={1,2,4,4,4,5,6};
        int target=4;
        int n=a.length;
        findAllIndex(a, n, target, 0  );
    }
}
