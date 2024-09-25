import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    float min = ((float) x / y) * 1000;

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0){
      st = new StringTokenizer(br.readLine());
      int xx = Integer.parseInt(st.nextToken());
      int yy = Integer.parseInt(st.nextToken());

      float price = ((float) xx / yy) * 1000;

      min = Math.min(min, price);
    }

    bw.write(String.format("%.2f", min) + "\n");
    bw.flush();
    bw.close();
  }
}