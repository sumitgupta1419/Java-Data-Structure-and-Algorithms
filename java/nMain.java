 class arraysexample {
    

 void  multiarrays(){
        // int[][]arr_1=new int[5][3];
        int[][]arr ={{56,43,6},{34,7,8},{12,56,8}};

        // arr[0]=array,  arr[0][2]

        System.out.println(arr[0][0]);
         System.out.println(arr[0][1]);
          System.out.println(arr[0][2]);

          System.out.println(arr[1][0]);
         System.out.println(arr[1][1]);
          System.out.println(arr[1][2]);


          System.out.println(arr[2][0]);
         System.out.println(arr[2][1]);
          System.out.println(arr[2][2]);

    }
}

 public class nMain {
  public static void main(String[] args) {
      arraysexample obj =new arraysexample();
      obj.multiarrays();
  }

}
