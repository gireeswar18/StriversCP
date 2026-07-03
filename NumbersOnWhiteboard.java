
import java.util.Scanner;

public class NumbersOnWhiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            System.out.println(2);
            int left = n - 1, right = n;

            while (left > 0) {
                System.out.println(right + " " + left);
                right = (left + right + 1) / 2;
                left--;
            }
            
        }

        sc.close();
    }
}