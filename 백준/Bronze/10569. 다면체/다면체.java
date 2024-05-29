import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int v = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());

      int result = 2 - (v - e);

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}