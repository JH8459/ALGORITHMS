import java.io.*;
import java.util.*;

public class Main {
  /*
   * 유니온 파인드
   * Do it! 알고리즘 코딩 테스트 286.p
   */
  public static int[] parent;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine()); // 도시의 수
    int m = Integer.parseInt(br.readLine()); // 여행 계획에 속한 도시의 수

    int[][] city = new int[n + 1][n + 1];

    for(int i = 1; i <= n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int j = 1; j <= n; j++){
        city[i][j] = Integer.parseInt(st.nextToken());  // 도시 연결 데이터 저장
      }
    }

    int[] route = new int[m + 1]; // 여행 계획
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 1; i <= m; i++){
      route[i] = Integer.parseInt(st.nextToken());
    }

    parent = new int[n + 1];

    for(int i = 1; i <= n; i++){
      parent[i] = i;  // 대표노드 초기화
    }

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        if(city[i][j] == 1){  // 인접 행렬에서 도시가 연결되어 있으면 union 실행
          union(i, j);
        }
      }
    }

    int index = find(route[1]); // 여행 계획 도시들이 1개의 대표 도시로 연결되어 있는지 확인
    String answer = "YES";

    for(int i = 2; i < route.length; i++){
      if(index != find(route[i])){
        answer = "NO";
        break;
      }
    }

    bw.write(answer + "\n");
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

  public static int find(int n){
    if(n == parent[n]){
      return n;
    } else{
      return parent[n] = find(parent[n]);
    }
  }
}