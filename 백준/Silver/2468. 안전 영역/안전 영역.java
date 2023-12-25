import java.io.*;
import java.util.*;

public class Main {

  public static int n;  // 세로 X 가로 행렬 N
  public static int[] dx = {1, 0, -1, 0};
  public static int[] dy = {0, -1, 0, 1};
  public static int[][] map;
  public static boolean[][] isVisited;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    int maxHeight = Integer.MIN_VALUE;  // 수위 최고 높이를 계산 할 변수
    int result = 0; // 결과값

    map = new int[n][n];

    for (int i = 0; i < n; i++) {
      String s = br.readLine();

      for (int j = 0; j < n; j++) {
        map[i][j] = Integer.parseInt(s.split(" ")[j]);

        if (maxHeight < map[i][j]) {
          maxHeight = map[i][j];
        }
      }
    }
    // 수위마다 모든 지역 탐색
    for (int height = 0; height < maxHeight; height++) {
      isVisited = new boolean[n][n];  // 방문 기록 초기화
      int cnt = 0;

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          // 탐색한적 없으며 현재 수위 보다 높은 곳은 안전 영영 탐지 실행
          if (!isVisited[i][j] && map[i][j] > height) {
            cnt += dfs(i, j, height);
          }
        }
      }

      result = Math.max(result, cnt);
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static int dfs(int nowX, int nowY, int height) {
    isVisited[nowX][nowY] = true;
    // 4방향 이동 가능 여부 유효성 검사
    for (int i = 0; i < 4; i++) {
      int nextX = nowX + dx[i];
      int nextY = nowY + dy[i];
      // 맵 내부에서 이동한적 없으며 현재 수위 보다 높은 곳을 탐색한다
      if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
        if (!isVisited[nextX][nextY]) {
          if (map[nextX][nextY] > height) {
            dfs(nextX, nextY, height);
          }
        }
      }
    }

    return 1;
  }
}