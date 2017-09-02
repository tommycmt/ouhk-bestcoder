import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] phone = {"","","ABCabc","DEFdef","GHIghi","JKLjkl","MNOmno","PQRSpqrs","TUVtuv","WXYZwxyz"};
		while (input.hasNextLine()) {
			String u = input.nextLine();
			String[] un = new String[u.length()];
			for (int i=0;i<u.length();i++) {
				un[i] = ""+ u.charAt(i);
			}
			int t =input.nextInt();
			input.nextLine();
			while (t-->0) {
				String p="";
				String name =input.nextLine();
				int ul = 0;
				int j=2;
				for (int i=0;i<name.length();i++) {
					j=2;
					while (j<=9 && ul == 0) {
					 	if ((phone[j].indexOf(""+name.charAt(i))) != -1) {
					 		if (u.indexOf(""+j) != -1) 
					 			ul = 1;
					 	}
					 	j++;
					 }
					 if (ul==1)  {
					 	System.out.println("UNLUCKY");
					 	break;
					 }
				}
				if (ul == 0) {
					System.out.println("LUCKY");
				}
			}
		}
	}
}