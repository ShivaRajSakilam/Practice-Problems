public class Sudoku {
    public static void printMat(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] matrix, int i, int j, int k) {
        //row checking
        for (int k2 = 0; k2 < matrix.length; k2++) {
            if(matrix[i][k2]==k)
            return false;
        }
        //column checking
        for (int k2 = 0; k2 < matrix.length; k2++) {
            if(matrix[k2][j]==k)
            return false;
        }
        //grid checking
        for (int k2 = (i/3)*3; k2 < ((i/3)*3)+3; k2++) {
            for (int l = (j/3)*3; l < ((j/3)*3)+3; l++) {
                if(matrix[k2][l]==k)
                    return false;
            }
        }
        return true;
    }
    public static void solveIt(int[][] matrix, int i, int j) {
        // System.out.println(i+" "+j);
        if(i==9){
            printMat(matrix);
            return;
        }
        else if(j==9)
        solveIt(matrix, i+1, 0);
        
        else if(matrix[i][j]!=0)
        solveIt(matrix, i, j+1);
        
        else{
            for (int j2 = 1; j2 < 10; j2++) {
                if(isSafe(matrix,i,j,j2)){
                    matrix[i][j]=j2;
                    // System.out.println(matrix[i][j]);
                    solveIt(matrix, i, j+1);
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};

    solveIt(matrix, 0,0);
    // printMat(matrix);
    }
}
