import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = -1, c = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (sc.nextInt() == 1) {
                    r = i;
                    c = j;
                }
            }
        }

        System.out.println(Math.abs(2 - r) + Math.abs(2 - c));

        sc.close();
    }
}
