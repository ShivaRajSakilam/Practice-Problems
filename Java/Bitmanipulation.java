// import java.util.stream.IntStream;

public class Bitmanipulation {
    public static void capsToSmall(String a) {
        for (int i = 0; i < a.length(); i++) {
            char ch= a.charAt(i);
            System.out.print((char)(ch|' '));
        }
    }
    public static void fastexponentiation(int a,int n) {
        int ans=1;
        while (n>0) {
            if((n&1) !=0)
                ans=ans*a;
            n=n>>1;
            a=a*a;
        }
        System.out.println(ans);
    }
    public static void countSetBits(int n) {
        int count=0;
        while(n!=0){
            if((n&1) != 0)
                count++;
            n=n>>1;
        }
        System.out.println(count);
    }
    public static void powerOf2ornot(int n) {
        if((n & n-1)==0)
            System.out.println("it is power of 2");
        else
            System.out.println("it is not a power of 2");
    }
    public static void clearRangeofBits(int n,int i, int j) {
        int b1=(~0)<<i;
        int b2=~((~0)<<(j-1));
        int b3=b1|b2;
        System.out.println(n&b3);
    }
    public static void clearLastIbits(int n, int i) {
        int bitMask=((~0)<<i);
        System.out.println((n&bitMask));
    }
    public static void clearIthbit(int n, int i) {
        int n1=1<<i;
        System.out.println((n&(~n1)));
    }
    public static int getIthbit(int n, int i) {
        if((n&(1<<i))==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void setIthbit(int n, int i) {
        n=(n|(1<<i));
        System.out.println(n);
    }
    public static void evenorodd(int n) {
        //  int bitMask=1;
         if((n & 1) ==0){
            System.out.println("even number");
         }
         else{
            System.out.println("odd number");
         }
        
    }
    public static void main(String[] args) {
        // System.out.println(~842189587); //not operator
        // System.out.println(5<<2); //left shift
        // System.out.println(5>>2); //right shift
        // evenorodd(100);
        // System.out.println(getIthbit(5, 0));
        // setIthbit(4, 2);
        // clearIthbit(5,0);
        // clearLastIbits(6, 4);
        // clearRangeofBits(15,3,2);
        // powerOf2ornot(10);
        // powerOf2ornot(8);
        // powerOf2ornot(12);
        // powerOf2ornot(16);
        // countSetBits(3);
        // fastexponentiation(3,5);
        capsToSmall("SHIVARAJ");
    }
}
