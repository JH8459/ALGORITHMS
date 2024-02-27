import java.io.*;
import java.util.*;

public class Main {
  /*
   * 플로이드-워셜
   * Do it! 알고리즘 코딩 테스트 354.p
   */
  public static int n, m;
  public static int[][] distance;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    m = Integer.parseInt(br.readLine());
    distance = new int[n + 1][n + 1];

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        if(i == j){
          distance[i][j] = 0;
        } else {
          distance[i][j] = 10000001;
        }
      }
    }

    for(int i = 0; i < m; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      if(distance[s][e] > v){
        distance[s][e] = v;
      }
    }

    for(int k = 1; k <= n; k++){
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
          if(distance[i][j] > distance[i][k] + distance[k][j]){
            distance[i][j] = distance[i][k] + distance[k][j];
          }
        }
      }
    }

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        if(distance[i][j] == 10000001){
          bw.write("0 ");
        } else {
          bw.write(distance[i][j] + " ");
        }
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}