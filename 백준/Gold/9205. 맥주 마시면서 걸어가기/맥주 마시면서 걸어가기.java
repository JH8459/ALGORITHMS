import java.awt.Point;
import java.io.*;
import java.util.*;

public class Main {

  // 맥주를 채울 수 있는 편의점의 위치 정보를 담을 클래스 선언
  public static class PointXY {

    int x, y;

    public PointXY(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static ArrayList<ArrayList<Integer>> mapList;  // 전체 맵 인접 리스트
  public static ArrayList<PointXY> nodeList;  // 집, 편의점, 도착지 주소를 저장할 리스트

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int marketCnt = Integer.parseInt(br.readLine());
      nodeList = new ArrayList<PointXY>();

      String homeInfo = br.readLine();
      int homeX = Integer.parseInt(homeInfo.split(" ")[0]);
      int homeY = Integer.parseInt(homeInfo.split(" ")[1]);
      nodeList.add(new PointXY(homeX, homeY)); // 집

      for (int j = 1; j <= marketCnt; j++) {
        String marketInfo = br.readLine();

        int marketX = Integer.parseInt(marketInfo.split(" ")[0]);
        int marketY = Integer.parseInt(marketInfo.split(" ")[1]);
        nodeList.add(new PointXY(marketX, marketY));  // 편의점
      }

      String festivalInfo = br.readLine();
      int festivalX = Integer.parseInt(festivalInfo.split(" ")[0]);
      int festivalY = Integer.parseInt(festivalInfo.split(" ")[1]);
      nodeList.add(new PointXY(festivalX, festivalY)); // 도착지

      mapList = new ArrayList<>();

      for (int k = 0; k < marketCnt + 2; k++) {
        mapList.add(new ArrayList<>());
      }

      for (int l = 0; l < marketCnt + 2; l++) {
        for (int m = l + 1; m < marketCnt + 2; m++) {
          int distance =
              Math.abs(nodeList.get(l).x - nodeList.get(m).x) + Math.abs(
                  nodeList.get(l).y - nodeList.get(m).y);  // 두 정점간 거리 산출 (완전 탐색)

          if (distance <= 1000) {
            // 거리가 1,000m 이내라면 두 정점을 잇는다
            mapList.get(l).add(m);
            mapList.get(m).add(l);
          }
        }
      }
      // bfs 실행
      bw.write(bfs(marketCnt) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static String bfs(int marketCnt) {
    Queue<Integer> queue = new LinkedList<Integer>(); // nodeList를 담을 큐
    boolean[] isVisited = new boolean[marketCnt + 2]; // 방문 기록을 담을 변수 선언 (집 + 도착지 + 편의점) = marketCnt + 2

    queue.add(0); // 첫번째 노드 즉, 집 부터 탐색 시작
    isVisited[0] = true;

    while (!queue.isEmpty()) {
      int now = queue.poll();

      if (now == marketCnt + 1) { // 도착지까지 간선이 이어진 경우라면 happy 리턴
        return "happy";
      }

      for (int next : mapList.get(now)) {
        // mapList의 다음 이어진 간선을 탐색한다
        if (!isVisited[next]) {
          queue.add(next);
          isVisited[next] = true;
        }
      }
    }

    return "sad"; // 도착지까지 간선이 안이어져 있다면 sad 리턴
  }
}