
import java.util.Scanner;

public class BitGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vals = {0, 0};
        int pos = 0;
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(" +");
            if (line.length > 1) {
                pos = line[1].equals("A") ? 0 : 1;
            }
            switch (line[0]) {
                case "SET":
                    vals[pos] = Integer.parseInt(line[2]);
                    break;
                case "ON":
                    for (int i = 2; i < line.length; i++) {
                        vals[pos] |= (1 << (Integer.parseInt(line[i]) - 1));
                    }
                    break;
                case "OFF":
                    for (int i = 2; i < line.length; i++) {
                        vals[pos] &= ~(1 << (Integer.parseInt(line[i]) - 1));
                    }
                    break;
                case "TOGGLE":
                    for (int i = 2; i < line.length; i++) {
                        vals[pos] ^= (1 << (Integer.parseInt(line[i]) - 1));
                    }
                    break;
                case "FLIP":
                    vals[pos] = ~vals[pos];
                    break;
                case "PRINT":
                    System.out.println(vals[pos]);
                    break;
                case "AND":
                    System.out.println(vals[0] & vals[1]);
                    break;
                case "OR":
                    System.out.println(vals[0] | vals[1]);
                    break;
                case "XOR":
                    System.out.println(vals[0] ^ vals[1]);
                    break;
            }
        }
    }
}
