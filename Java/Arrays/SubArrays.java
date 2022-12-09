package Arrays;

public class SubArrays {

    //printing all possible subarrays of an array
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

    //BruteForce method to find max sum of subarrays O(n^3)
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
        System.out.println("Max & Min sum of subarrays using BruteForce method: \n"+"Min:"+min+" Max:"+max);
    }

    //max sum of subarrays using prefix method O(n^2)
    public static void prefixMethod(int[] arr){
        int[] pfix=new int[arr.length];
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        //making prefix sum array
        pfix[0]=arr[0];
        for (int i = 1; i < pfix.length; i++) {
            pfix[i]=pfix[i-1]+arr[i];
        }

        //finding max subarray sum
        for (int i = 0; i < pfix.length; i++) {
            for (int j = 0; j < pfix.length; j++) {
                sum=(i==0)?pfix[j]:pfix[j]-pfix[i];
                if(sum>max){
                    max=sum;
                }
            }
            
        }
        System.out.println("Max sum of subarrays using prefix method: "+max);

    }

    //kadane's algorithm to find max sum of subarrys O(n)
    public static void kadanesAlgo(int[] arr){
        int currSum=0;
        int maxSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        System.out.println("Max sum of subarrays using kadane's algorithm: "+maxSum);
    }
    public static void main(String args[]){
        int[] arr= {1,2,3,4,5};

        printSubarrays(arr);
        maxMinSA(arr);
        prefixMethod(arr);
        kadanesAlgo(arr);

    }
}
