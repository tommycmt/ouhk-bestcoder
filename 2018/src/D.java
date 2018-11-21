
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class D {
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int cases = Integer.parseInt(s.nextLine());
        for(int i=0;i<cases;i++){
            HashSet<BigInteger> set = new HashSet<>();
            String[] tokens = s.nextLine().split(" ");
            for(String x:tokens){
                set.add(new BigInteger(x));
            }
            ArrayList<BigInteger> b = new ArrayList<>();
            b.addAll(set);
          //  Arrays.sort(set.toArray();
            Collections.sort(b);
            String print ="";
            for(BigInteger x:b){
                print+=x+" ";
            }
            System.out.println(print.substring(0,print.length()-1));
        }
    }
}
