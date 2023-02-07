package Recursion;

public class Binary_Strings {
    public static int num(int n, int x) {//number of binary strings can be formed without consecutive 1s....
        if(n==1 && x==1){
            return 1;
        }
        else if(n==1 && x==0){
            return 2;
        }
        else if(x==0){
            int z=num(n-1, 0);
            int o=num(n-1, 1);
            return z+o;
        }
        else{
            int z=num(n-1, 0);
            return z;
        }
        // return 0;
        
    }
    public static void printnum(int n, int x, String s) {
        if(n==0){
            System.out.println(s);
            return;
        }
        
        if(x==0){
            printnum(n-1, 0,s+"0");
            printnum(n-1, 1,s+"1");
            
        }
        else{
            printnum(n-1, 0,s+"0");
            
        }
        // return 0;
        
    }
    
    public static void main(String[] args) {
        System.out.println(num(4, 0));
        printnum(4, 0, "");
    }
}
