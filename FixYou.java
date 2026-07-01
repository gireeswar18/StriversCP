import java.util.Scanner;

/**
 * FixYou
 */
public class FixYou {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            String[] arr = new String[m];

            for (int i = 0; i < m; i++) {
                arr[i] = sc.next();
            }

            int res = 0;

            for (int i = 0; i < m; i++) {
                if (arr[i].charAt(n - 1) == 'R')
                    res++;
            }

            for (int i = 0; i < n; i++) {
                if (arr[m - 1].charAt(i) == 'D')
                    res++;
            } 

            System.out.println(res);
        }

        sc.close();
    }
}