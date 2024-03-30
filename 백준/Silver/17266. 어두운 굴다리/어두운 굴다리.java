import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int max = Integer.MIN_VALUE;
    int temp = 0;

    for(int i = 0; i < m; i++) {
      int x = Integer.parseInt(st.nextToken());

      if(m == 1){
        max = Math.max(n - x, x);
        break;
      }

      if(i == 0){
        max = Math.max(x, max);
        temp = x;
        continue;
      }

      int gap = x - temp;
      temp = x;
      max= Math.max(gap / 2 + gap % 2, max);

      if (i == m-1){
        max= Math.max(n - x, max);
      }
    }

    bw.write(max + "\n");
    bw.flush();
    bw.close();
  }
}