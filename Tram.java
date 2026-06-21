import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tramCapacity = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();

            tramCapacity = tramCapacity - out + in;
            maxCapacity = Math.max(maxCapacity, tramCapacity);
        }

        System.out.println(maxCapacity);
        
        sc.close();
    }
}