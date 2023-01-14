public class TowerOfHanoi2 {
    public static void towerOfHanoi(int n, String A, String B, String C) {
        if(n == 1) {
        System.out.println("transfer disk " + n + " from " + A + " to " + C);
        return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, A, C, B);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + A + " to " + C);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, B, A, C);
        }
        public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
        }
        
    
}
