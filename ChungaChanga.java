import java.util.Scanner;

public class ChungaChanga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        long total = (x + y) / z;

        long rem_x = x % z;
        long rem_y = y % z;

        long ex = 0;

        if (rem_x + rem_y >= z) {
            ex = Math.min(z - rem_x, z - rem_y);
        }

        System.out.println(total + " " + ex);

        sc.close();
    }
}
