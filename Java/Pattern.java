import java.util.Scanner;

class Pattern{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter no. of rows:");
        int n=in.nextInt();

        for (int i = 1; i <= n; i++) {
            int a=1;
            for (int j = 1; j <= (2*n)-1; j++) {
                if(j>=n-i+1 && j<=n+i-1){
                    if(a==1){
                        System.out.print(i);
                        a--;
                    }
                    else{
                        System.out.print("*");
                        a++;
                    }
                }else
                    System.out.print(" ");
                
            }
            System.out.println();
        }
        in.close();
    }
}