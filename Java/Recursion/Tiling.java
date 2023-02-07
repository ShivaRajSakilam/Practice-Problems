package Recursion;

public class Tiling {
    public static int ways(int n) { //2xn floor
        if(n==1 || n==0){
            return 1;
        }
        int vertical=ways(n-1);
        int horizontal=ways(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(ways(6));
    }
}
