package Recursion;

public class Numbers {
    public static int nth_fibNum(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return nth_fibNum(n - 2) + nth_fibNum(n - 1);
        }
    }

    public static int sum_nNums(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum_nNums(n - 1);
        }
    }

    public static void numsincrs(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            numsincrs(n - 1);
            System.out.println(n);
            // return;
        }
    }

    public static void numsdecrs(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            System.out.println(n);
            numsdecrs(n - 1);
            // return;
        }
    }
    public static int fact(int n) {
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        // System.out.println("Decreasing order");
        // numsdecrs(5);
        // System.out.println("increasing order");
        // numsincrs(5);
        // System.out.println(sum_nNums(5));
        System.out.println(nth_fibNum(6));
        // System.out.println(fact(5));
    }
}
