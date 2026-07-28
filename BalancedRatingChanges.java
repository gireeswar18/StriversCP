import java.util.Scanner;

/**
 * BalancedRatingChanges
 */
public class BalancedRatingChanges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] / 2);
            }
            else {
                if (flag)
                    System.out.println((arr[i] + 1) / 2);
                else
                    System.out.println((arr[i] - 1) / 2);
                flag = !flag;
            }
        }

        sc.close();
    }
}