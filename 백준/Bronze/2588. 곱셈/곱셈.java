import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int	b = sc.nextInt();
        
        int b_a = b / 100;
        int b_b = (b % 100) / 10;
        int b_c = b % 10;
        
		System.out.println(a * b_c);
		System.out.println(a * b_b);
		System.out.println(a * b_a);
		System.out.println(a * b);
	}
}