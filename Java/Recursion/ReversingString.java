package Recursion;

public class ReversingString {
    public static String reverse(String str){
        if (str.length()==1) {
            return str;
        }
        char currchar= str.charAt(0);
        String rev=reverse(str.substring(1));
        return rev+currchar;
    }
    public static void main(String args[]){
    String str= "abcd";
    System.out.println(reverse(str));
    }
    
}
