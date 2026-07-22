import java.util.Scanner;

/**
 * PalindromicTwist
 */
public class PalindromicTwist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();

            int l = 0, r = n - 1;

            while (l < r) {
                if (arr[l] != arr[r]) {
                    if (arr[l] < arr[r] && arr[l] + 1 != arr[r] - 1) {
                        break;
                    }
                    if (arr[l] > arr[r] && arr[l] - 1 != arr[r] + 1) {
                        break;
                    }
                }
                l++;
                r--;
            }
            
            if (l > r) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}