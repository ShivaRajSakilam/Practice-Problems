import java.util.Scanner;

class Butterfly{
    public static void printButterfly(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n; j++) {
                if (j<=i || j>=(2*n)-i+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= 2*n; j++) {
                if (j<=i || j>=(2*n)-i+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        System.out.println("enter n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printButterfly(n);
        sc.close();

    }
}