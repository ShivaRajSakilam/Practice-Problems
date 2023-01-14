public class Stringcompress {
    public static String compress(String s){
        Integer count=1;
        StringBuilder sb= new StringBuilder("");
        char c=s.charAt(0);
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==c){
                count++;
            }else{
                if(count>1)
                    sb.append((char)(count+'0'));
                count=1;
                c=s.charAt(i);
                sb.append(s.charAt(i));
            }
        }
        sb.append((char)(count+'0'));
        return sb.toString();

    }
    public static void main(String args[]){
        String s="aabbccccddd";
        System.out.println(compress(s));
    }
}
