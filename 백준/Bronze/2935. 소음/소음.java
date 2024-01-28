import java.io.*;
import java.math.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    BigInteger a = new BigInteger(br.readLine());
    String operator = br.readLine();
    BigInteger b = new BigInteger(br.readLine());

    switch (operator){
      case "*":
        bw.write(String.valueOf(a.multiply(b)) + "\n");
        break;
      case "+":
        bw.write(String.valueOf(a.add(b)) + "\n");
        break;
      default:
        break;
    }

    bw.flush();
    bw.close();
  }
}