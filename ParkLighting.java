
import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int res = 0;

            if (r * c == 1) {
                System.out.println(1);
                continue;
            }

            // for rows
            res = r * (c / 2);

            // for cols
            if (c % 2 == 1) {
                res += (r / 2);
                
                // odd rows
                if (r % 2 == 1)
                    res++;
            }

            System.out.println(res);
        }

        sc.close();
    }
}
