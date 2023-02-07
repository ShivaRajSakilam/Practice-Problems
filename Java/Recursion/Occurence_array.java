package Recursion;

public class Occurence_array {
    public static void first_occur(int a[], int i, int x) {
        if(i==a.length){
            System.out.println("Element not found");
            return;
        }
        else if(a[i]==x){
            System.out.println("Element found first at "+(i+1)+" position");
            return;
        }
        first_occur(a, i+1, x);
        
    }
    public static void last_occur(int a[],int i, int x) {
        if(i==-1){
            System.out.println("Element not found");
            return;
        }
        else if(a[i]==x){
            System.out.println("Element found last at "+(i+1)+" position");
            return;
        }
        last_occur(a, i-1, x);
    }
    public static int first_occur_int(int a[], int i, int x) {
        if(i==a.length){
            // System.out.println("Element not found");
            return -1;
        }
        if(a[i]==x){
            // System.out.println("Element found first at "+(i+1)+" position");
            return i;
        }
        return first_occur_int(a, i+1, x);
    }
    public static int last_occur_int(int a[], int i, int x) {
        if(i==-1){
            // System.out.println("Element not found");
            return -1;
        }
        if(a[i]==x){
            // System.out.println("Element found first at "+(i+1)+" position");
            return i;
        }
        return last_occur_int(a, i-1, x);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,6,6,4};
        // first_occur(a, 0, 4);
        // last_occur(a,a.length-1,4);
        System.out.println(first_occur_int(a, 0, 4));
        System.out.println(last_occur_int(a,a.length-1,10));
    }
}
