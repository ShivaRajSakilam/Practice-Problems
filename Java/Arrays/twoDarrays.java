package Arrays;

import java.util.Scanner;

public class twoDarrays {
    public static void takeInput(int arr[][]) {
        System.out.println("Enter matrix values:");
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    public static void print2D(int arr[][]) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of rows and columns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] T_Arr=new int[m][n];

        takeInput(T_Arr);
        print2D(T_Arr);
        sc.close();
    }
}
