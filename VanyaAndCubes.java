import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ht = 0;
        int needed = 1;

        while (n >= needed) {
            n -= needed;
            ht++;
            needed += ht + 1;
        }

        System.out.println(ht);

        sc.close();
    }
}
