import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int interval = sc.nextInt();

        if (minutes + interval >= 60) {
            hour += (minutes + interval) / 60;
            minutes = (minutes + interval) % 60;
        } else {
            minutes += interval;
        }

        if (hour >= 24) {
            hour -= 24;
        }

        System.out.printf("%d %d", hour, minutes);
    }
}