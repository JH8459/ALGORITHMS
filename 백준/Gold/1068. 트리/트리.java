import java.io.*;
import java.util.*;

public class Main {
  /*
   * 트리
   * Do it! 알고리즘 코딩 테스트 396.p
   */
  public static boolean[] visited;
  public static ArrayList<Integer>[] tree;
  public static int answer = 0, deleteNode = 0;

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    visited = new boolean[n];
    tree = new ArrayList[n];
    int root = 0;

    for(int i = 0; i < n; i++){
      tree[i] = new ArrayList<Integer>();
    }

    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      int node = Integer.parseInt(st.nextToken());

      if(node == -1){
        root = i;
      } else {
        tree[i].add(node);
        tree[node].add(i);
      }
    }

    deleteNode = Integer.parseInt(br.readLine());

    if(deleteNode == root){
      bw.write(0 + "\n");
    } else {
      DFS(root);
      bw.write(answer + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static void DFS(int number){
    visited[number] = true;
    int cntNode = 0;

    for(int node : tree[number]){
      if(!visited[node] && node != deleteNode){
        cntNode++;
        DFS(node);
      }
    }

    if(cntNode == 0){
      answer++;
    }
  }
}