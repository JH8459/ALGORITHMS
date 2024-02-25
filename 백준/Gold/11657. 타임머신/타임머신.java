import java.io.*;
import java.util.*;

public class Main {
  /*
   * 벨만-포드
   * Do it! 알고리즘 코딩 테스트 338.p
   */
  public static int n, m;
  public static long[] distance;
  public static Edge[] edges;

  public static class Edge {
    int start, end, time; // 시작점, 도착점, 걸리는 시간

    public Edge (int start, int end, int time){
      this.start = start;
      this.end = end;
      this.time = time;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    edges = new Edge[m + 1];
    distance = new long[n + 1];

    Arrays.fill(distance, Integer.MAX_VALUE);

    for(int i = 0; i < m; i ++){
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int time = Integer.parseInt(st.nextToken());

      edges[i] = new Edge(start, end, time);
    }

    distance[1] = 0;

    for(int i = 1; i < n; i++){
      for(int j = 0; j < m; j++){
        Edge edge = edges[j];

        if(distance[edge.start] != Integer.MAX_VALUE && distance[edge.end] > distance[edge.start] + edge.time){
          distance[edge.end] = distance[edge.start] + edge.time;
        }
      }
    }

    boolean mCycle = false;

    for(int i = 0; i < m; i++){
      Edge edge = edges[i];

      if (distance[edge.start] != Integer.MAX_VALUE && distance[edge.end] > distance[edge.start] + edge.time) {
        mCycle = true;
        break;
      }
    }

    if(!mCycle){
      for(int i = 2; i <= n; i++){
        if (distance[i] == Integer.MAX_VALUE) {
          bw.write("-1\n");
        } else {
        bw.write(distance[i] + "\n");
        }
      }
    } else {
      bw.write("-1\n");
    }

    bw.flush();
    bw.close();
  }
}