package Recursion;

public class Array_sortedOrNot {
    public static boolean isSorted(int a[],int i) {
        if(i==a.length-1){
            return true;
        }
        else if(a[i]>a[i+1]){
            return false;
        }
        else{
            return isSorted(a, i+1);
        }
        // return true;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,5,6};
        System.out.println(isSorted(a, 0));
    }
}
