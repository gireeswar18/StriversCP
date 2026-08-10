
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int oddmis = 0, evenmis = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 & arr[i] % 2 != 0) {
                    evenmis++;
                }
                else if (i % 2 == 1 && arr[i] % 2 != 1) {
                    oddmis++;
                }
            }

            if (evenmis == oddmis) {
                System.out.println(evenmis);
            }
            else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
