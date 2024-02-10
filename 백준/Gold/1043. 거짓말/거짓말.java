import java.io.*;
import java.util.*;

public class Main {
  /*
   * 유니온 파인드
   * Do it! 알고리즘 코딩 테스트 291.p
   */
  public static int[] parent;
  public static int[] truePeopleData;
  public static ArrayList<Integer>[] partyList;
  public static int result;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 사람의 수
    int m = Integer.parseInt(st.nextToken()); // 파티의 수

    st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());  // 진실을 아는 사람의 수

    result = 0;
    truePeopleData = new int[t];

    for(int i = 0; i < t; i++){
      truePeopleData[i] = Integer.parseInt(st.nextToken()); // 진실을 아는 사람들의 번호
    }

    partyList = new ArrayList[m];

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      partyList[i] = new ArrayList<Integer>();
      int partySize = Integer.parseInt(st.nextToken());

      for(int j = 0; j < partySize; j++){
        partyList[i].add(Integer.parseInt(st.nextToken())); // 파티 데이터 저장
      }
    }

    parent = new int[n + 1];

    for(int i = 0; i <= n; i++){
      parent[i] = i;  // 대표노드 초기화
    }

    for(int i = 0; i < m; i++){
      // 각 파티에 참여한 사람들을 1개의 그룹으로 만들기
      int firstPeople = partyList[i].get(0);

      for(int j = 0; j < partyList[i].size(); j++){
        union(firstPeople, partyList[i].get(j));
      }
    }

    for(int i = 0; i < m; i++){
      // 각 파티의 대표 노드와 진실을 아는 사람들의 대표 노드가 같다면 과장 불가능
      boolean isPossible = true;
      int cur = partyList[i].get(0);

      for (int truePeopleData : truePeopleData) {
        if (find(cur) == find(truePeopleData)) {
          isPossible = false;
          break;
        }
      }

      if(isPossible){
        result++; // 모두 다르다면 결과값 증가
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

  public static int find(int n){
    if(n == parent[n]){
      return n;
    } else{
      return parent[n] = find(parent[n]);
    }
  }
}