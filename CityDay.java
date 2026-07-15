import java.util.Scanner;

/**
 * CityDay
 */
public class CityDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean before = true, after = true;

            for (int st = i - x; st < i && st >= 0; st++) {
                if (arr[st] < arr[i]) {
                    before = false;
                    break;
                }
            }

            if (before) {
                for (int st = i + 1; st <= i + y && st < n; st++) {
                    if (arr[st] < arr[i]) {
                        after = false;
                        break;
                    }
                }
            }

            if (before && after) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}