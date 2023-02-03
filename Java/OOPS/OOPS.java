package OOPS;
import java.util.Scanner;
class Pen{
    // data members
    String color;
    String type;

    // methods or member functions
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(String color){
        System.out.println(color);
    }  
    
    public void printType(String type){
        System.out.println(type); 
    }

}
public class OOPS {
    public static void main(String args[]){
        Pen pen1 = new Pen();//object creation
        
        // pen1.color="black";
        // pen1.type="gel";
       
        System.out.println("give inputs for pen 1");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("color");
        String color= scan1.nextLine();
        //Scanner scan2 = new Scanner(System.in);
        System.out.println("type");
        String type= scan1.nextLine();
       
        System.out.print("the color of the pen is ");
        //System.out.println(pen1.color);
        pen1.printColor(color);
        System.out.print("the type of the pen is ");
        // System.out.println(pen1.type);
        pen1.printType(type);

        pen1.write();
        
        scan1.close();
        // scan2.close();
    }
    //scan.close();
}
