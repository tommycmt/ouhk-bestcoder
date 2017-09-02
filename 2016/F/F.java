import java.util.*;

public class F {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		int temp;
		while (input.hasNextLine()) {
			a.clear();
			int count = 0;
			int i= 0;
			int state = 0;
			int length = 0;
			boolean change = false;
			while (true) {
				temp = input.nextInt();
				if (temp != -1) {
					a.add(temp);
					length++;
				}else {
					break;
				}
				
				while (i <= length-2) {
					if (a.get(i+1) == a.get(i)) {
						i++;
						continue;
					}					
					if (state == 1) {
						if (a.get(i+1) - a.get(i) >0 )
							i++;
						else {
							state = 0;
							System.out.println("up"+a.get(i+1) +" "+ a.get(i));
							count++;
							change = true;
							i++;
						}
					}
					else if (state == 0) {
						if (a.get(i+1) - a.get(i) <0)
							i++;
						else {
							state = 1;
							System.out.println("down"+a.get(i+1) +" "+ a.get(i));
							count++;
							change = true;
							i++;
						}
					}
				}
			}
			if (change==true)
				count++;
			else if (a.size() >=2)
					if (a.get(0) == a.get(1))
						count++;
			System.out.println(count);
		}
	}
}