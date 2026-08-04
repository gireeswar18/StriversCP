import java.util.Scanner;

/**
 * FloorNumber
 */
public class FloorNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int apnum = sc.nextInt();
            int aps = sc.nextInt();

            if (apnum <= 2) {
                System.out.println(1);
            }
            else {
                apnum -= 2;
                System.out.println(((apnum % aps == 0) ? apnum / aps : (apnum / aps) + 1) + 1);
            }
        }

        sc.close();
    }
}