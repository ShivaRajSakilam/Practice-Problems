public class Strings {
    public static void main(String args[]) {
        // String name = "TonyStark";
        // System.out.println(name.substring(0, 4));
        StringBuilder sb = new StringBuilder("Tony");
//Set Char
System.out.println(sb.charAt(0));
sb.setCharAt(0, 'P');
System.out.println(sb);
//Insert char
sb.insert(0, 'S');
System.out.println(sb);
//delete char
sb.delete(0, 1);
System.out.println(sb);
//append= to add something at the end
sb.append(" Stark");
System.out.println(sb);

    }
    
}
