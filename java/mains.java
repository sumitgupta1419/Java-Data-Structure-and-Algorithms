class arraysexample {

     void multiarrays(){
        // int[][] arr_1=new int[5][3];
        int[][] arr ={{56,43,6},{34,7,8},{12,56,8}};


        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }






        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
     }


    void demoarrays(){
        int [] ages=new int[3];
        float[] weight=new float [3];
        String[]names={"rahul","raj","sumit"};
        ages[0]=34;
        ages[1]=12;
        ages[2]=45;
        //  ages[3]=45;
        weight[0]=23.8f;
        weight[1]=45.5f;
        weight[2]=87.7f;

        System.out.println(ages[0]);
         System.out.println(ages[1]);
          System.out.println(ages[2]);

        System.out.println(weight[0]);  
        
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    }
}

public class mains {
    public static void main(String[] args) {
        arraysexample obj =new arraysexample();
        obj.demoarrays();
    }
}