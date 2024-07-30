import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine(), "-");

      String alphabet = st.nextToken();
      int num1 = 0;
      int num2 = Integer.parseInt(st.nextToken());

      for(int i = 0; i < alphabet.length(); i++){
        num1 += (int) ((alphabet.charAt(i) - 65) * Math.pow(26, alphabet.length() - i - 1));
      }

      bw.write(Math.abs(num1 - num2) <= 100 ? "nice\n" : "not nice\n");
    }

    bw.flush();
    bw.close();
  }
}