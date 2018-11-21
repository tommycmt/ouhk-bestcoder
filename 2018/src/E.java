
import java.util.ArrayList;
import java.util.Scanner;

public class E {
    public static void main(String[] arg){
        ArrayList<String> pre = new ArrayList<>();
        pre.add("MMM");pre.add("MMF");pre.add("MFM");pre.add("MFF");pre.add("FMM");pre.add("FMF");pre.add("FFM");pre.add("FFF");
        Scanner s = new Scanner(System.in);
        int cases = Integer.parseInt(s.nextLine());
        for(int i=0;i<cases;i++){
            int[] count = new int[9];
            String line = s.nextLine();
            for(int x=0;x<line.length()-2;x++){
                for(int keyIndex=0;keyIndex<pre.size();keyIndex++){
                    if(line.substring(x,x+3).contains(pre.get(keyIndex)))
                        count[keyIndex+1]++;
                }
            }
            String print = "";
            for(int x:count){
                print+=x+" ";
            }
            System.out.println(print.substring(2,print.length()-1));
        }
    }
}
