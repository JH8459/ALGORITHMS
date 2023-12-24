import java.io.*;
import java.util.*;

public class Main {

  public static int f;  // 목적지
  public static int g;  // 목적지
  public static int u;  // 위로 이동하는 층 수
  public static int d;  // 아래로 이동하는 층 수
  public static int[] isVisited;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    f = Integer.parseInt(st.split(" ")[0]); // 총 층수
    int s = Integer.parseInt(st.split(" ")[1]); // 현재 위치
    g = Integer.parseInt(st.split(" ")[2]);
    u = Integer.parseInt(st.split(" ")[3]);
    d = Integer.parseInt(st.split(" ")[4]);

    isVisited = new int[f + 1];

    bw.write(bfs(s) + "\n");
    bw.flush();
    bw.close();
  }

  public static String bfs(int start) {
    Queue<Integer> queue = new LinkedList<Integer>();

    queue.add(start);
    isVisited[start] = 1;

    while (!queue.isEmpty()) {
      int now = queue.poll();
      // 목적지 도착 => 최초 시작 위치는 횟수에서 뺀다
      if (now == g) {
        return String.valueOf(isVisited[now] - 1);
      }
      // 위로 올라가는 경우의 수
      if (now + u <= f) {
        if (isVisited[now + u] == 0) {
          queue.add(now + u);
          isVisited[now + u] = isVisited[now] + 1;
        }
      }
      // 아래로 내려가는 경우의 수
      if (now - d > 0) {
        if (isVisited[now - d] == 0) {
          queue.add(now - d);
          isVisited[now - d] = isVisited[now] + 1;
        }
      }
    }

    return "use the stairs";
  }
}