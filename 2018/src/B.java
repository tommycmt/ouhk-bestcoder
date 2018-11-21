
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;

public class B {

    static int[] p;

    public static int findSet(int k) {
        return (p[k] == k) ? k : (p[k] = findSet(p[k]));
    }

    public static void u(int a, int b) {
        p[findSet(a)] = findSet(b);
    }

    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("BInput");
//        System.setIn(fis);

        Scanner input = new Scanner(System.in);

        StringBuilder out = new StringBuilder();
        int c= 0;
        while (true) {
            c++;
            int n = input.nextInt();
            int m = input.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = i;
            }
            for (int i = 0; i < m; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                u(a-1, b-1);
            }
            HashSet<Integer> s = new HashSet<>();
            int count = 0;
            for (int i =0;i<n;i++) {
                if (!s.contains(findSet(i))) {
                    s.add(findSet(i));
                    count++;
                }
            }
            out.append("Case "+c+": "+count+"\n");
        }
        System.out.print(out);
    }
}
