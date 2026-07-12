import java.util.Scanner;

/**
 * NewYearTransportation
 */
public class NewYearTransportation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dest = sc.nextInt();

        int[] arr = new int[n - 1];

        for (int i = 0; i < n - 1; i++)
            arr[i] = sc.nextInt();

        int ind = 0;

        while (ind < n - 1) {
            if (ind + 1 == dest) {
                break;
            }
            ind += arr[ind];
        }

        if (ind + 1 == dest)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}