import java.io.*;
import java.util.*;

public class Main {

  public static ArrayList<Integer>[] nList;
  public static boolean[] isVisited;

  public static void main(String args[]) throws IOException {
    /*
     * 탐색 - 깊이 우선 탐색 => O(v + e)  // v는 노드 수, e는 엣지 수
     * Do to! 코딩 테스트 148.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 정점(노드)의 개수 n
    int m = Integer.parseInt(st.nextToken()); // 간선(엣지)의 개수 m
    int cnt = 0;  // 연결 요소의 개수를 세는 변수 선언
    nList = new ArrayList[n + 1];
    isVisited = new boolean[n + 1];

    for (int i = 1; i <= n; i++) {
      nList[i] = new ArrayList<Integer>();  // 인접 리스트 초기화
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      // 양 끝점 u, v
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      // 양방향 엣지
      nList[u].add(v);
      nList[v].add(u);
    }

    for (int i = 1; i <= n; i++) {
      if (!isVisited[i]) {  // 방문하지 않은 노드가 없을 때까지 반복
        cnt++;
        dfs(i); // 깊이 우선 탐색 실시
      }
    }

    bw.write(cnt + "\n");
    bw.flush();
    bw.close();
  }

  public static void dfs(int node) {
    // 탈출 조건 (현재 노드가 방문한 적 있다면 탈출)
    if (isVisited[node]) {
      return;
    }

    isVisited[node] = true;
    // List for문 (List 요소를 수정하지 않고 읽기만 하는 경우 사용 가능)
    for (int i : nList[node]) {
      if (!isVisited[i]) {
        dfs(i); // 현재 노드의 연결된 노드 중 방문하지 않은 노드만 탐색
      }
    }
  }
}