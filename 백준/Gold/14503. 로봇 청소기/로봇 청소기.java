import java.io.*;

public class Main {

  public static int n, m, result;
  public static int[] dr = {-1, 0, 1, 0}; // 북동남서
  public static int[] dc = {0, 1, 0, -1};

  public static int[][] map;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s1 = br.readLine();
    n = Integer.parseInt(s1.split(" ")[0]);
    m = Integer.parseInt(s1.split(" ")[1]);

    map = new int[n][m];

    String s2 = br.readLine();
    int r = Integer.parseInt(s2.split(" ")[0]);
    int c = Integer.parseInt(s2.split(" ")[1]);
    int d = Integer.parseInt(s2.split(" ")[2]);

    result = 0; // 로봇 청소기가 청소한 횟수를 저장할 변수

    for (int i = 0; i < n; i++) {
      String s3 = br.readLine();

      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(s3.split(" ")[j]);
      }
    }

    dfs(r, c, d);

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static void dfs(int row, int col, int direction) {
    if (map[row][col] == 0) {
      map[row][col] = -1; // 현재 위치 청소 체크
      result++;
    }

    boolean flag = false;
    int originDirection = direction;
    // 4방향 청소 가능 여부 탐색
    for (int i = 0; i < 4; i++) {
      int nextD = (direction + 3) % 4;  // 북(0), 동(1), 남(2), 서(3) 반시계 방향 연산
      int nextR = row + dr[nextD];
      int nextC = col + dc[nextD];
      // 이동 가능한 범위 체크
      if (nextR > 0 && nextC >= 0 && nextR < n && nextC < m) {
        if (map[nextR][nextC] == 0) { // 아직 청소하지 않은 공간인 경우 재귀 호출
          dfs(nextR, nextC, nextD);
          flag = true;

          break;
        }
      }

      direction = (direction + 3) % 4;  // 방향 변경
    }

    if (!flag) {
      // 4방향 모두 청소가 되어있거나, 벽을 만나는 경우
      int nextD = (originDirection + 2) % 4;  // 후진을 위한 방향 처리
      int nextR = row + dr[nextD];
      int nextC = col + dc[nextD];
      // 이동 가능한 범위 체크
      if (nextR > 0 && nextC > 0 && nextR < n && nextC < m) {
        if (map[nextR][nextC] != 1) { // 벽이 없는 경우
          dfs(nextR, nextC, originDirection);  // 방향 유지 한채로 후진
        }
      }

    }
  }
}