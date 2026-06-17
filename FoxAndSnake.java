import java.util.Scanner;

public class FoxAndSnake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean left = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print('#');
                }
                else if ((left && j == 0) || (!left && j == n - 1)) {
                    System.out.print('#');
                }
                else {
                    System.out.print('.');
                }
            }
            if (i % 2 == 1)
                left = !left;
            System.out.println();
        }

        sc.close();
    }
}