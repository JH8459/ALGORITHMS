import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int l = Integer.parseInt(st.nextToken());
    int r = 31;
    int m = 1234567891;

    long hash = 0;
    long pow = 1;
    String s = br.readLine();

    for(int i = 0; i < l; i++){
      hash += (s.charAt(i) - 96) * pow;
      pow = (pow * r) % m;
    }

    bw.write(hash % m + "\n");
    bw.flush();
    bw.close();
  }
}