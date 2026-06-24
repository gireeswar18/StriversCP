import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();

        if (arr[0] >= 'a' && arr[0] <= 'z')
            arr[0] = (char) (arr[0] - 32);

        System.out.println(new String(arr));

        sc.close();
    }
}