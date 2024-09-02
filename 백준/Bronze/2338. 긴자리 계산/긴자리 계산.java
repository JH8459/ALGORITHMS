import java.io.*;
import java.math.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BigInteger a = new BigInteger(br.readLine());
    BigInteger b = new BigInteger(br.readLine());

    bw.write(a.add(b) + "\n");
    bw.write(a.subtract(b) + "\n");
    bw.write(a.multiply(b) + "\n");

    bw.flush();
    bw.close();
  }
}