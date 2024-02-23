import java.io.*;
import java.util.*;

public class Main {
  /*
   * 다익스트라
   * Do it! 알고리즘 코딩 테스트 324.p
   */
  public static int n, m;
  public static ArrayList<Node>[] nList;
  public static int[] distance;
  public static boolean[] isVisited;

  public static class Node implements Comparable<Node>{
    int targetNode;
    int value;

    public Node (int targetNode, int value){
      this.targetNode = targetNode;
      this.value = value;
    }

    @Override
    public int compareTo(Node o) {
      return value - o.value;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    n = Integer.parseInt(br.readLine());
    m = Integer.parseInt(br.readLine());

    nList = new ArrayList[n + 1];
    distance = new int[n + 1];
    isVisited = new boolean[n + 1];

    Arrays.fill(distance, Integer.MAX_VALUE); // 최소 거리 배열이기 때문에 충분히 큰 값으로 배열 초기화

    for(int i = 0; i <= n; i++){
      nList[i] = new ArrayList<Node>();
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());

      nList[start].add(new Node(end, weight));  // 노드 클래스 (타겟 노드, 가중치)
    }

    st = new StringTokenizer(br.readLine());

    int startIdx = Integer.parseInt(st.nextToken());
    int endIdx = Integer.parseInt(st.nextToken());

    bw.write(dijkstra(startIdx, endIdx) + "\n");
    bw.flush();
    bw.close();
  }

  public static int dijkstra(int start, int end){
    PriorityQueue<Node> pq = new PriorityQueue<Node>();

    pq.offer(new Node(start, 0));
    distance[start] = 0;

    while (!pq.isEmpty()){
      Node nowNode = pq.poll();

      int now = nowNode.targetNode;

      if(!isVisited[now]){
        isVisited[now] = true;

        for(Node node : nList[now]){
          if(!isVisited[node.targetNode] && distance[node.targetNode] > distance[now] + node.value){
            // 선택 노드 + 비용 < 타깃 노드
            distance[node.targetNode] = distance[now] + node.value;
            pq.add(new Node(node.targetNode, distance[node.targetNode]));
          }
        }
      }
    }

    return distance[end];
  }
}