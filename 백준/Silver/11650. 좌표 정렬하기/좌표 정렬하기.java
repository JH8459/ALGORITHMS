import java.io.*;
import java.util.*;

public class Main {
  public static class pointXY {
    int x;
    int y;
    public pointXY (int x, int y){
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    pointXY[] nArr = new pointXY[n];

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      nArr[i] = new pointXY(x, y);
    }

    Arrays.sort(nArr, (n1, n2) -> {
      if(n1.x == n2.x){
        return Integer.compare(n1.y, n2.y);
      } else {
        return Integer.compare(n1.x, n2.x);
      }
    });

    for(int i = 0; i < n; i++){
      bw.write(nArr[i].x + " " + nArr[i].y + "\n");
    }

    bw.flush();
    bw.close();
  }
}