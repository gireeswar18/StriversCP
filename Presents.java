import java.util.Arrays;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            res[arr[i] - 1] = i + 1;
        }

        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}

/* 

2 3 4 1
1 - 2
2 - 3
3 - 4
4 - 1

4 1 2 3

1 3 2
1 - 1
2 - 3
3 - 2

1 3 2

*/