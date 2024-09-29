import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());

    bw.write((a + b) * (a - b) + "\n");
    bw.flush();
    bw.close();
  }
}