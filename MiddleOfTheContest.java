import java.util.Scanner;

/**
 * MiddleOfTheContest
 */
public class MiddleOfTheContest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        String end = sc.next();

        int sthr = Integer.parseInt(st.substring(0, 2));
        int endhr = Integer.parseInt(end.substring(0, 2));

        int hr = 0, mins = 0;
        hr = (sthr + endhr) / 2;

        if ((sthr + endhr) % 2 != 0) {
            mins = 30;
        }

        int stmin = Integer.parseInt(st.substring(3));
        int endmin = Integer.parseInt(end.substring(3));

        mins += (stmin + endmin) / 2;
        if (mins >= 60) {
            hr++;
            mins %= 60;
        }
        
        System.out.print(hr < 10 ? "0" + hr : hr);
        System.out.print(":");
        System.out.println(mins < 10 ? "0" + mins : mins);

        sc.close();
    }
}