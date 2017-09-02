
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String b[] = {"0","1","2","3","4","5","6","7","8","9"};
        String o[] = {"000", "001", "010" , "011", "100", "101", "110", "111"};
        Scanner input = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.length() == 3) 
                for (int i =0;i<3;i++) {
                    out.append(o[((line.charAt(i))-'0')]);
                }
            else {
                out.append(Arrays.asList(o).indexOf(line.substring(0,3)));
                out.append(Arrays.asList(o).indexOf(line.substring(3,6)));
                out.append(Arrays.asList(o).indexOf(line.substring(6,9)));
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}
