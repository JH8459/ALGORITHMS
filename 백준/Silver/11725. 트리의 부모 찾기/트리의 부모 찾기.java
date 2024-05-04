import java.io.*;
import java.util.*;

public class Main {
  /*
   * 트리
   * Do it! 알고리즘 코딩 테스트 392.p
   */
  public static boolean[] visited;
  public static ArrayList<Integer>[] tree;
  public static int[] answer;

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    visited = new boolean[n + 1];
    tree = new ArrayList[n + 1];
    answer = new int[n + 1];

    for(int i = 0; i < tree.length; i++){
      tree[i] = new ArrayList<Integer>();
    }

    for(int i = 1; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int node1 = Integer.parseInt(st.nextToken());
      int node2 = Integer.parseInt(st.nextToken());

      tree[node1].add(node2);
      tree[node2].add(node1);
    }

    DFS(1);

    for(int i = 2; i <= n; i++){
      bw.write(answer[i] + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static void DFS(int number){
    visited[number] = true;

    for(int node : tree[number]){
      if(!visited[node]){
        answer[node] = number;
        DFS(node);
      }
    }
  }
}