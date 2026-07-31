import java.util.Scanner;

/**
 * LCMProblem
 */
public class LCMProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int st = sc.nextInt();
            int end = sc.nextInt();

            if (st * 2 <= end) {
                System.out.println(st + " " + st * 2);
            }
            else {
                System.out.println(-1 + " " + -1);
            }
        }

        sc.close();
    }
}