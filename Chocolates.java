import java.util.Scanner;

/**
  * Chocolates
  */
 public class Chocolates {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        long res = 0;
        long currMax = arr[n - 1] + 1;

        for (int i = n - 1; i >= 0 && currMax > 1; i--) {
            if (arr[i] < currMax) {
                res += arr[i];
                currMax = arr[i];
            }
            else {
                res += currMax - 1;
                currMax--;
            }
        }

        System.out.println(res);
        
        sc.close();
    }
 }