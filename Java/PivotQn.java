public class PivotQn{
    public static int pivotIndex(int[] nums) {
            int sl=0,sr=0,i;
            for( i=0;i<nums.length;++i){
                if(i==0){
                    sl=0;
                    for(int j=i+1;j<nums.length;j++){
                        sr=sr+nums[j];
                    }
                    if(sl==sr){
                    break;    
                    }
                }
                else if(i==nums.length-1){
                    sr=0;
                    sl=0;
                    for(int j=0;j<i;j++){
                        sl=sl+nums[j];
                    }
                    if(sl==sr){
                        break;    
                    }else{
                        i= -1;
                        break;
                    }
                }
                else{
                    sr=sl=0;
                    for(int j=0;j<=i-1;j++){
                       sl=sl+nums[j];
                    }
                    for(int k=i+1;k<=nums.length-1;k++){
                        sr=sr+nums[k];
                    }
                    if(sl==sr){
                    break;    
                    }
                }
               
            }
            return i;
        }

        public static void main(String args[]){
            int nums[]={1,7,3,6,5,6};
            System.out.println(pivotIndex(nums));
        }
}