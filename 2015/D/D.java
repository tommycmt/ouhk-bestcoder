import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<ArrayList<String>> l = new ArrayList<ArrayList<String>>();
		int lv;
		String temp;
		for (int i = 0;i<17;i++)
			l.add(new ArrayList<String>());
		int tc = input.nextInt();
		for (int m=0;m<tc;m++) {
			int t = input.nextInt();
			input.nextLine();
			while (t-->0) {
				lv = 9;
				temp = input.nextLine();
				for (int i = 0; i<temp.length();i++) {
					if (temp.charAt(i) == '3' || temp.charAt(i) == '8' || temp.charAt(i) == '9')
						lv +=1;
					if (temp.charAt(i) == '4')
						lv -=1;
				}
				l.get(lv).add(temp);
				Collections.sort(l.get(lv),Collections.reverseOrder());
			}
			System.out.println("Case #" +(m+1)+":");
			for (int i = 16;i>=0;i--) {
				for (String st:l.get(i)) 
					System.out.println(st);
				l.get(i).clear();
			}
		}
	}
}

				
				
				