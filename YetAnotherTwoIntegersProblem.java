import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int needed = Math.abs(a - b);

            if (needed % 10 == 0) {
                System.out.println(needed / 10);
            }
            else {
                System.out.println(needed / 10 + 1);
            }
        }

        sc.close();
    }
}
