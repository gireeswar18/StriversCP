import java.util.Scanner;

public class CPlusEqual {

    private static int ops = 0;

    public static void f(int a, int b, int n) {
        if (b > n) {
            return;
        }

        a += b;
        ops++;
        f(b, a, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            ops = 0;
            f(Math.min(a, b), Math.max(a, b), n);
            System.out.println(ops);
        }

        sc.close();
    }
}