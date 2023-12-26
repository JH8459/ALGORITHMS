import java.io.*;
import java.util.*;

public class Main {

  // 빙하 위치 정보를 담을 클래스 선언
  public static class IceInfo {

    int x, y;

    public IceInfo(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static int n, m;  // 세로 n && 가로 m
  public static int[] dx = {1, 0, -1, 0};
  public static int[] dy = {0, -1, 0, 1};
  public static int[][] map;
  static boolean[][] isVisited;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();
    n = Integer.parseInt(s.split(" ")[0]);
    m = Integer.parseInt(s.split(" ")[1]);

    map = new int[n][m];

    for (int i = 0; i < n; i++) {
      String line = br.readLine();

      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(line.split(" ")[j]);
      }
    }

    int year = 0; // 결과를 담을 년도 변수 선언

    while (true) {
      int bigIceCnt = getBigIceCnt(); // 빙하 덩어리를 세는 dfs 실시

      if (bigIceCnt >= 2) { // 2덩어리 이상이 된다면 반복문 탈출
        break;
      } else if (bigIceCnt == 0) {  // 빙하가 모두 녹아 덩어리가 없다면 year = 0
        year = 0;
        break;
      }

      bfs();  // 빙하를 녹이는 bfs 실시
      year++;
    }

    bw.write(year + "\n");
    bw.flush();
    bw.close();
  }

  public static int getBigIceCnt() {
    int bigIceCnt = 0;
    boolean[][] isChecked = new boolean[n][m];
    // 빙하 지도를 탐색하며 이어져 있는 빙하 단위로 dfs 실시
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (!isChecked[i][j] && map[i][j] > 0) {
          dfs(i, j, isChecked);
          bigIceCnt++;
        }
      }
    }

    return bigIceCnt;
  }

  public static void dfs(int nowX, int nowY, boolean[][] isChecked) {
    isChecked[nowX][nowY] = true;

    for (int i = 0; i < 4; i++) {
      int nextX = nowX + dx[i];
      int nextY = nowY + dy[i];
      // 4방향 유효성 검사
      if (nextX >= 0 && nextX < n && nowY >= 0 && nowY < m) {
        if (!isChecked[nextX][nextY] && map[nextX][nextY] > 0) {
          dfs(nextX, nextY, isChecked);
        }
      }
    }
  }

  public static void bfs() {
    Queue<IceInfo> queue = new LinkedList<IceInfo>();  // 다음 빙하 위치를 담을 연결 리스트
    isVisited = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] > 0) {
          queue.add(new IceInfo(i, j));
          isVisited[i][j] = true;
        }
      }
    }

    while (!queue.isEmpty()) {
      IceInfo now = queue.poll(); // 큐에 담긴 빙하 정보를 가져온다
      // 현재 빙하 기준 4방향 유효성 검사
      for (int i = 0; i < 4; i++) {
        int nextX = now.x + dx[i];
        int nextY = now.y + dy[i];

        if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {

          if (!isVisited[nextX][nextY]) {
            int nextValue = map[nextX][nextY];

            // 다음으로 이동할 곳이 바닷물(0)이라면 빙하값을 1깎는다
            if (nextValue == 0) {
              // 빙하가 녹을 수 있는 한도 내에서 수행한다
              if (map[now.x][now.y] > 0) {
                map[now.x][now.y] -= 1;
              }
            }
          }
        }
      }
    }
  }
}