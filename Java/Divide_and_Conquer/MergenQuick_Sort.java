package Divide_and_Conquer;

import java.util.*;
public class MergenQuick_Sort {
    public static void mergeSort(int[] arr, int si, int ei) {
        if(si>=ei)
        return;
        int mid=(si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr,int si, int mid, int ei ) {
        int[] temp= new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j])
            temp[k++]=arr[i++];
            else
            temp[k++]=arr[j++];
        }
        //remaining elements
        //left part
        while (i<=mid) 
            temp[k++]=arr[i++];
        //right part
        while(j<=ei)
            temp[k++]=arr[j++];
        
        //copying temp array into the original array
        for (int k2 = 0,i1=si; k2 < temp.length; k2++,i1++) {
            arr[i1]=temp[k2];
        }
    }
    public static void quickSort(int[] arr, int si, int ei) {
        if(si>=ei){
            return;
        }
        int pi=ei;
        int i=si-1;
        for (int j = si; j <=ei; j++) {
            if(arr[j]<=arr[pi]){
                //swap
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        quickSort(arr, si, i-1);
        quickSort(arr, i+1, ei);
    }
    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8,1};
        System.out.print("Unsorted Array:");
        printArr(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.print("Sorted Array:");
        printArr(arr);
        System.out.print("Unsorted Array:");
        int[] arr1={6,3,9,5,2,8,1};
        printArr(arr1);
        quickSort(arr1,0,arr.length-1);
        System.out.print("Sorted Array:");
        printArr(arr1);
    }
}

