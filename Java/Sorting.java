public class Sorting {
    public static void countingSort(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] count=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]!=0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x=arr[i];
            for (int j = i-1; j >=0; j--) {
                arr[j+1]=arr[j];

                if(arr[j]>x){
                    arr[j]=x;
                    continue;

                }else{
                    arr[j+1]=x;
                }

            }
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int min=i;
                if(arr[min]>arr[j]){
                    min=j;
                }
                //swapping 
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

            }
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    //swapping those elements
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int[] arr={5,3,4,1,2};
        System.out.print("Unsorted Array: "); 
        printArr(arr);
        System.out.println();

        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        countingSort(arr);
        
        System.out.print("  Sorted Array: ");
        printArr(arr);
    }
}
