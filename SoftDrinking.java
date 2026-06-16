import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        int nl = sc.nextInt(); // needed for one (drink)
        int np = sc.nextInt(); // needed for one (salt)

        int drinkToast = (k * l) / nl;
        int limeToast = c * d;
        int saltToast = p / np;
        
        int total = Math.min(drinkToast, Math.min(limeToast, saltToast));
        System.out.println(total / n);

        sc.close();
    }
}
