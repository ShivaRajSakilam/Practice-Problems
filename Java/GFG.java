public class GFG{
    public static long findNumber(long N)
    {
        long i=1;
        long a=0;
        while(i!=N){
            if(containsOnlyOdd(i)){
                a++;
                i++;
            }else{
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
        System.out.println(findNumber(113));
    }
}