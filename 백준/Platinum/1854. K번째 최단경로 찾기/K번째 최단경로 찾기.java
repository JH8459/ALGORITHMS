import java.io.*;
import java.util.*;

public class Main {
  /*
   * 다익스트라
   * Do it! 알고리즘 코딩 테스트 329.p
   */
  public static class Node implements Comparable<Node>{
    int node;
    int cost;

    public Node (int node, int cost){
      this.node = node;
      this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
      return this.cost < o.cost ? -1 : 1;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int[][] w = new int[1001][1001];
    PriorityQueue<Integer>[] distQueue = new PriorityQueue[n + 1];

    Comparator<Integer> cp = new Comparator<Integer>() {  // 오름차순 정렬 기준 설정
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? 1 : -1;
      }
    };

    for(int i = 0; i <= n; i++){
      distQueue[i] = new PriorityQueue<>(k, cp);
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      w[a][b] = c;
    }

    PriorityQueue<Node> pq = new PriorityQueue<>();
    pq.add(new Node(1, 0));
    distQueue[1].add(0);

    while (!pq.isEmpty()){
      Node u = pq.poll();

      for(int adjNode = 1; adjNode <= n; adjNode++){
        // 연결된 모든 노드로 검색하기
        if(w[u.node][adjNode] != 0){
          if(distQueue[adjNode].size() < k){
            // 저장된 경로가 k개 미만인 경우는 추가하기
            distQueue[adjNode].add(u.cost + w[u.node][adjNode]);
            pq.add(new Node(adjNode, u.cost + w[u.node][adjNode]));
          } else if(distQueue[adjNode].peek() > u.cost + w[u.node][adjNode]){
            // 저장된 경로가 k개이고, 현재 가장 큰 값보다 작은 경우는 추출하기
            distQueue[adjNode].poll();  // 기존 큐에서 Max값 삭제
            distQueue[adjNode].add(u.cost + w[u.node][adjNode]);
            pq.add(new Node(adjNode, u.cost + w[u.node][adjNode]));
          }
        }
      }
    }

    for(int i = 1; i <= n; i++){
      if(distQueue[i].size() == k){
        bw.write(distQueue[i].peek() + "\n");
      } else {
        bw.write(-1 + "\n");
      }
    }

    bw.flush();
    bw.close();
  }
}