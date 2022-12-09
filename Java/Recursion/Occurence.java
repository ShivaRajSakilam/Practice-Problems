package Recursion;

public class Occurence {
    static int a=-1,b=-1;
    public static void occur(String str, char key,int i){
        if (i==str.length()) {
            return;
        }
        else{
        if(str.charAt(i)==key && a==-1){
            a=i+1;
        }
        else if(str.charAt(i)==key && a!=-1){
            b=i+1;
        }
        occur(str, key, i+1);
    }

    }
    public static void main(String args[]){
        String str="abbccbbb";
        char key='b';
        occur(str, key,0);
        System.out.println("first occurence"+a);
        System.out.println("last occurence"+b);
    }
    
}
