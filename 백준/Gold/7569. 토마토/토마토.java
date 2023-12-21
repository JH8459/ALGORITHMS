import java.io.*;
import java.util.*;

public class Main {

  public static class PointXYZ {

    int x;
    int y;
    int z;

    public PointXYZ(int z, int y, int x) {
      this.x = x;
      this.y = y;
      this.z = z;
    }
  }

  public static int x, y, z; // 토마토 상자 가로, 세로, 높이
  public static int[] dx = {-1, 0, 1, 0, 0, 0};
  public static int[] dy = {0, 1, 0, -1, 0, 0};
  public static int[] dz = {0, 0, 0, 0, 1, -1};
  public static Queue<PointXYZ> nodeList;
  public static int[][][] tomatoArr;  // 토마토 저장 배열

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    x = Integer.parseInt(st.nextToken()); // 가로 칸 수
    y = Integer.parseInt(st.nextToken()); // 세로 칸 수
    z = Integer.parseInt(st.nextToken()); // 높이 칸 수

    nodeList = new LinkedList<>();  // 토마토 위치를 저장 할 큐
    tomatoArr = new int[z + 1][y + 1][x + 1]; // 익은 토마토 저장 배열 초기화

    for (int i = 1; i <= z; i++) {
      for (int j = 1; j <= y; j++) {
        st = new StringTokenizer(br.readLine());

        for (int k = 1; k <= x; k++) {
          int tomatoNum = Integer.parseInt(st.nextToken()); // 1 = 익은 토마토, 0 = 안익은 토마토, -1 = 공백
          tomatoArr[i][j][k] = tomatoNum;

          if (tomatoNum == 1) {
            nodeList.add(new PointXYZ(i, j, k));  // 익은 토마토라면 탐색을 위해 노드를 큐에 추가
          }
        }
      }
    }

    bw.write(getTomatoMaxNum() + "\n");
    ;  // bfs 실행
    bw.flush();
    bw.close();
  }

  public static int getTomatoMaxNum() {
    while (!nodeList.isEmpty()) {
      PointXYZ node = nodeList.poll();

      int nowX = node.x;
      int nowY = node.y;
      int nowZ = node.z;
      // 6방향 이동 가능 유무 유효성 검사
      for (int i = 0; i < 6; i++) {
        int nextX = nowX + dx[i];
        int nextY = nowY + dy[i];
        int nextZ = nowZ + dz[i];
        // 이동할 수 있는 좌표 검사
        if (nextX >= 1 && nextY >= 1 && nextZ >= 1 && nextX <= x && nextY <= y && nextZ <= z) {
          // 안익은 토마토인 경우 노드 추가
          if (tomatoArr[nextZ][nextY][nextX] == 0) {
            nodeList.add(new PointXYZ(nextZ, nextY, nextX));
            tomatoArr[nextZ][nextY][nextX] = tomatoArr[nowZ][nowY][nowX] + 1;
          }
        }
      }
    }

    int result = Integer.MIN_VALUE;

    for (int i = 1; i <= z; i++) {
      for (int j = 1; j <= y; j++) {
        for (int k = 1; k <= x; k++) {
          // 하나라도 익지 않은 토마토가 있다면 -1을 반환
          if (tomatoArr[i][j][k] == 0) {
            return -1;
          }
          // 토마토가 익는데 걸리는 시간을 구함
          result = Math.max(result, tomatoArr[i][j][k]);
        }
      }
    }

    // 최대 값이 1이라면 원래부터 모두 익어있었다
    if (result == 1) {
      return 0;
    }
    // 걸린 일수 = (최대 값 - 1)
    else {
      return (result - 1);
    }
  }
}