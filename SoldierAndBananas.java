import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initCost = sc.nextInt();
        int curr = sc.nextInt();
        int bananas = sc.nextInt();

        int cost = initCost;
        int borrow = 0;

        while (bananas-- != 0) {
            
            if (cost > curr) {
                borrow += (cost - curr);
                curr = 0;
            }
            else {
                curr -= cost;
            }

            cost += initCost;
        }

        System.out.println(borrow);

        sc.close();
    }
}
