import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {

    public static List<Integer> f(int num) {
        List<Integer> res = new ArrayList<>();

        int fact = 1;

        while (num != 0) {
            if (num % 10 != 0) {
                res.add((num % 10) * fact);
            }
            fact = fact * 10;
            num = num / 10;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            List<Integer> res = f(num);

            System.out.println(res.size());

            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
