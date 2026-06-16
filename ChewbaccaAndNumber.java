import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] == '9')
                continue;
            
            if (arr[i] - '0' >= 5) {
                arr[i] = (char) ('9' - arr[i] + '0');
            }
        }

        System.out.println(new String(arr));

        sc.close();
    }
}
