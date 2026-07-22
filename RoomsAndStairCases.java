import java.util.Scanner;

/**
 * RoomsAndStairCases
 */
public class RoomsAndStairCases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            int res = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == '1') {
                    res = Math.max(res, 2 * Math.max((n - i), i + 1));
                }
            }

            if (res == 0)
                res = n;

            System.out.println(res);
        }

        sc.close();
    }
}