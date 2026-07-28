import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * AmrAndMusic
 */
public class AmrAndMusic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int cnt = 0;
        List<Integer> res = new ArrayList<>();

        for (int[] ins : arr) {
            if (ins[0] > k)
                break;

            k -= ins[0];
            cnt++;
            res.add(ins[1] + 1);
        }

        System.out.println(cnt);

        if (cnt == 0) {
            sc.close();
            return;
        }

        for (int val : res) {
            System.out.print(val + " ");
        }

        System.out.println();

        sc.close();
    }
}