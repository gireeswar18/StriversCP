
import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n % 10 == k) {
            System.out.println(1);
        }
        else {
            int cnt = 1;
            int val = n;

            while (n % 10 != 0 && n % 10 != k) {
                n += val;
                cnt++;
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}
