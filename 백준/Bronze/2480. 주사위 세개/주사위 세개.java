import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cube_a = sc.nextInt();
        int cube_b = sc.nextInt();
        int cube_c = sc.nextInt();

        int reward = 0;

        if (cube_a == cube_b && cube_a == cube_c) {
            reward = 10000 + cube_a * 1000;
        } else if (cube_a == cube_b) {
            reward = 1000 + cube_a * 100;
        } else if (cube_a == cube_c) {
            reward = 1000 + cube_a * 100;
        } else if (cube_b == cube_c) {
            reward = 1000 + cube_b * 100;
        } else {
            reward = Math.max(Math.max(cube_a, cube_b), cube_c) * 100;
        }

        System.out.println(reward);
    }
}