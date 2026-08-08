import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            if (k % x == y) {
                System.out.println(k);
            }
            else {
                int res = k - (k % x);

                if (res + y <= k) {
                    System.out.println(res + y);
                }
                else {
                    System.out.println(res - x + y);
                }
            }
        }

        sc.close();
    }
}
