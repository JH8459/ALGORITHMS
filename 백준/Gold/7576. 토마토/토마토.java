import java.io.*;
import java.util.*;

public class Main {

  public static class TomatoXY {

    int x, y;

    public TomatoXY(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static int n, m;
  public static int[] dx = {-1, 0, 1, 0};
  public static int[] dy = {0, 1, 0, -1};
  public static Queue<TomatoXY> queue;
  public static int[][] map;
  public static boolean[][] isVisited;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    m = Integer.parseInt(st.nextToken()); // 가로
    n = Integer.parseInt(st.nextToken()); // 세로

    queue = new LinkedList<TomatoXY>();

    map = new int[n][m];
    isVisited = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());

        if (map[i][j] == 1) {
          queue.add(new TomatoXY(i, j));
        }
      }
    }

    bfs();

    int day = Integer.MIN_VALUE;
    boolean isSuccess = true; // 토마토가 모두 익었는지 판별하는 변수

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] == 0) {
          isSuccess = false;
          break;
        } else {
          day = Math.max(day, map[i][j]);
        }
      }
    }

    if (isSuccess) {
      bw.write(day - 1 + "\n");
    } else {
      bw.write("-1\n");
    }

    bw.flush();
    bw.close();
  }

  public static void bfs() {
    while (!queue.isEmpty()) {
      TomatoXY now = queue.poll();

      isVisited[now.x][now.y] = true;
      // 4방향 인접 영역 탐색
      for (int i = 0; i < 4; i++) {
        int nextX = now.x + dx[i];
        int nextY = now.y + dy[i];
        // 이동 가능한 범위 체크
        if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
          if (map[nextX][nextY] == 0 && !isVisited[nextX][nextY]) {
            map[nextX][nextY] = map[now.x][now.y] + 1;  // 전염된 토마토 칸에는 이전 토마토 값 + 1을 저장한다
            isVisited[nextX][nextY] = true;

            queue.add(new TomatoXY(nextX, nextY));
          }
        }
      }
    }
  }
}