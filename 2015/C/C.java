import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int w = 0;
		input.nextLine();
		ArrayList<Integer> rod = new ArrayList<Integer>();
		while (t-->0) {
			String st = input.nextLine();
			String [] temp = new String[1000];
			temp = st.split(" ");
			w = 0;
			for (String s:temp)
				rod.add(Integer.parseInt(s));
			Collections.sort(rod);
			while (rod.size()>1) {
				if (rod.get(rod.size()-1) == 200) {
					rod.remove(rod.size()-1);
					continue;
				}
				if (rod.get(rod.size()-1) + rod.get(0) > 200) {
					w = w + 200 - rod.get(rod.size()-1);
					rod.remove(rod.size()-1);
					continue;
				}
				if (rod.get(rod.size()-1) + rod.get(0) == 200) {
					rod.remove(rod.size()-1);
					rod.remove(0);
					continue;
				}
				int j=0;
				while (true) {
					int n = rod.get(rod.size()-1) + rod.get(j);
					if (n < 200 && j==rod.size()-2) {
						rod.remove(rod.size()-1);
						rod.remove(rod.size()-1);
						rod.add(n);
						break;
					}else if (n<200) {
						j++;
						continue;
					}else {
						n = rod.get(rod.size()-1) + rod.get(j-1);
						rod.remove(rod.size()-1);
						rod.remove(j-1);
						rod.add(n);
						break;
					}
				}
			}
			w = w + 200 - rod.get(0);
			System.out.println(w);
			rod.clear();
		}
	}
}
	
			