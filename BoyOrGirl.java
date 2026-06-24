import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        if (set.size() % 2 == 1) 
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");

        sc.close();
    }
}
