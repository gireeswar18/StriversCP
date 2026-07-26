import java.util.Arrays;
import java.util.Scanner;

/**
 * ShuffleHashing
 */
public class ShuffleHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            char[] og = sc.next().toCharArray();
            char[] hash = sc.next().toCharArray();
            int[] map = new int[26];

            int m = og.length;
            int n = hash.length;
            boolean found = false;

            for (char c : og) {
                map[c - 'a']++;
            }

            if (m > n) {
                System.out.println("NO");
                continue;
            }

            for (int i = 0; i < n - m + 1 && !found; i++) {
                int[] freq = new int[26];

                for (int j = i; j < i + m; j++) {
                    freq[hash[j] - 'a']++;
                }

                if (Arrays.equals(map, freq))
                    found = true;
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}