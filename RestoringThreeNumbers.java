
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[4];
        int max = 0;

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < 4; i++) {
            if (arr[i] == max) {
                continue;
            }

            System.out.print(max - arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
