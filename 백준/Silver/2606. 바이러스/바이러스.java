import java.io.*;
import java.util.*;

public class Main {

  public static boolean[] isVisited;  // 방문 기록 저장 배열
  public static ArrayList<Integer>[] nodeList;  // 트리 데이터를 저장할 인접 리스트
  public static int result; // 결과값을 저장할 변수

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); // 컴퓨터의 수 n
    int m = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터의 쌍 수
    result = 0; // 감염된 컴퓨터 수

    nodeList = new ArrayList[n + 1];  // 컴퓨터의 수만큼 인접리스트 생성
    isVisited = new boolean[n + 1]; // 방문 기록 배열 초기화
    // 인접리스트 초기화
    for (int i = 1; i <= n; i++) {
      nodeList[i] = new ArrayList<Integer>();
    }

    for (int i = 0; i < m; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken()); // 시작 노드 번호
      int end = Integer.parseInt(st.nextToken()); // 종료 노드 번호

      // 인접리스트에 간선 데이터 저장
      nodeList[start].add(end);
      nodeList[end].add(start);
    }
    // 깊이 우선 탐색 실행 (시작점 노드 = 1)
    dfs(1);

    System.out.println(result - 1); // 1번은 미리 감염된 PC 이므로 제외
  }

  public static void dfs(int nowNode) {
    if (isVisited[nowNode]) {
      return;
    }

    isVisited[nowNode] = true;
    result++;

    for (int i : nodeList[nowNode]) {
      if (!isVisited[i]) {
        dfs(i);
      }
    }
  }
}