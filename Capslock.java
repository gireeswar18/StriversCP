import java.util.Scanner;

/**
 * Capslock
 */
public class Capslock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        int n = arr.length;

        // first small
        boolean first = arr[0] >= 'a' && arr[0] <= 'z';
        int up = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z')
                up++;
        }

        if (first && up == n - 1 || up == n) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'A' && arr[i] <= 'Z')
                    arr[i] += 32;
                else
                    arr[i] -= 32;
            }
        }

        System.out.println(new String(arr));

        sc.close();
    }
}
