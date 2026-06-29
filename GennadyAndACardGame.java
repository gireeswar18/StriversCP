import java.util.Scanner;

public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String table = sc.next();

        String[] arr = new String[5];
        for (int i = 0; i < 5; i++)
            arr[i] = sc.next();

        for (String str : arr) {
            if (str.charAt(0) == table.charAt(0) || str.charAt(1) == table.charAt(1)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");

        sc.close();
    }    
}