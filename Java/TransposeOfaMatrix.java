import java.util.Scanner;

public class TransposeOfaMatrix {
    public static void main(String[] args) {
        int rows, cols;
        //2D arrays
        //taking input
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows of the array");
        rows=sc.nextInt();
        System.out.println("enter no of columns of the array");
        cols=sc.nextInt();
        int[][] matrix= new int[rows][cols];
        System.out.println("enter elements for the 2D array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
// printing transpose of matrix
        System.out.println("Transpose of the given matrix");
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
