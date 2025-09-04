import java.util.Scanner;

public class spiralmatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printspiralorder(int[][] matrix , int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalElements=0;
        while(totalElements<r*c){

            for(int j=leftcol;j<=rightcol && totalElements<r*c;j++)
            System.out.println(matrix[toprow][j]+ " ");
            totalElements++;
        }
        toprow--;

        for(int i=toprow;i>=bottomrow && totalElements<r*c;i++){
            System.out.println(matrix[i][bottomrow]+ " ");
            totalElements++;
        }
        rightcol--;

        for(int j=rightcol;j>=leftcol && totalElements<r*c;j--){
            System.out.println(matrix[bottomrow][j]+ " ");
            totalElements++;

        }
        bottomrow--;

        for(int i=bottomrow;i>=toprow && totalElements<r*c;i--){
            System.out.println(matrix[i][leftcol] + " ");
            totalElements++;
        }
        leftcol++;


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

        System.out.println("Spiral Order");
        printspiralorder(matrix, r, c);
       

      }
}
