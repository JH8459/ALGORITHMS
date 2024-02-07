import java.io.*;
import java.util.*;

public class Main {
  public static int[] parent;

  public static void main(String args[]) throws IOException {
    /*
     * 유니온 파인드
     * Do it! 알고리즘 코딩 테스트 282.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    parent = new int[n + 1];

    for(int i = 0; i <= n; i++){
      parent[i] = i;  // 대표 노드 초기화
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      int question = Integer.parseInt(st.nextToken());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if(question == 0){
        union(a, b);  // 집합 합치기
      } else {
        if(checkSame(a,b)){
          bw.write("YES\n");
        } else {
          bw.write("NO\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }

  public static void union(int a, int b){ // 대표 노드끼리 연결하는 연산
    a = find(a);
    b = find(b);

    if(a != b){
      parent[b] = a;
    }
  }

  public static int find(int num){  // find 연산
    if (num == parent[num]){
      return num;
    } else {
      return parent[num] = find(parent[num]); //경로 압축
    }
  }

  public static boolean checkSame(int a, int b){  // 두 원소가 같은 집합인지 확인
    a = find(a);
    b = find(b);

    return a == b;
  }
}