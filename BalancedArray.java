
import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int half = n / 2;

            if (half % 2 == 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            int evenSum = 0;
            for (int i = 0, num = 2; i < half; i++, num += 2) {
                System.out.print(num + " ");
                evenSum += num;
            }

            for (int i = 0, num = 1; i < half - 1; i++, num += 2) {
                System.out.print(num + " ");
                evenSum -= num;
            }

            System.out.println(evenSum);
        }

        sc.close();
    }
}
