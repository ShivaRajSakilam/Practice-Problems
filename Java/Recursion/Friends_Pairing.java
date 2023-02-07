package Recursion;

public class Friends_Pairing {
    public static int ways(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int pair=(n-1)*ways(n-2);
        int single=ways(n-1);
        return pair+single;
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
