import java.util.Scanner;

public class LuckySumOfDIgits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int four = 0, seven = 0;

        while (n > 0) {
            if (n % 7 == 0) {
                seven += (n / 7);
                n = 0;
                break;
            }

            four++;
            n -= 4;
        }

        if (n != 0) {
            System.out.println(-1);
        }
        else {
            for (int i = 0; i < four; i++) {
                System.out.print(4);
            }
            for (int i = 0; i < seven; i++) {
                System.out.print(7);
            }
            System.out.println();
        }

        sc.close();
    }
}
