import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();		
		while (t-->0) {
		int s=0;
			int in = input.nextInt();
			for (int i =1;i<in;i++) {
				if (in%i ==0 && i!= in) {
					s=s+i;
				}
			}
			if (s == in)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
			