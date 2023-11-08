import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minutes = sc.nextInt();
        
        if(minutes >= 45){
            minutes -= 45;
        } else {
            if(hour == 0){
                hour = 23;
            } else {
                hour -= 1;                
            }
            minutes += 15;
        }
        
		System.out.printf("%d %d", hour, minutes);
	}
}