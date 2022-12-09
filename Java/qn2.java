// import java.util.*;
public class qn2 {
    public static void func(int[] a, int[] b){
        
        
        for(int i=0; i<a.length;i++){
            int k=1;
            for(int j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                k=k*a[j];
            }
            b[i]=k;
        }
        return;
    }
    public static void main(String args[]){
        int a[]={1,2,3};
        int[] b= new int[a.length];
        for (int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");  
        }  
        System.err.println(" ");
        func(a, b);
        for (int i = 0; i < b.length; i++) {  
            System.out.print(b[i] + " ");  
        } 

    }
}
