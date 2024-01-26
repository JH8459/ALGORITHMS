import java.io.*;
import java.util.*;

public class Main {
  static public int[] visited;
  static public ArrayList<Integer>[] nList;
  static public List<Integer> answerList;
  static public int n; // 노드 개수 (도시 개수)
  static public int m; // 엣지 개수 (도로 개수)
  static public int k; // 목표 거리
  static public int x; // 시작점

  public static void main(String args[]) throws IOException {
    /*
     * 그래프
     * Do to! 코딩 테스트 260.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    x = Integer.parseInt(st.nextToken());

    visited = new int[n + 1];
    nList = new ArrayList[n + 1];
    answerList = new ArrayList<>();

    for(int i = 1; i <= n; i++){
      nList[i] = new ArrayList<Integer>();
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      nList[start].add(end);
    }

    for(int i = 0; i <= n; i++){
      visited[i] = -1;
    }

    bfs(x); // 시작점 기준 너비 우선 탐색

    for(int i = 0; i <= n; i++){
      if(visited[i] == k){
        answerList.add(i);
      }
    }

    if(answerList.isEmpty()){
      bw.write("-1\n");
    } else {
      Collections.sort(answerList);

      for(int node : answerList){
        bw.write(node + "\n");
      }
    }

    bw.flush();
    bw.close();
  }

  public static void bfs(int node){
    Queue<Integer> queue = new LinkedList<Integer>();

    queue.add(node);
    visited[node]++;

    while (!queue.isEmpty()){
      int nowNode = queue.poll();

      for(int i : nList[nowNode]){
        if(visited[i] == -1){
          visited[i] = visited[nowNode] + 1;
          queue.add(i);
        }
      }
    }
  }
}