import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = -1;

        for (int i = n; i >= (n + 1) / 2; i--) {
            if (i % m == 0) {
                res = i;
            }
        }

        System.out.println(res);

        sc.close();
    }
}
