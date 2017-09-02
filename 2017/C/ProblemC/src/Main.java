
import java.util.Scanner;


public class Main {
    static int a=0;
    static int b=0;
    static char[] ac =new char[32];
    static char[] bc =new char[32];
    
    static void on(char id, int p) {
        if (ac[32-(int)p] == '0' && id == 'A') {
            if (p == 32)
                a -= Math.pow(2,32);
            else
                a += Math.pow(2,p-1);
        } else if (bc[32-(int)p] == '0' && id == 'B') {
            if (p == 32)
                b -= Math.pow(2,32);
            else
                b += Math.pow(2,p-1);
        }
    }
    
    static void off(char id, int p) {
        if (ac[32-(int)p] == '1' && id == 'A') {
            if (p != 32)
                a -= Math.pow(2,32);
            else
                a += Math.pow(2,p-1);
        } else if (bc[32-(int)p] == '1' && id == 'B') {
            if (p != 32)
                b -= Math.pow(2,32);
            else
                b += Math.pow(2,p-1);
        }
    }
    
    static void toggle(char id, int p) {
        if (ac[32-(int)p] == '0' && id == 'A') {
            if (p == 32)
                a -= Math.pow(2,32);
            else
                a += Math.pow(2,p-1);
        } else if (bc[32-(int)p] == '0' && id == 'B') {
            if (p == 32)
                b -= Math.pow(2,32);
            else
                b += Math.pow(2,p-1);
        } else if (ac[32-(int)p] == '1' && id == 'A') {
            if (p != 32)
                a -= Math.pow(2,32);
            else
                a += Math.pow(2,p-1);
        } else if (bc[32-(int)p] == '1' && id == 'B') {
            if (p != 32)
                b -= Math.pow(2,32);
            else
                b += Math.pow(2,p-1);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        
        for (int i =0;i<32;i++) {
                ac[i] = '0';
                bc[i] = '0';
            }
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] la = line.split(" ");
            if (la[0].equals("SET")) {
                if (la[1].equals("A")) {
                    if (Integer.parseInt(la[2]) < 0)
                        a = ~Math.abs(Integer.parseInt(la[2])) +1;
                    else
                        a = Integer.parseInt(la[2]);
                } else {
                    if (Integer.parseInt(la[2]) < 0)
                        b = ~Math.abs(Integer.parseInt(la[2])) +1;
                    else 
                        b = Integer.parseInt(la[2]);
                }
            } else if (la[0].equals("ON")) {
                for (int c = 0; c < la.length-2; c++) {
                    on(la[1].charAt(0), Integer.parseInt(la[c+2]));
                    if (a < 0) {
                        a = ~Math.abs(a)+1;
                    }
                    if (b < 0) {
                        b = ~Math.abs(b)+1;
                    }
                    String s = Integer.toBinaryString(a);
                    for (int k=s.length();k<32;k++) {
                        s ="0" +s;
                    }
                    ac = s.toCharArray();
                    s = Integer.toBinaryString(b);
                    for (int k=s.length();k<32;k++) {
                        s ="0" +s;
                    }
                    bc = s.toCharArray();
                }
            } else if (la[0].equals("OFF")) {
                for (int c = 0; c < la.length-2; c++) {
                    off(la[1].charAt(0), Integer.parseInt(la[c+2]));
                    if (a < 0) {
                        a = ~Math.abs(a)+1;
                    }
                    if (b < 0) {
                        b = ~Math.abs(b)+1;
                    }
                    String s = Integer.toBinaryString(a);
                    for (int k=s.length();k<32;k++) {
                        s ="0" +s;
                    }
                    ac = s.toCharArray();
                    s = Integer.toBinaryString(b);
                    for (int k=s.length();k<32;k++) {
                        s ="0" +s;
                    }
                    bc = s.toCharArray();
                }
            } else if (la[0].equals("TOGGLE")) {
                for (int c = 0; c < la.length-2; c++) {
                    toggle(la[1].charAt(0), Integer.parseInt(la[c+2]));
                    if (a < 0) {
                        a = ~Math.abs(a)+1;
                    }
                    if (b < 0) {
                        b = ~Math.abs(b)+1;
                    }
                    String s = Integer.toBinaryString(a);
                    for (int k=s.length();k<32;k++) {
                        s ="0" +s;
                    }
                    ac = s.toCharArray();
                    s = Integer.toBinaryString(b);
                    for (int k=s.length();k<32;k++) {
                        s ="0" +s;
                    }
                    bc = s.toCharArray();
                }
            } else if (la[0].equals("FLIP")) {
                if (la[1].equals("A")) {
                    a = ~a;
                } else {
                    b = ~b;
                }
            } else if (la[0].equals("PRINT")) {
                if (la[1].equals("A")) {
                    out.append(a).append("\n");     
                } else 
                    out.append(b).append("\n");   
            } else if (la[0].equals("AND")) {
                    out.append(a&b).append("\n");           
            } else if (la[0].equals("OR")) {
                    out.append(a|b).append("\n");   
            } else if (la[0].equals("XOR")) {
                    out.append(a^b).append("\n");   
            } 
            if (a < 0) {
                a = ~Math.abs(a)+1;
            }
            if (b < 0) {
                b = ~Math.abs(b)+1;
            }
            String s = Integer.toBinaryString(a);
            for (int k=s.length();k<32;k++) {
                s ="0" +s;
            }
            ac = s.toCharArray();
            s = Integer.toBinaryString(b);
            for (int k=s.length();k<32;k++) {
                s ="0" +s;
            }
            bc = s.toCharArray();

/*            
            for (int i=0;i<32;i++) {
                out.append(ac[i]);
            }
            out.append("\n");
            
           for (int i=0;i<32;i++) {
                out.append(bc[i]);
            }

           out.append("\n");
*/
        }
        System.out.print(out);
    }
}
