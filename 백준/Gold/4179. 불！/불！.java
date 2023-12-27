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

  public static int r, c;
  public static int[] dx = {-1, 0, 1, 0};
  public static int[] dy = {0, 1, 0, -1};
  public static char[][] map;
  public static Queue<XY> peopleQueue;
  public static Queue<XY> fireQueue;
  public static int[][] peopleTimeList;
  public static int[][] fireTimeList;


  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    r = Integer.parseInt(st.nextToken()); // 미로 행의 갯수
    c = Integer.parseInt(st.nextToken()); // 미로 열의 갯수

    peopleQueue = new LinkedList<XY>();  // 사람이 이동 가능한 리스트를 담을 큐
    fireQueue = new LinkedList<XY>(); // 불이 번지는 루트를 담는 큐

    peopleTimeList = new int[r][c]; // 사람이 이동하는데 걸린 시간을 담을 배열
    fireTimeList = new int[r][c]; // 불이 번지는데 걸린 시간을 담을 배열

    map = new char[r][c]; // 문자 맵

    for (int i = 0; i < r; i++) {
      String s = br.readLine();

      for (int j = 0; j < c; j++) {
        map[i][j] = s.charAt(j);
        peopleTimeList[i][j] = -1;
        fireTimeList[i][j] = -1;

        if (map[i][j] == 'J') {
          peopleQueue.add(new XY(i, j)); // "J"인 경우 사람의 위치를 사람 큐에 담는다
          peopleTimeList[i][j] = 0;
        }

        if (map[i][j] == 'F') {
          fireQueue.add(new XY(i, j));  // "F"인 경우 불의 위치를 불 큐에 담는다
          fireTimeList[i][j] = 0;
        }
      }
    }

    fireBfs();  // 불이 먼저 번진다
    int time = peopleBfs();  // 사람이 이동한다

    if (time > 0) {
      bw.write(time + "\n");
    } else {
      bw.write("IMPOSSIBLE\n");
    }

    bw.flush();
    bw.close();
  }

  public static int peopleBfs() {
    while (!peopleQueue.isEmpty()) {
      XY now = peopleQueue.poll();
      // 4방향 인접 영역 탐색
      for (int i = 0; i < 4; i++) {
        int nextX = now.x + dx[i];
        int nextY = now.y + dy[i];
        // 이동 가능한 범위 체크
        if (nextX >= 0 && nextY >= 0 && nextX < r && nextY < c) {
          if (map[nextX][nextY] != '#' && peopleTimeList[nextX][nextY] == -1) {
            if (peopleTimeList[now.x][now.y] + 1 < fireTimeList[nextX][nextY] || fireTimeList[nextX][nextY] == -1) {
              // 불이 번진 시간보다 이동한 시간이 빠르다면 이동 가능한 지역이다
              peopleTimeList[nextX][nextY] = peopleTimeList[now.x][now.y] + 1;
              peopleQueue.add(new XY(nextX, nextY));
            }
          }
        } else {
          // 범위를 벗어났다면 탈출 성공
          return peopleTimeList[now.x][now.y] + 1;
        }
      }
    }

    return 0;
  }

  public static void fireBfs() {
    while (!fireQueue.isEmpty()) {
      XY now = fireQueue.poll();
      // 4방향 인접 영역 탐색
      for (int i = 0; i < 4; i++) {
        int nextX = now.x + dx[i];
        int nextY = now.y + dy[i];
        // 이동 가능한 범위 체크
        if (nextX >= 0 && nextY >= 0 && nextX < r && nextY < c) {
          if (map[nextX][nextY] != '#' && fireTimeList[nextX][nextY] == -1) {
            fireTimeList[nextX][nextY] = fireTimeList[now.x][now.y] + 1;  // 불 번지는 시간을 저장한다
            fireQueue.add(new XY(nextX, nextY));
          }
        }
      }
    }
  }
}