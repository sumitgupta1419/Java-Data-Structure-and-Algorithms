import java.util.Scanner;

public class rotatematrix {

     static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
     static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    static  void  reverseArray(int[] arr){
        int i=0; int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        
    }



    static  void rotate(int[][] matrix,int n){
        findTranspose(matrix, n, n);
        for(int i =0;i<n ;i++){
            reverseArray(matrix[i]);
        }

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix:");
        printMatrix(matrix);

        rotate(matrix, r);

        System.out.println("rotation of matrix");
        printMatrix(matrix);
}
}
