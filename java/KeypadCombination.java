public class KeypadCombination {
    static  void combination(String dig,String []kp,String res){
        // base case
        if(dig.length()==0){
            System.out.println(res+" ");
            return;
        }

        int currnum=dig.charAt(0);
        String currchoice=kp[currnum];

        for(int i=0;i<currchoice.length();i++){
            combination(dig.substring(1), kp, res+currchoice.charAt(i));
        }



    }
    public static void main(String[] args) {
        String dig="23";
        String [] kp={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig, kp, " ");
    }
}
