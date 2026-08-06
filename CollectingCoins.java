import java.util.Scanner;

public class CollectingCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int n = sc.nextInt();

            int max = Math.max(a, Math.max(b, c));

            n -= (max - a);
            n -= (max - b);
            n -= (max - c);

            if (n < 0 || n % 3 != 0) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}