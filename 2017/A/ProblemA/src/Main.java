import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int max=20;
        int min=1;
        boolean cheat =false;
        int num = 0;
        String result="";
        while((num =Integer.parseInt(in.nextLine()))>0){
            result=in.nextLine();
            if(result.equals("too high"))
                if(num<=max)
                    max=num-1;
            if(result.equals("too low"))
                if(num>=min)
                    min=num+1;
            if(result.equals("correct")){
                if(num>max||num<min)
                    cheat=true;
                if(cheat)
                    out.append("Gino is a gino\n");
                else
                    out.append("Gino might be honest\n");
                max=20;
                min=1;
                cheat=false;
            }   
        }
        System.out.print(out);
    }
}
