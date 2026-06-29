import java.util.Scanner;

public class BoringApartments {

    public static int f(String str) {

        int res = 0;

        res = 10 * (str.charAt(0) - '0' - 1);

        int n = str.length();

        res += (n * (n + 1)) / 2;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            String floor = sc.next();
            System.out.println(f(floor));
        }

        sc.close();
    }
}
