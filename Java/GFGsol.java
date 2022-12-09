class GFGsol {
    public static int totalCuts(int N, int K, int[] A) {
        if(K==0){
            return N-1;
        }
        int cuts=0;
        for(int i=0;i<N-1;i++){
            
            if((findL(A,(i+1))+findS(A,N,i))>=K){
                cuts++;
                }
        }
        return cuts;
    }
    public static int findL(int[] a, int total){  
        int max=a[0];  
        if(total==1){
            return a[0];
        }
          for (int j = 0; j < total; j++){  
                if (max < a[j]){  
                    max=a[j];  
                }  
            }  
       return max;  
    }  
    public static int findS(int[] a, int total, int b){  
        int min=a[b+1];  
        if(((total-b)+1)==1){
            return a[b+1];
            }
          for (int j = b + 1; j < total; j++){  
                if (min > a[j]){  
                    min=a[j];  
                }  
            }  
       return min;  
    }  
}
        