import java.io.*;
import java.util.*;

public class Main {

  // 상하좌우 탐색하기 위한 변수 선언
  public static int[] dx = {0, 1, 0, -1};
  public static int[] dy = {1, 0, -1, 0};
  public static boolean[][] isVisited;  // 방문 기록 2차원 배열
  public static int[][] board;  // 미로 데이터를 저장할 2차원 배열
  public static int n, m;

  public static void main(String args[]) throws IOException {
    /*
     * 탐색 - 너비 우선 탐색 => O(v + e)  // v는 노드 수, e는 엣지 수
     * Do to! 코딩 테스트 169.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken()); // 세로 길이 n (2~100)
    m = Integer.parseInt(st.nextToken()); // 가로 길이 m (2~100)

    board = new int[n][m];
    isVisited = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      String line = st.nextToken();

      for (int j = 0; j < m; j++) {
        board[i][j] = Integer.parseInt(line.substring(j, j + 1));
      }
    }
    // 너비 우선 탐색 실행
    bfs(0, 0);

    System.out.println(board[n - 1][m - 1]);
  }

  public static void bfs(int i, int j) {
    Queue<int[]> queue = new LinkedList<int[]>();

    queue.add(new int[]{i, j});
    isVisited[i][j] = true;

    while (!queue.isEmpty()) {
      int now[] = queue.poll();
      // 4방향 탐색
      for (int k = 0; k < 4; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        // 좌표 유효성 검사
        if (x >= 0 && y >= 0 && x < n && y < m) {
          // 미로가 갈수 있는 길이며 방문한 적이 없는지 검사
          if (board[x][y] != 0 && !isVisited[x][y]) {
            isVisited[x][y] = true;
            board[x][y] = board[now[0]][now[1]] + 1;

            queue.add(new int[]{x, y});
          }
        }
      }
    }
  }
}