import java.util.Scanner;

public class NewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int tox1 = Math.abs(x1 - x2) + Math.abs(x1 - x3);
        int tox2 = Math.abs(x2 - x1) + Math.abs(x2 - x3);
        int tox3 = Math.abs(x3 - x1) + Math.abs(x3 - x2);

        System.out.println(Math.min(tox1, Math.min(tox2, tox3)));

        sc.close();
    }
}
