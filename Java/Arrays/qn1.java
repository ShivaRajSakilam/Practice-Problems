package Arrays;
import java.util.ArrayList;
import java.util.Scanner;


// import javax.sql.rowset.spi.SyncResolver;

public class qn1 {
    public static boolean check(int k, ArrayList<Integer> list ){
        int i=0;
        for(i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==k){
                    return true;
                }
            }
        }
        // if(i==list.size()){
            return false;
        // }
    }
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total number of terms");
        int n= sc.nextInt();
        System.out.println("enter list of elements");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("enter the key element");
        int k=sc.nextInt();
        sc.close();

        System.out.println(check(k, list));


    }

}
