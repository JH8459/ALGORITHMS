import java.io.*;
import java.util.*;

public class Main {

  public static ArrayList<Integer>[] nodeList;  // 친척들 사이 관계를 저장 할 인접리스트
  public static boolean[] isVisited;  // 방문 기록 저장 배열
  public static int result; // 촌수 관계를 헤아릴 변수

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine()); // 사람 수 n

    StringTokenizer st = new StringTokenizer(br.readLine());
    // 촌수 관계를 확인해야 할 a, b
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int m = Integer.parseInt(br.readLine()); // 부모 자식 관계 반복 횟수

    nodeList = new ArrayList[n + 1];
    isVisited = new boolean[n + 1]; // 방문 기록 배열 초기화

    for (int i = 1; i <= n; i++) {
      nodeList[i] = new ArrayList<Integer>();  // 인접리스트 초기화
    }

    // nodeList 데이터 추가
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      nodeList[start].add(end);
      nodeList[end].add(start);
    }

    dfs(a, b, 0);

    if (result == 0) {
      bw.write("-1\n");
    } else {
      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static void dfs(int start, final int end, int count) {
    // 탈출 조건 (start와 end가 만나는 경우)
    if (start == end) {
      result = count;
      return;
    }

    isVisited[start] = true;
    // 현재 노드에 연결된 다음 노드들을 순회
    for (int i = 0; i < nodeList[start].size(); i++) {
      int next = nodeList[start].get(i);

      if (!isVisited[next]) {
        dfs(next, end, count + 1);
      }
    }


  }
}