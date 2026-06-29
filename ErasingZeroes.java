import java.util.Scanner;

/**
 * ErasingZeroes
 */
public class ErasingZeroes {

    public static int f(char[] arr) {
        int res = 0;
        int prev = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                if (prev != -1) {
                    res += i - prev - 1; 
                }
                prev = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            char[] arr = sc.next().toCharArray();

            System.out.println(f(arr));
        }

        sc.close();
    }
}