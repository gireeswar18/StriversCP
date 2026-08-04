import java.util.Scanner;

/**
 * ThreePairwiseMaximums
 */
public class ThreePairwiseMaximums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int[] arr = new int[3];

            for (int i = 0; i < 3; i++)
                arr[i] = sc.nextInt();

            int max = -1, smax = -1;
            int maxCnt = 0;

            for (int num : arr) {
                if (num > max) {
                    smax = max;
                    max = num;
                } else if (num != max && num > smax) {
                    smax = num;
                }
            }

            if (arr[0] == max)
                maxCnt++;
            if (arr[1] == max)
                maxCnt++;
            if (arr[2] == max)
                maxCnt++;

            if (maxCnt == 1) {
                System.out.println("NO");
                continue;
            }

            int sec = (smax < 0 ? max : smax);
            int third = (smax - 1 <= 0 ? smax : smax - 1);

            System.out.println("YES");
            System.out.println(max + " " + sec + " " + (third == -1 ? max : third));
        }

        sc.close();
    }
}