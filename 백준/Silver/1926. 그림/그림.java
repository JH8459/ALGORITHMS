import java.io.*;
import java.util.*;

public class Main {

  public static int n, m;
  public static int paintNum;  // 그림의 갯수를 저장할 변수
  public static int area, maxArea;  // 현재 탐색한 그림의 넓이와 최대 넓이를 저장할 변수
  public static int[] dr = {-1, 0, 1, 0}; // 북동남서
  public static int[] dc = {0, 1, 0, -1};

  public static int[][] map;
  public static boolean[][] isVisited;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    map = new int[n][m];
    isVisited = new boolean[n][m];

    maxArea = 0;
    area = 0;
    paintNum = 0;

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 그림 지도 탐색
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] == 1 && !isVisited[i][j]) {
          paintNum++; // 그림 수 증가

          dfs(i, j);  // 현재 위치로 부터 인접한 색칠 영역 탐색 실시

          maxArea = Math.max(maxArea, area);  // 최대 넓이 산출
          area = 0; // 현재 탐색 지점 넓이 초기화
        }
      }
    }

    bw.write(paintNum + "\n" + maxArea + "\n");
    bw.flush();
    bw.close();
  }

  public static void dfs(int row, int col) {
    isVisited[row][col] = true;
    area++;
    
    // 4방향 인접 색칠 영역 탐색
    for (int i = 0; i < 4; i++) {
      int nextR = row + dr[i];
      int nextC = col + dc[i];
      // 이동 가능한 범위 체크
      if (nextR >= 0 && nextC >= 0 && nextR < n && nextC < m) {
        if (map[nextR][nextC] == 1 && !isVisited[nextR][nextC]) {
          dfs(nextR, nextC);
        }
      }
    }
  }
}