package Recursion;

public class Remove_Duplicates {
    public static StringBuilder rd(String str, StringBuilder sb, boolean a[], int i) {
        if(i==str.length()){
            return sb;
        }
        if(a[str.charAt(i)-'a']==true){
            //this is a duplicate element
            rd(str, sb, a, i+1);
        }else{
            a[str.charAt(i)-'a']=true;
            rd(str, sb.append(str.charAt(i)), a, i+1);
        }
        return sb;
    }
    public static void main(String[] args) {
        boolean a[]=new boolean[26];
        String s="rajshivaraj";
        StringBuilder sb=new StringBuilder("");
        System.out.println(rd(s, sb, a, 0));
    }
}
