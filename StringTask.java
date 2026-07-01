import java.util.Scanner;

/**
 * StringTask
 */
public class StringTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        StringBuilder res = new StringBuilder();

        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y'
            )
            continue;

            res.append('.');
            if (c >= 'A' && c <= 'Z')
                res.append((char) (c + 32));
            else
                res.append(c);
        }

        System.out.println(res);

        sc.close();
    }
}