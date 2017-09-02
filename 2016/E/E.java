import java.util.*;

public class E{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t;
    int dayCount = 1;
    while (in.hasNextInt()) {
      t = in.nextInt();
      in.nextLine();
      int[] start = new int[t];
      int[] end = new int[t];
      int[] dur = new int[t];
      int max = 0;
      int maxIndex = 0;
      String[] lines = new String[t];
      for(int i=0;i<t;i++){
        lines[i] = in.nextLine();
        start[i] = Integer.parseInt(lines[i].substring(0,2))*60 + Integer.parseInt(lines[i].substring(3,5));
        end[i] = Integer.parseInt(lines[i].substring(6,8))*60 + Integer.parseInt(lines[i].substring(9,11));
      }
      for(int j=t-1;j>=0;j--){
        dur[j] = end[j]-start[j];
        if(j<t-1)
          if(end[j]>=start[j+1])
            dur[j]+=dur[j+1]-(end[j]-start[j+1]);
        
        if(j==t-1||dur[j]>max){
          max = dur[j];
          maxIndex = j;
        }
      }
      int starthr = start[maxIndex]/60;
      int endhr = start[maxIndex]%60;
      String total = "";
      if(starthr>=10)
        total+=starthr+":";
      else total+="0"+starthr+":";
      if(endhr>=10)
        total+=endhr;
      else total+="0"+endhr;

      int lasthr = dur[maxIndex]/60;
      int lastmin = dur[maxIndex]%60;
      String laststr = "";
      if(lasthr>0)
        laststr+=lasthr+" hours and "+lastmin+" minutes.";
      else laststr+=lastmin+" minutes.";
      System.out.println("Day #"+dayCount+": the longest busy hour starts at "+total+" and lasts for "+laststr);
      dayCount++;
    }
  }
}