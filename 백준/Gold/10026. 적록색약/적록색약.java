import java.io.*;

public class Main {

  public static int n;
  public static int[] dx = {-1, 0, 1, 0};
  public static int[] dy = {0, 1, 0, -1};
  public static char[][] map;
  public static boolean[][] isVisited;
  public static int areaNum;
  public static int blindAreaNum;


  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    map = new char[n][n]; // 문자 맵

    areaNum = 0;  // 구역 갯수
    blindAreaNum = 0; // 적록색약 구역 갯수

    for (int i = 0; i < n; i++) {
      String s = br.readLine();

      for (int j = 0; j < n; j++) {
        map[i][j] = s.charAt(j);
      }
    }
    // 일반인 구역 수 탐색
    isVisited = new boolean[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        dfs(i, j);
      }
    }
    // 적록색약 구역 수 탐색
    isVisited = new boolean[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        blindDfs(i, j);
      }
    }

    bw.write(areaNum + " " + blindAreaNum + "\n");
    bw.flush();
    bw.close();
  }

  public static void dfs(int x, int y) {
    char nowColor = map[x][y];

    if (!isVisited[x][y]) {
      areaNum++;
    }

    isVisited[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int nextX = x + dx[i];
      int nextY = y + dy[i];

      if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
        if (!isVisited[nextX][nextY]) {
          char nextColor = map[nextX][nextY];

          if (nowColor == nextColor) {
            isVisited[nextX][nextY] = true;
            dfs(nextX, nextY);
          }
        }
      }
    }
  }

  public static void blindDfs(int x, int y) {
    char nowColor = map[x][y];

    if (!isVisited[x][y]) {
      blindAreaNum++;
    }

    isVisited[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int nextX = x + dx[i];
      int nextY = y + dy[i];

      if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
        if (!isVisited[nextX][nextY]) {
          char nextColor = map[nextX][nextY];
          // 적록색약 조건 추가
          if (nowColor == nextColor || nowColor == 'G' && nextColor == 'R' || nowColor == 'R' && nextColor == 'G') {
            isVisited[nextX][nextY] = true;
            blindDfs(nextX, nextY);
          }
        }
      }
    }
  }
}