import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      int n = Integer.parseInt(br.readLine());

      if (n == 0) {
        break;
      }

      boolean isPalindrome = isPalindrome(n);

      if (isPalindrome) {
        bw.write("yes\n");
      } else {
        bw.write("no\n");
      }

    }

    bw.flush();
    bw.close();
  }

  public static boolean isPalindrome(int n) {
    int origin = n;
    int reverse = 0;

    while (n != 0) {
      int temp = n % 10;
      reverse = reverse * 10 + temp;

      n /= 10;
    }

    return origin == reverse;
  }
}