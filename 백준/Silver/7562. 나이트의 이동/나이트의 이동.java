import java.io.*;
import java.util.*;

public class Main {

  public static class XY {

    int x, y;

    public XY(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static int l;
  public static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};  // 나이트 X축 이동 범위
  public static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};  // 나이트 Y축 이동 범위
  public static int[][] map;
  public static boolean[][] isVisited;
  public static XY target;
  public static Queue<XY> queue;


  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int t = Integer.parseInt(st.nextToken());  // 테스트 케이스의 개수

    for (int i = 0; i < t; i++) {
      l = Integer.parseInt(br.readLine());  // 한 변의 길이 l

      queue = new LinkedList<XY>();  // 나이트가 이동 가능한 위치를 담을 큐 선언

      map = new int[l][l];
      isVisited = new boolean[l][l];
      // 나이트의 현재 위치
      st = new StringTokenizer(br.readLine());
      int nightX = Integer.parseInt(st.nextToken());
      int nightY = Integer.parseInt(st.nextToken());
      map[nightX][nightY] = 1;
      // 도착지 위치
      st = new StringTokenizer(br.readLine());
      int targetX = Integer.parseInt(st.nextToken());
      int targetY = Integer.parseInt(st.nextToken());

      target = new XY(targetX, targetY);

      bfs(nightX, nightY);

      bw.write(map[targetX][targetY] - 1 + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static void bfs(int x, int y) {
    queue.add(new XY(x, y));
    isVisited[x][y] = true;

    while (!queue.isEmpty()) {
      XY now = queue.poll();
      // 8방향 탐색
      for (int i = 0; i < 8; i++) {
        int nextX = now.x + dx[i];
        int nextY = now.y + dy[i];

        if (nextX >= 0 && nextY >= 0 && nextX < l && nextY < l) {
          if (!isVisited[nextX][nextY]) {
            XY next = new XY(nextX, nextY);

            isVisited[nextX][nextY] = true;
            map[nextX][nextY] = map[now.x][now.y] + 1;
            // 목적지에 도착한 경우
            if (next.equals(target)) {
              return;
            }

            queue.add((next));
          }
        }
      }
    }
  }
}