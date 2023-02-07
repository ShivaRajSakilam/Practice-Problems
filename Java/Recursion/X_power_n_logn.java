package Recursion;

public class X_power_n_logn {
    public static int xn(int x, int n) {//O(n)
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return xn(x, n/2)*xn(x, n/2);
        }else{
            return x*xn(x, n/2)*xn(x, n/2);
        }
    }
    public static int xn_logn(int x, int n) {//O(logn)
        if(n==0){
            return 1;
        }
        int halfpower=xn_logn(x, n/2);
        int halfpowerSq=halfpower*halfpower;
        if(n%2!=0){
            halfpowerSq=x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        System.out.println(xn(2, 10));//O(n) complexity
        System.out.println(xn_logn(2, 5));//O(logn) complexity
    }
}
