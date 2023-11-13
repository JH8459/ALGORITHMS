import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = Integer.MIN_VALUE; // Integer Type 최소값
        int min = Integer.MAX_VALUE; // Integer Type 최대값

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            if (number > max)
                max = number;
            if (number < min)
                min = number;
        }

        System.out.println(min + " " + max);
    }
}