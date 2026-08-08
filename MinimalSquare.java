import java.util.Scanner;

/**
 * MinimalSquare
 */
public class MinimalSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int l = Math.max(x, y);
            int b = Math.min(x, y);

            int side = Math.max(l, b * 2);

            System.out.println(side * side);
        }

        sc.close();
    }
}