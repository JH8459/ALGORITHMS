import java.io.*;
import java.util.*;

public class Main {

  public static int n;  // 지도의 크기를 결정하는 변수
  public static int[] dx = {0, 1, 0, -1};
  public static int[] dy = {1, 0, -1, 0};
  public static int[][] map;  // 정사각형 모양의 지도 배열
  public static int groupNum; // 단지 수를 저장할 변수
  public static int[] apartment;  // 아파트 수를 저장할 배열
  public static boolean[][] isVisited;  // 방문 기록 저장 배열

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine()); // 지도의 크기 n

    map = new int[n][n];  // 지도 배열 초기화
    isVisited = new boolean[n][n]; // 방문 기록 배열 초기화
    apartment = new int[25 * 25]; // 단지 내 아파트 수 배열 초기화 (가로 & 세로 최대 25)
    // 지도 채우기
    for (int i = 0; i < n; i++) {
      String line = br.readLine();

      for (int j = 0; j < n; j++) {
        map[i][j] = Integer.parseInt(line.substring(j, j + 1));
      }
    }
    // 지도 탐색
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (map[i][j] == 1 && !isVisited[i][j]) {
          groupNum++; // 단지수 증가

          dfs(i, j);  // 현재 위치로 부터 인접한 아파트 탐색 실시
        }
      }
    }
    // 단지 배열 수
    bw.write(groupNum + "\n");
    // 단지 내 아파트 수 오름차순 출력
    Arrays.sort(apartment);

    for (int i = 0; i < apartment.length; i++) {
      if (apartment[i] > 0) {
        bw.write(apartment[i] + "\n");
      }
    }

    bw.flush();
    bw.close();
  }

  public static void dfs(int x, int y) {
    // 탈출 조건 (방문한 적이 있는 경우)
    if (isVisited[x][y]) {
      return;
    }

    isVisited[x][y] = true;
    apartment[groupNum]++;
    // 4방향 인접 아파트 체크
    for (int i = 0; i < 4; i++) {
      int nowX = x + dx[i];
      int nowY = y + dy[i];

      if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n) {
        if (map[nowX][nowY] == 1 && !isVisited[nowX][nowY]) {
          dfs(nowX, nowY);
        }
      }
    }
  }
}