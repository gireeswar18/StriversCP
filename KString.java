
import java.util.Scanner;

public class KString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int[] freq = new int[26];
        StringBuilder res = new StringBuilder();

        for (char c : arr) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0)
                continue;

            if (freq[i] % k != 0) {
                System.out.println(-1);
                return;
            }

            for (int j = 0; j < freq[i] / k; j++)
                res.append((char) (i + 'a'));   
        }

        for (int i = 0; i < k; i++) {
            System.out.print(res);
        }
        System.out.println();

        sc.close();
    }
}