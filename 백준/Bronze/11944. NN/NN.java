import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      sb.append(n);
    }

    if(sb.length() > m) {
      bw.write(sb.substring(0, m) + "\n");
    } else {
      bw.write(sb + "\n");
    }

    bw.flush();
    bw.close();
  }
}