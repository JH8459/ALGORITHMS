import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum[] = new int[n]; // 길이가 n인 int 배열 선언

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum[i] = a + b;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sum[i]);
        }
    }
}