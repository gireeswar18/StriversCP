
import java.util.Scanner;

public class Emotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax) {
                smax = arr[i];
            }
        }

        long blockSize = k + 1;
        long blocks = m / blockSize;

        long maxBlock = (blocks * k) + (m % blockSize);
        long minBlock = blocks;

        System.out.println(maxBlock * max + minBlock * smax);

        sc.close();
    }
}
