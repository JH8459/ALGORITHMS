import java.io.*;
import java.util.*;

public class Main {
  /*
   * 플로이드-워셜
   * Do it! 알고리즘 코딩 테스트 361.p
   */
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] distance = new int[n + 1][n + 1];

    int min = Integer.MAX_VALUE;
    int answer = -1;

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        if(i == j){
          distance[i][j] = 0;
        } else {
          distance[i][j] = 10000000;
        }
      }
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());

      distance[s][e] = 1;
      distance[e][s] = 1;
    }

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        for(int k = 1; k <= n; k++){
          if(distance[j][k] > distance[j][i] + distance[i][k]) {
            distance[j][k] = distance[j][i] + distance[i][k];
          }
        }
      }
    }

    for(int i = 1; i <= n; i++){
      int temp = 0;

      for(int j = 1; j <= n; j++){
        temp += distance[i][j];
      }

      if(min > temp){
        min = temp;
        answer = i;
      }
    }

    bw.write(answer + "\n");
    bw.flush();
    bw.close();
  }
}