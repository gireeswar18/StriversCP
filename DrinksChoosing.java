import java.util.Scanner;

/**
 * DrinksChoosing
 */
public class DrinksChoosing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] freq = new int[k + 1];

        for (int i = 0; i < n; i++) {
            freq[sc.nextInt()]++;
        }

        int sets = (n + 1) / 2;
        int res = 0;

        for (int i = 1; i <= k; i++) {
            int pairs = freq[i] / 2;
            res += (pairs * 2);
            sets -= pairs;
        } 

        res += sets;

        System.out.println(res);

        sc.close();
    }
}