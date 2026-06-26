import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        int[] map = new int[4];

        for (char c : arr) {
            if (c != '+')
                map[c - '0']++;
        }

        int ind = 0;
        int num = 1;

        while (ind < arr.length) {
            while (map[num] != 0) {
                arr[ind] = (char) (num + '0');
                map[num]--;
                ind += 2;
            }
            num++;
        }

        System.out.println(new String(arr));

        sc.close();
    }
}
