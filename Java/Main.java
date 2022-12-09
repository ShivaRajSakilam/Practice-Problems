import java.util.Scanner;

// My First Program
class Main{

    public static void main(String[] args)
    {
        System.out.println("Hello World!!!");
        System.out.println("Hi Shiva Raj, this is your first java program");
        
        //this is how we need to declare the variables
        // float a=10.1f, b=100.3f;
        //double c=15.26d, d=24.79d;
        
        //note the letters after the decimal for float and double
        
        //int e=50, f=45;
        //System.out.println(a,b,c,d,e,f);
        // System.out.println(a,b);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter a and b:");
        
        float a= scan.nextFloat();
        float b= scan.nextFloat();
        
        //Arithmetic operators
        System.out.print("a+b = ");
        System.out.println(a+b);
        
        System.out.print("a-b = ");
        System.out.println(a-b);
        
        System.out.print("a*b = ");
        System.out.println(a*b);
        
        System.out.print("a/b = ");
        System.out.println(a/b);;
        
        System.out.print("a%b = ");
        System.out.println(a%b);
        
        //conditional statements if else
        System.out.print("the greatest number is:");
        if(a>b){
        System.out.println(a);
        }
        else{
        System.out.println(b);
        }

        //for loop
        System.out.println("the numbers between a and b:");
        for(float i=a;i<=b;i++){
        System.out.println(i);
        }
        
        scan.close();//in java we need close any scanner after its use
    }
}

//Methods are functions of the java

