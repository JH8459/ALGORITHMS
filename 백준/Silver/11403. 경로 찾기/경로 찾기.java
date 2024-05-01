import java.io.*;
import java.util.StringTokenizer;

public class Main {
  /*
   * 플로이드-워셜
   * Do it! 알고리즘 코딩 테스트 358.p
   */
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] distance = new int[n][n];

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int j = 0; j < n; j++){
        distance[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        for(int k = 0; k < n; k++){
          if(distance[j][i] == 1 && distance[i][k] == 1) {
            distance[j][k] = 1;
          }
        }
      }
    }

    for(int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        bw.write(distance[i][j] + " ");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}