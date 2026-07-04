
import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m % n != 0) {
            System.out.println(-1);
        }
        else {
            int cnt = 0;
            int rem = m / n;

            while (rem % 2 == 0) {
                cnt++;
                rem /= 2;
            }

            while (rem % 3 == 0) {
                cnt++;
                rem /= 3;
            }

            if (rem == 1) {
                System.out.println(cnt);
            }
            else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}