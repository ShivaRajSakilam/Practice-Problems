package Arrays;

// import javax.xml.stream.events.EndDocument;

public class Arrays {
    // BinarySearch using recursion
    public static int keyindex(int[] arr, int key, int start, int end) {
        int mid = (start + end) / 2;
        if (start <= end && end <= arr.length - 1) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return keyindex(arr, key, start, mid - 1);
            } else if (arr[mid] < key) {
                return keyindex(arr, key, mid + 1, end);
            }
        }

        return -1;

    }

    // Binary search using while loop
    public static int bsearch(int[] arr, int key){
        int start=0;int end= arr.length;
        while (start<=end)  {
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void printSubarrays(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                }
                System.out.print("|");
                total++;
            }
            System.out.println();
        }
        System.out.println("the total no. of subarrays are "+total);
    }

    public static void maxMinSA(int[] arr){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    sum=sum+arr[j2];
                }
                if(sum>=max){
                    max=sum;
                }
                if(sum<=min){
                    min=sum;
                }
                // System.out.println(sum);
                sum=0;
            }
            // System.out.println();
        }
        System.out.println("Min:"+min+" Max:"+max);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // int key = 8;
        // int start = 0;
        // int end = arr.length - 1;
        // System.out.println(keyindex(arr, key, start, end));
        // System.out.println(bsearch(arr, key));
        printSubarrays(arr);
        maxMinSA(arr);
    }
}
