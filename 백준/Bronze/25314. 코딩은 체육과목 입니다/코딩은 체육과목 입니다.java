import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n / 4; i++) {
            System.out.printf("long ");
        }

        System.out.printf("int");
    }
}