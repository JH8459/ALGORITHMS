import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    BigInteger a = new BigInteger(st.nextToken());
    BigInteger b = new BigInteger(st.nextToken());

    BigInteger result = a.add(b);

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}