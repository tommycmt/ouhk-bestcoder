
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class A {

    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("AInput.txt");
//        System.setIn(fis);
//        
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader input = new BufferedReader(isr);
//        
//        StringBuilder out = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int cases = Integer.parseInt(s.nextLine());
        for (int i = 0; i < cases; i++) {
            Stack<String> stack = new Stack<>();
            String[] tokens = s.nextLine().split("");
            for(String x : tokens){
                if(x.equals("(")){
                    stack.add(x);
                }else if(x.equals(")")){
                    try{
                        if(stack.peek().equals("("))
                            stack.pop();
                        else{
                            System.out.println("NOT OK");
                            break;
                        }
                    }catch(java.util.EmptyStackException e){stack.add("a");break;}
                }
            }
            if(stack.size()==0)
                System.out.println("OK");
            else
                System.out.println("NOT OK");
        }

    }
}
