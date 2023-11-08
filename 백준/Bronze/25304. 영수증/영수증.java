import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double totalPrice = sc.nextInt();
        int totalCount = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= totalCount; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            sum += price * count;
        }

        if (totalPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}