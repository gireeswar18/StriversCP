import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int lucky = 0;

        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7')
                lucky++;
        }

        System.out.println((lucky == 4 || lucky == 7) ? "YES" : "NO");

        sc.close();
    }
}
