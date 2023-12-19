import java.io.*;
import java.util.*;

public class Main {

  public static boolean isArrived;  // 도착 확인 변수
  public static boolean[] isVisited;  // 방문 기록 저장 배열 변수
  public static ArrayList<Integer>[] nList;

  public static void main(String args[]) throws IOException {
    /*
     * 탐색 - 깊이 우선 탐색 => O(v + e)  // v는 노드 수, e는 엣지 수
     * Do to! 코딩 테스트 157.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 사람의 수 n (5~2,000) => 노드 갯수
    int m = Integer.parseInt(st.nextToken()); // 친구 관계의 수 m (1~2,000) => 엣지 갯수
    nList = new ArrayList[n];
    isVisited = new boolean[n];
    // 인접 리스트 초기화
    for (int i = 0; i < n; i++) {
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
    // 깊이 우선 탐색 실시 (A, B, C, D, E가 모두 친구라면 즉, 5단계 깊이에 도착했다면 반복문 종료)
    for (int i = 0; i < n; i++) {
      dfs(i, 1);

      if (isArrived) {
        break;
      }
    }

    if (isArrived) {
      bw.write("1\n");
    } else {
      bw.write("0\n");
    }

    bw.flush();
    bw.close();
  }

  public static void dfs(int now, int depth) {
    // 탈출 조건 (detph가 5이거나 isArrived 변수가 true인 경우)
    if (depth == 5 || isArrived) {
      isArrived = true;

      return;
    }

    isVisited[now] = true;

    for (int i : nList[now]) {
      if (!isVisited[i]) {
        dfs(i, depth + 1);  // 재귀 스택이 쌓일수록 depth 증가
      }
    }

    isVisited[now] = false;
  }
}