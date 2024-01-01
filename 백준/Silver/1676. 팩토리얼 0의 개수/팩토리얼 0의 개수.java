import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    BigInteger factorial = new BigInteger("1"); // 최대 500!을 저장할 BigInt 자료형

    while (n > 1) {
      factorial = factorial.multiply(BigInteger.valueOf(n));

      n--;
    }

    String sFactorial = String.valueOf(factorial);

    int result = 0;

    for (int i = sFactorial.length(); i > 0; i--) {
      if (!Objects.equals(sFactorial.substring(i - 1, i), "0")) {
        break;
      } else {
        result++;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}