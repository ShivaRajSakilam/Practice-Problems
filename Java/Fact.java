class Fact {
    public static int f(int n, int a){
        // int a;
        if(n!=0)
        return a =n*f(n-1,a);
        else{
            
            return a;
        }
    }
    public static void main(String args[]){
        System.out.println(f(5,1));
    }
}
