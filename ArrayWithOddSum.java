import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int oddCount = 0;

            for (int num : arr) {
                if (num % 2 == 1) {
                    oddCount++;
                }
            }

            if (n % 2 == 1) {
                if (oddCount > 0) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                if (oddCount > 0 && oddCount != n) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
