
import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();

        int rows = m * (n / 2);
        int cols = 0;
        
        if (n % 2 == 1) {
            cols = m / 2;
        }

        System.out.println(rows + cols);

        sc.close();
    }
}

