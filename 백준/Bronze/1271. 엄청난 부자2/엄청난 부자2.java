import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    //  BigInteger 자료형으로 출력
    String s = br.readLine();
    BigInteger total = new BigInteger(s.split(" ")[0]);  // 총 돈의 양
    BigInteger price = new BigInteger(s.split(" ")[1]);  // 한 생명체에게 들어가는 돈의 양

    bw.write(total.divide(price) + "\n" + total.remainder(price) + "\n");
    bw.flush();
    bw.close();
  }
}