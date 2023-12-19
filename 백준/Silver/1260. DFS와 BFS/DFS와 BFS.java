import java.io.*;
import java.util.*;

public class Main {

  public static boolean[] isVisited;  // 방문 기록 저장 배열 변수
  public static ArrayList<Integer>[] nList;

  public static void main(String args[]) throws IOException {
    /*
     * 탐색 - 너비 우선 탐색 => O(v + e)  // v는 노드 수, e는 엣지 수
     * Do to! 코딩 테스트 164.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 정점의 갯수 수 n (1~1,000) => 노드 갯수
    int m = Integer.parseInt(st.nextToken()); // 간선의 갯수 m (1~10,000) => 엣지 갯수
    int start = Integer.parseInt(st.nextToken()); // 시작점
    nList = new ArrayList[n + 1];
    // 인접 리스트 초기화
    for (int i = 1; i <= n; i++) {
      nList[i] = new ArrayList<Integer>();
    }
    // 인접 리스트 노드 간선 추가
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      nList[a].add(b);
      nList[b].add(a);
    }
    // 정점 번호 오름차순 정렬
    for (int i = 1; i <= n; i++) {
      Collections.sort(nList[i]);
    }
    // 깊이 우선 탐색 실시 (DFS)
    isVisited = new boolean[n + 1]; // 탐색 전 방문 배열 초기화
    dfs(start);
    System.out.println();
    // 너비 우선 탐색 실시 (BFS)
    isVisited = new boolean[n + 1];
    bfs(start);
    System.out.println();
  }

  public static void dfs(int node) {
    System.out.print(node + " ");

    isVisited[node] = true;

    for (int i : nList[node]) {
      if (!isVisited[i]) {
        dfs(i);
      }
    }
  }

  public static void bfs(int node) {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(node);

    isVisited[node] = true;

    while (!queue.isEmpty()) {
      int nowNode = queue.poll();

      System.out.print(nowNode + " ");

      for (int i : nList[nowNode]) {
        if (!isVisited[i]) {
          isVisited[i] = true;
          queue.add(i);
        }
      }
    }
  }
}