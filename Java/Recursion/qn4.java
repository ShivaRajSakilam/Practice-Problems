package Recursion;

public class qn4 {
    public static int substring_FLsame(String s, int i, int j, int count) {
        if(j<=i || i==s.length() || j==s.length()+1){
            return count;
        }
        String sub=s.substring(i,j);
        if(sub.length()==1){
            count++;
        }
        if(sub.charAt(0)==sub.charAt(sub.length()-1) && sub.length()!=1){
            count++;
        }
        return (substring_FLsame(s, i, j+1, count)+substring_FLsame(s, i+1, j, count))-substring_FLsame(s,i+1,j+1,count);
    }
    public static void main(String[] args) {
        String s="abcab";
        System.out.println(substring_FLsame(s, 0, 1, 0));
    }
}
