public class SumOfElementRecarray {
    static int sumofarray(int[]arr,int idx){

        // base case
        if(idx==arr.length){
            return 0;
        }
        // recursive work-sub problem
        int smallAns=sumofarray(arr, idx+1);

        // self work
        int ans= smallAns+arr[idx];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,22,13,14};
        System.out.println(sumofarray(arr, 0));
    }
}
