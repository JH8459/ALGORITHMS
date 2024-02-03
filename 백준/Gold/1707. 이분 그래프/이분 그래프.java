import java.io.*;
import java.util.*;

public class Main {
  /*
   * 그래프
   * Do to! 코딩 테스트 269.p
   */
  public static int k;  // 테스트 케이스
  public static boolean isEven; // 이분 그래프 체크
  public static int[] isCheck;  // 이분 그래프 체크 배열
  public static boolean[] visited;  // 방문 여부 체크 배열
  public static ArrayList<Integer>[] nList; // 그래프 데이터 인접 리스트

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    k = Integer.parseInt(st.nextToken());

    for(int i = 0; i < k; i++){
      st = new StringTokenizer(br.readLine());

      int v = Integer.parseInt(st.nextToken()); // 그래프 정점의 개수
      int e = Integer.parseInt(st.nextToken()); // 간선의 개수

      nList = new ArrayList[v + 1];
      visited = new boolean[v + 1];
      isCheck = new int[v + 1];
      isEven = true;

      for(int j = 1; j <= v; j++){
        nList[j] = new ArrayList<Integer>();
      }

      for(int j = 0; j < e; j++){
        st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken()); // 시작 정점 번호
        int end = Integer.parseInt(st.nextToken()); // 도착 정점 번호

        nList[start].add(end);
        nList[end].add(start);
      }

      for(int j = 1; j <= v; j++){
        if(isEven){
          dfs(j);
        } else {
          break;
        }
      }

      if(isEven){
        bw.write("YES\n");
      } else {
        bw.write("NO\n");
      }
    }

    bw.flush();
    bw.close();
  }

  public static void dfs(int node){
    visited[node] = true;

    for(int i : nList[node]){
      if(!visited[i]){
        // 인접한 노드는 같은 집합이 아니므로 이전 노드와 다른 집합으로 처리하기
        isCheck[i] = (isCheck[node] + 1) % 2;
        dfs(i);
      } else if (isCheck[node] == isCheck[i]){
        // 이미 방문한 노드가 현재 내 노드와 같은 집합이면 이분 그래프가 아님 (순환구조)
        isEven = false;
      }
    }

  }
}