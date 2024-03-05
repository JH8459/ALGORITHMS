import java.io.*;
import java.util.*;

public class Main {
  static int[] parent;
  static PriorityQueue<pEdge> queue;
  public static class pEdge implements Comparable<pEdge>{
    int s;
    int e;
    int v;

    pEdge(int s, int e, int v){
      this.s = s;
      this.e = e;
      this.v = v;
    }

    @Override
    public int compareTo(pEdge o) {
      return this.v - o.v;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    queue = new PriorityQueue<>();
    parent = new int[n + 1];

    for(int i = 0; i < n; i++){
      parent[i] = i;
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      queue.add(new pEdge(s, e, v));
    }

    int useEdge = 0;
    int result = 0;

    while (useEdge < n - 1){  // 사용한 엣지 수가 음수가 될 때까지
      pEdge now = queue.poll();

      if(find(now.s) != find(now.e)){ // 같은 부모가 아니라면 연결해도 사이클이 생기지 않음
        union(now.s, now.e);
        result += now.v;  // 엣지의 가중치를 결과에 더한다
        useEdge++;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static void union(int a, int b){
    a = find(a);
    b = find(b);

    if(a != b){
      parent[b] = a;
    }
  }

  public static int find (int num){
    if(num == parent[num]){
      return num;
    } else {
      return parent[num] = find(parent[num]);
    }
  }
}