
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class F {

    public static int gen(int d, String m) {
        int day = 0;
        switch (m) {
            case "12":
                day += 30;
            case "11":
                day += 31;
            case "10":
                day += 30;
            case "09":
                day += 31;
            case "08":
                day += 31;
            case "07":
                day += 30;
            case "06":
                day += 31;
            case "05":
                day += 30;
            case "04":
                day += 31;
            case "03":
                day += 28;
            case "02":
                day += 31;
            case "01":
                day += d;
        }
        return day;
    }

    public static int[] re(int date) {
        if (date > 365) {
            date = date - 365;;
        }

        int ans = 12;
        int[] m = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 0; i < 12; i++) {
            if (date > m[i]) {
                ans += 1;
                date -= m[i];
            }
        }
        if (date == 0) {
            date++;
        }
        if (ans > 12) {
            return new int[]{date, ans % 12};
        } else {
            return new int[]{date, ans};
        }
    }

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("F");
        System.setIn(fis);

        InputStreamReader isr = new InputStreamReader(System.in);   
        BufferedReader input = new BufferedReader(isr);

        StringBuilder out = new StringBuilder();
        int[] dates = new int[10000];
        dates[0] = dates[1] = 0;
        for (int i = 2; i < 10000; i++) {
            if (i % 7 != 0 && i % 7 != 1) {
                dates[i] = 1;
            } else {
                dates[i] = 0;
            }
        }

        String line = input.readLine();
        int h = Integer.parseInt(line);
        for (int i = 0; i < h; i++) {
            int day = 0;
            line = input.readLine();
            String[] st = line.split("/");
            day = gen(Integer.parseInt(st[0]), st[1]);
            for (int j = day; j < 10000; j += 365) {
                dates[day] = 0;
            }
        }
        line = input.readLine();
        int no = Integer.parseInt(line);
        for (int count = 0; count < no; count++) {
            line = input.readLine();

            String[] st = line.split(" ");

            int index = gen(Integer.parseInt(st[0].substring(0, 2)), st[0].substring(3));
            int n = Integer.parseInt(st[1]);
            while (true) {
                if (dates[index] == 1) {
                    n--;
                }
                index++;
                if (n <= 0) {
                    break;
                }
            }
            while (dates[index] == 0) {
                index++;
            }
            int[] ans = re(index);
            if (ans[0] < 10) {
                out.append("0" + ans[0] + "/");
            } else {
                out.append(ans[0] + "/");
            }
            if (ans[1] < 10) {
                out.append("0" + ans[1] + "\n");
            } else {
                out.append(ans[1] + "\n");
            }

        }
        System.out.print(out);
    }

}
