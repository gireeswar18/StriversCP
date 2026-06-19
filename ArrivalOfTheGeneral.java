import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minInd = -1, maxInd = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxInd = i;
            }
        }

        res += maxInd;
        
        // System.out.println("MAX");
        // System.out.println(max);
        // System.out.println(maxInd);
        // System.out.println("RES: " + res);

        for (int i = 0; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minInd = i;
            }
        }

        // System.out.println("MIN");
        // System.out.println(min);
        // System.out.println(minInd);

        if (min == max) {
            System.out.println(res);
        }
        else if (minInd < maxInd) {
            System.out.println(res + (n - minInd +- 1) - 1);
        }
        else {
            System.out.println(res + (n - minInd - 1));
        }

        sc.close();
    }
}
