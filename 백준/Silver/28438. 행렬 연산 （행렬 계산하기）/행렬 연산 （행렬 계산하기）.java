import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());

    int[] row = new int[n];
    int[] col = new int[m];

    while (q-- > 0){
      st = new StringTokenizer(br.readLine());
      int method = Integer.parseInt(st.nextToken());

      if(method == 1){
        int r = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        row[r - 1] += v;
      } else {
        int c = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        col[c - 1] += v;
      }
    }
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        bw.write(row[i] + col[j] + " ");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}