class arraysexample {

//search in array
void SearchInArray(){
  int[]arr={10,5,3,6,2,8,4};
  int x=2;

  int ans=-1;
  for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
      ans=i;
    }
  }
  if(ans==-1){
    System.out.println("not found");
  }
  else{
    System.out.println("found" + x + "at index" +ans);
  }
  // System.out.println("found" + x + "at index" +ans);
// 
}




// maximum of arrays
  void maxofarray(){
    int[]arr={5,3,6,2,8,4};

    int ans=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]>ans){
        ans=arr[i];
       }
      }
       System.out.println(ans);
    
  }

// summ od=f arrays;

  void  sumofarray(){
    int[]arr={1,4,5,6,1};
    int sum=0;

    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    System.out.println(sum);
  }




    
    void demoarrays(){
        int[] ages= new int[3];
      float[] weight = new float[3];
      String[] names= new String[]{"rahul", "raj", "sumit"};


      // System.out.println(ages.length);
      // System.out.println(weight.length);
      // System.out.println(names.length);


      ages[0] = 34;
      ages[1] = 12;
      ages[2] = 45;

// USING LOOPS

     for(int i=0;i<3;i++){
      System.out.println(ages[i]);
     }

      weight[0] = 23.8F;
      weight[1] = 45.5F;
      weight[2] = 87.7F;
      System.out.println(ages[0]);
      System.out.println(ages[1]);
      System.out.println(ages[2]);

      System.out.println(weight[0]);

      System.out.println(names[0]);
      System.out.println(names[1]);
      System.out.println(names[2]);
    }
    
}

public class ain{
  public static void main(String[] args) {
      arraysexample obj =new arraysexample();
      // obj.demoarrays();
      // obj.sumofarray();
      // obj.maxofarray();
      obj.SearchInArray();
  }

}
