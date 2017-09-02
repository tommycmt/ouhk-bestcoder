
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        StringBuilder out =new StringBuilder();
        ArrayList<Integer> a = new ArrayList<>();
        while (true) {
            a.clear();
            int t = input.nextInt();
            if (t == 0) 
                break;
            int sum = 0;
            for (int i=0;i<t;i++) {
                int n =input.nextInt();
                sum += n;
                a.add(n);
            }
            int left = 0;
            int right = 0;
            while (a.size() > 1) {
                left += a.get(0);
                right += a.get(a.size()-1);
                a.remove(0);
                a.remove(a.get(a.size()-1));
            }
            if (left == right)
                out.append("BALANCE");
            else if (left > right) 
                out.append("LEFT");
            else
                out.append("RIGHT");
            out.append("\n");
        }
        System.out.print(out);
    }
}
