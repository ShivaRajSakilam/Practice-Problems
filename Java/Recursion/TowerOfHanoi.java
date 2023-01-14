public class TowerOfHanoi {
    public static void towerOfHanoi1(int n, String src, String helper, String dest){
        towerOfHanoi(n, src, helper, dest);
        towerOfHanoi2(n, src, helper, dest);
    }
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
    if(n == 1) {
    System.out.println("transfer disk " + n + " from " + src + " to " + helper);
    return;
    }
    //transfer top n-1 from src to helper using dest as 'helper'
    towerOfHanoi(n-1, src, helper, dest);
    //transfer nth from src to dest
    System.out.println("transfer disk " + n + " from " + src + " to " + helper);
    //transfer n-1 from helper to dest using src as 'helper'
    // if(n==4){
    // 
    // }
    }
    public static void towerOfHanoi2(int n, String src, String helper, String dest){
        if(n==0){
            return;
        }
    System.out.println("transfer disk " + n + " from " + helper + " to " + dest);
    towerOfHanoi2(n-1, src, helper, dest);
    }
    public static void main(String args[]) {
    int n = 4;
    towerOfHanoi1(n, "A", "B", "C");
    }

    
}
