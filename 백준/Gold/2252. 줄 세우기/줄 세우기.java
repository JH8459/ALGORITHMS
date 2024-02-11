import java.io.*;
import java.util.*;

public class Main {
  /*
   * 위상 정렬
   * Do it! 알고리즘 코딩 테스트 300.p
   */
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 학생의 수
    int m = Integer.parseInt(st.nextToken()); // 비교 횟수
    ArrayList<ArrayList<Integer>> nList = new ArrayList<>();  // 노드 데이터를 저장할 인접리스트
    int[] inDegree = new int[n + 1];  // 진입 차수 배열

    for(int i = 0; i <= n; i++){
      nList.add(new ArrayList<>());
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      nList.get(start).add(end);  // 인접리스트에 노드 데이터를 저장
      inDegree[end]++;  // 진입 차수 배열값 업데이트
    }

    Queue<Integer> queue = new LinkedList<>();  // 위상 정렬을 위한 큐 생성

    for(int i = 1; i <= n; i++){
      if(inDegree[i] == 0){ // 진입 차수 배열의 값이 0인 학생(노드)을 큐에 삽입
        queue.offer(i);
      }
    }

    while (!queue.isEmpty()){
      int now = queue.poll();

      bw.write(now + " ");

      for (int next : nList.get(now)) {
        inDegree[next]--; // 현재 노드가 가리키는 노드의 진입차수 1 감소

        if(inDegree[next] == 0){
          queue.offer(next);
        }
      }
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}