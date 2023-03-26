package Divide_and_Conquer;

//Searching an element in rotated array, using a binary search approach
//this can be also called modified binary search

public class Rotated_search {
    public static int search_res(int[] arr,int key) {
        int si=0,ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(key==arr[mid])
            return mid;
            else if(arr[si]<=arr[mid]){
                if(arr[si]<=key && key<=arr[mid]){
                    //move left
                    ei=mid-1;
                }else{
                    //move right
                    si=mid+1;
                }
            }else{
                if(arr[mid]<=key && key<=arr[ei]){
                    //move right
                    si=mid+1;
                }else{
                    //move left
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
    public static int search_res1(int[] arr, int key, int si, int ei) {
        int mid=(si+ei)/2;
        if(si>ei)
        return -1;
        if(arr[mid]==key)
        return mid;
        else if(arr[si]<=arr[mid]){
            if(arr[si]<=key && key<=arr[mid]){
                //move left
                return search_res1(arr, key, si, mid-1);
            }else{
                //move right
                return search_res1(arr, key, mid+1, ei);
            }
        }else{
            if(arr[mid]<=key && key<=arr[ei]){
                //move right
                return search_res1(arr, key, mid+1, ei);
            }else{
                //move left
                return search_res1(arr, key, si, mid-1);
            }
        }

        // return -1;
    }
    public static void main(String[] args) {
        int[] arr={7,8,9,10,1,2,3,4,5,6};
        int key=5;
        System.out.println("Using while loop");
        System.out.println(search_res(arr,key));
        System.out.println("Using Recursion");
        System.out.println(search_res1(arr,key,0,arr.length-1));
    }
}
