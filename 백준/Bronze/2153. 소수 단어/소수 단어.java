import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int n = 0;

    for(int i = 0; i < s.length(); i ++){
      char ch = s.charAt(i);

      if(Character.hashCode(ch) >= 97) {
        n += Character.hashCode(ch) - 97 + 1;
      } else {
        n += Character.hashCode(ch) - 65 + 27;
      }
    }

    bw.write(isPrime(n) ? "It is a prime word.\n" : "It is not a prime word.\n");
    bw.flush();
    bw.close();
  }

  public static boolean isPrime (int n) {
    for (int i = 2; i <= (int)Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}