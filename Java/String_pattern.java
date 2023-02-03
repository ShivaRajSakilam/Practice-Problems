//a string is given as input and it is arranged in two D array, where 1st column is filled
//as per string order and 2nd column only a single or two characters at its median
// ex:shivaraj num rows=3
//s   a
//h v r j
//i   a
//output should be: sahvrjia

//NOTE: THIS IS NOT A CODE FOR ZIGZAG CONVERSION

public class String_pattern{
    
    public static String convert(String s, int numRows) {
        char a[][]=new char[numRows][s.length()];
        int k=0;
        int j=0;
        if(numRows%2!=0){
        while(k!=s.length()){
        for(int i=0;i<numRows;i++){
            if(k<s.length()){
            if(j%2!=0){
                // if(numRows==2){
                //     a[0][j]=s.charAt(k);
                // k++;
                // break;
                // }else{
                a[numRows/2][j]=s.charAt(k);
                k++;
                break;
                // }
            }
            a[i][j]=s.charAt(k);
            k++;
            }else{
                break;
            }
        }
        j++;
        }
        }else{
            int n=1;
            while(k!=s.length()){
        for(int i=0;i<numRows;i++){
            if(k<s.length()){
            if(n%2==0){
                if(numRows==2){
                    a[0][j]=s.charAt(k);
                k++;
                j++;
                if(k>=s.length())
                    break;
                a[1][j]=s.charAt(k);
                k++;
                break;
                }else{
                a[numRows/2][j]=s.charAt(k);
                j++;
                k++;
                if(k>=s.length())
                    break;
                a[(numRows/2)-1][j]=s.charAt(k);
                k++;
                // n--;
                break;
                }
                
            }
            a[i][j]=s.charAt(k);
            k++;
            
            }else{
                break;
            }
        }
        n++;
        j++;
        }

        }
        String str="";
        for(int i=0;i<numRows;i++){
            for(int p=0;p<s.length();p++){
                if(a[i][p]!='\u0000')
                    str=str+a[i][p];
            }
        }
        return str;
    }
    public static void main(String[] args) {
        // String str="shivaraj";
        String str="ABCDEF";
        System.out.println(convert(str,5));
    }

}