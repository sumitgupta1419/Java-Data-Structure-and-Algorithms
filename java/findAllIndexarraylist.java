
import java.lang.annotation.Target;
import java.util.ArrayList;

public class findAllindexarraylist {
    static ArrayList<Integer>allIndeces(int[]a,int n,int target,int idx){

        // base case
        if(idx>=n){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer>ans=new ArrayList<Integer>();

        // self work
        if(a[idx]==target){
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer>smallans=allIndeces(a, n, target, idx+1);
        ans.addAll(smallans);
        return ans;

    }
    public static void main(String[] args) {
        int []a={1,2,4,4,4,5,6};
        int target=4;
        int n=a.length;
        ArrayList<Integer> ans=allIndeces(a, n, target, 0);
        for(integer i=ans){
            System.out.println(i);
        }
    }
}
