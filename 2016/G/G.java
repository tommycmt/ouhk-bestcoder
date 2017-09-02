import java.util.*;

public class G {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		for (int j=1; j<=t ;j++) {
			int m = 0;
			System.out.print("Case #"+j+": ");
			String s1 = input.nextLine();
			String s2 = input.nextLine();
			for (int i=0;i<s1.length();i++) {
				if (s2.indexOf(""+s1.charAt(i)) != -1) {
					System.out.println("yes");
					m = 1;
					break;
				}
			}
			if (m == 0)
				System.out.println("no");
		}
	}
}