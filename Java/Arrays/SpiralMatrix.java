import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.println("enter no. of rows");
    int rows= sc.nextInt();
    System.out.println("enter no. of cols");
    int cols= sc.nextInt();
    int[] a= new int[rows*cols];
    int rowStart=0, rowEnd=rows-1, colStart=0, colEnd=cols-1;
//taking input in spiral manner
int[][] b= new int[10][10];
    System.out.println("enter elements");
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            b[i][j]=sc.nextInt();

        }
    }
    int i=0;
    while (rowStart<=rowEnd && colStart<=colEnd) {
        for (int index = colStart; index <= colEnd; index++) {
            a[i]=b[rowStart][index];
            i++;
                
        }
        rowStart++;
        for (int index = rowStart; index <= rowEnd; index++) {
            a[i]=b[index][colEnd];
             i++;   
        }
        colEnd--;
        for (int index = colEnd; index >= colStart; index--) {
            a[i]=b[rowEnd][index];
            i++;
                
        }
        rowEnd--;
        for (int index = rowEnd; index >= rowStart; index--) {
            a[i]=b[index][colStart];
            i++;
                
        }
        colStart++;
        
    }
    // printing 2D array that is matrix
    //for (int i = 0; i < rows; i++) {
        System.out.println("the spiral order of given matrix:");
                for (int k=0; k<a.length; k++) {
            System.out.print(a[k] +" ");
            
        }
        //System.out.println("");
   // }
    
     sc.close();   
    }
    
}
