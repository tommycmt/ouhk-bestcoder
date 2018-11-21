
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class G {

    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("G");
//        System.setIn(fis);
//        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
//        
        StringBuilder out = new StringBuilder();
        //      Scanner s = new Scanner(System.in);
        while (true) {
            String line = input.readLine();
            if (line == null) {
                break;
            }
            if (line.contains(".") == false) {
                out.append("0\n");
                continue;
            } else {
                if (line.charAt(2) < '5') {
                    
                    out.append("0.");
                    out.append(line.charAt(2));
                } else {

                    out.append("0\n");
                    continue;
                }
            }
            line = line.substring(3);
            for (char c : line.toCharArray()) {
                if (c < '5') {
                    out.append(c);
                } else {
                    break;
                }

            }
            out.append("\n");
        }
        System.out.print(out);

    }
}
