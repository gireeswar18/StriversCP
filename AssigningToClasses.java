import java.util.Arrays;
import java.util.Scanner;

public class AssigningToClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n * 2];

            for (int i = 0; i < n * 2; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[n] - arr[n - 1]);
        }

        sc.close();
    }
}
