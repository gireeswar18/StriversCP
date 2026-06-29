import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        StringBuilder res = new StringBuilder();
        int move = 1;

        for (int i = 0; i < n; i += move) {
            res.append(str.charAt(i));
            move += 1;
        }

        System.out.println(res);
        
        sc.close();
    }
}
