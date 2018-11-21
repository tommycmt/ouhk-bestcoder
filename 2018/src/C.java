
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


    class Node{
        public int id;
        public int value;
        public int leftId;
        public int rightId;
        public int level;

        public Node(String id, String value, String leftId, String rightId) {
            this.id = Integer.parseInt(id);
            this.value = Integer.parseInt(value);
            this.leftId = Integer.parseInt(leftId);
            this.rightId = Integer.parseInt(rightId);
            this.level = 0;
        }
        
    }

public class C {
    
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("AInput.txt");
        System.setIn(fis);
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        Scanner s = new Scanner(System.in);
        int cases = Integer.parseInt(s.nextLine());
        for(int i=0;i<cases;i++){
            ArrayList<Node> leafNodes = new ArrayList<>();
            ArrayList<Node> nonLeafNodes = new ArrayList<>();
            allNode:while(true){
                String line = s.nextLine();
                if(line.equals("-1"))
                    break;
                String[] node = line.split(" ");
                if(node[2].equals("-1")&&node[3].equals("-1")){
                    Node temp = new Node(node[0],node[1],node[2],node[3]);
                    leafNodes.add(temp);
                }
            }
            
        }
    }
}
