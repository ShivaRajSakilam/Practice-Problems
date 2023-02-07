package Strings;
class StringPalindrome{
    public static boolean palindrome(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        if(s1.equals(s)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean palindrome2(String s){
        for (int i = 0; i < (s.length())/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        System.out.println(s);
        return true;
    }
    public static void main(String args[]){
        String s="aabbaa";
        if(palindrome2(s)){
            System.out.println("the given string is palindrome");
        }else{
            System.out.println("the given string is not a palindrome");
        }

    }
}

//method 2 is better than method 1, as space complexity is less for second one, we are
// not taking any new variable in the process for 2nd one, but in first case we are
//using a new variable called s1.
//when it comes to time complexity for first one it is O(n)
//but for second it is less than or equal to O(n/2)