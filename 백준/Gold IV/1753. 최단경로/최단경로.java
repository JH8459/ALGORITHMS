import java.io.*;
import java.util.*;

public class Main {
  /*
   * 다익스트라
   * Do it! 알고리즘 코딩 테스트 319.p
   */
  public static int v, e, k;  // 노드 개수, 에지 개수, 출발 노드
  public static int[] distance; // 거리 배열
  public static boolean[] isVisited;  // 방문 여부 배열
  public static ArrayList<Edge>[] list;
  public static PriorityQueue<Edge> queue = new PriorityQueue<Edge>();

  public static class Edge implements Comparable<Edge>{
    int vertex, value;
    Edge (int vertex, int value){
      this.vertex = vertex;
      this.value = value;
    }
    public int compareTo (Edge e) {
      if (this.value > e.value) {
        return 1;
      } else {
        return -1;
      }
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    v = Integer.parseInt(st.nextToken());
    e = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(br.readLine());

    distance = new int[v + 1];
    isVisited = new boolean[v + 1];
    list = new ArrayList[v + 1];

    for(int i = 1; i <= v; i++){
      list[i] = new ArrayList<Edge>();
    }

    for(int i = 0; i <= v; i++){
      distance[i] = Integer.MAX_VALUE;
    }

    for(int i = 0; i < e; i++){
      st = new StringTokenizer(br.readLine());

      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());

      list[u].add(new Edge(v, w));
    }

    queue.add(new Edge(k, 0));  // 시작점
    distance[k] = 0;

    while (!queue.isEmpty()){
      Edge now = queue.poll();

      if (isVisited[now.vertex]) {
        continue;
      }

      isVisited[now.vertex] = true;

      for(int i = 0; i < list[now.vertex].size(); i++){
        Edge temp = list[now.vertex].get(i);

        int next = temp.vertex;
        int value = temp.value;

        if(distance[next] > distance[now.vertex] + value){
          distance[next] = distance[now.vertex] + value;
          queue.add(new Edge(next, distance[next]));
        }
      }
    }

    for(int i = 1; i <= v; i++){
      if(isVisited[i]) {
        bw.write(distance[i] + "\n");
      } else {
        bw.write("INF\n");
      }
    }

    bw.flush();
    bw.close();
  }
}