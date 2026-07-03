import java.util.Scanner;

public class PetrAndBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        n = n % sum;
        if (n == 0) {
            n = sum;
        }

        for (int i = 0; i < 7; i++) {
            n -= arr[i];
            if (n <= 0) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}