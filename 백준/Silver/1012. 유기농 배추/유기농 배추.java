import java.io.*;
import java.util.*;

public class Main {

  public static int n, m, k;
  public static int bugNum;  // 배추흰지렁이 갯수를 저장할 변수
  public static int[] dr = {-1, 0, 1, 0}; // 북동남서
  public static int[] dc = {0, 1, 0, -1};

  public static int[][] map;
  public static boolean[][] isVisited;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      m = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken()); // 배추의 개수

      bugNum = 0;

      map = new int[m][n];
      isVisited = new boolean[m][n];

      for (int j = 0; j < k; j++) {
        st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        map[row][col] = 1;
      }

      for (int a = 0; a < m; a++) {
        for (int b = 0; b < n; b++) {
          if (map[a][b] == 1 && !isVisited[a][b]) {
            bugNum++;

            dfs(a, b);
          }
        }
      }

      bw.write(bugNum + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static void dfs(int row, int col) {
    isVisited[row][col] = true;

    // 4방향 인접 색칠 영역 탐색
    for (int i = 0; i < 4; i++) {
      int nextR = row + dr[i];
      int nextC = col + dc[i];
      // 이동 가능한 범위 체크
      if (nextR >= 0 && nextC >= 0 && nextR < m && nextC < n) {
        if (map[nextR][nextC] == 1 && !isVisited[nextR][nextC]) {
          dfs(nextR, nextC);
        }
      }
    }
  }
}