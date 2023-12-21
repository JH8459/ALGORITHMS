import java.io.*;
import java.util.*;

public class Main {

  public static int n, k; // 수빈과 동생의 위치 값
  public static final int max = 100000; // 숨바꼭질 최대 범위
  public static int[] isVisited;  // 방문 기록을 저장할 변수

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken()); // 수빈이가 있는 위치 N
    k = Integer.parseInt(st.nextToken()); // 동생의 위치 K

    isVisited = new int[max + 1];

    if (n == k) {
      bw.write("0\n");
    } else {
      bfs(n);  // bfs 실행
    }

    bw.flush();
    bw.close();
  }

  public static void bfs(int node) {
    Queue<Integer> nodeList = new LinkedList<>(); // 수빈이가 이동 가능한 좌표를 담을 큐

    nodeList.add(node);
    isVisited[node] = 1;

    while (!nodeList.isEmpty()) {
      int now = nodeList.poll();  // 현재 쌓인 이동 가능 위치 큐에 맨 상단 값 추출
      // 탈출 조건 (수빈이 이동 가능한 위치 = 동생 위치)
      if (now - 1 == k || now + 1 == k || now * 2 == k) {
        System.out.println(isVisited[now]);
        return;
      }
      // 수빈 이동 (3가지 경우의 수)
      if (now - 1 >= 0 && isVisited[now - 1] == 0) {
        isVisited[now - 1] = isVisited[now] + 1;
        nodeList.add(now - 1);
      }

      if (now + 1 <= max && isVisited[now + 1] == 0) {
        isVisited[now + 1] = isVisited[now] + 1;
        nodeList.add(now + 1);
      }

      if (now * 2 <= max && isVisited[now * 2] == 0) {
        isVisited[now * 2] = isVisited[now] + 1;
        nodeList.add(now * 2);
      }
    }
  }
}