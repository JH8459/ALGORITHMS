import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    BigInteger a = new BigInteger(st.nextToken());
    BigInteger b = new BigInteger(st.nextToken());

    bw.write(a.add(b) + "\n");
    bw.flush();
    bw.close();
  }
}