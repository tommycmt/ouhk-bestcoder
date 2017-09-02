
import java.util.Scanner;


public class NewMain {
    static int a=0;
    static int b=0;
    
    static void on(char id, int p) {
        if (id == 'A')
            a |= 1 << (p-1);
        else
            b |= 1 << (p-1);
    }
    
    static void off(char id, int p) {
        if (id == 'A')
            a &= ~(1 << (p-1));
        else
            b &= ~(1 << (p-1));
    }
    
    static void toggle(char id, int p) {
        if (id == 'A')
            a ^= 1 << (p-1);
        else
            b ^= 1 << (p-1);
    }
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] la = line.split(" ");
            if (la[0].equals("SET")) {
                if (la[1].equals("A")) 
                    a = Integer.parseInt(la[2]);
                else
                    b = Integer.parseInt(la[2]);
            } else if (la[0].equals("ON")) {
                for (int c = 0; c < la.length-2; c++) 
                    on(la[1].charAt(0), Integer.parseInt(la[c+2]));
            } else if (la[0].equals("OFF")) {
                for (int c = 0; c < la.length-2; c++) 
                    off(la[1].charAt(0), Integer.parseInt(la[c+2]));
            } else if (la[0].equals("TOGGLE")) {
                for (int c = 0; c < la.length-2; c++) 
                    toggle(la[1].charAt(0), Integer.parseInt(la[c+2]));
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

        }
        System.out.print(out);
        
    }
}