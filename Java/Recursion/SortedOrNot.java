package Recursion;

public class SortedOrNot {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
        return true;
        }
        //else{
            if(arr[idx]>arr[idx+1]){
            return false;
            //}
            // else
        }
        // return false;
        return isSorted(arr,idx+1);

    }
    public static void main(String args[]){
        // int[] arr= new int[10];
        int[] arr={1,3,4,2,8};
        if(isSorted(arr,0)){
            System.out.println("the given array is sorted");
        }
        else
        System.out.println("the given array is not sorted");
    }
}
