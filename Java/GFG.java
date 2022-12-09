public class GFG{
    public static long findNumber(long N)
    {
        long i=0;
        long a=1;
        while(i!=N){
            if(containsOnlyOdd(a)){
                a++;
                i++;
            }
        }
        return a;
    }
    public static boolean containsOnlyOdd(long a){
        while(a!=0){
            if((a%10)%2!=0){
                a=a/10;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        findNumber(3);
    }
}