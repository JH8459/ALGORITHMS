import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  /*
   * 위상 정렬
   * Do it! 알고리즘 코딩 테스트 304.p
   */
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());  // 건물 종류의 수
    ArrayList<ArrayList<Integer>> nList = new ArrayList<>();  // 데이터 저장 인접리스트

    for(int i = 0; i <= n; i++){
      nList.add(new ArrayList<>()); // 인접 리스트 초기화
    }

    int[] indegree = new int[n + 1];  // 진입 차수 배열 초기화
    int[] selfBuild = new int[n + 1]; // 자기 자신 건설 소요 시간 배열 초기화

    for(int i = 1; i <= n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      selfBuild[i] = Integer.parseInt(st.nextToken());  // 건물 건설 소요 시간

      while (true) {
        int temp = Integer.parseInt(st.nextToken());

        if (temp == -1) {
          break;  // -1이 나오면 종료
        }

        nList.get(temp).add(i);
        indegree[i]++;
      }
    }

    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= n; i++){
      if(indegree[i] == 0){
        queue.offer(i); // 진입 차수 배열의 값이 0인 건물(노드) 큐에 삽입
      }
    }

    int[] result = new int[n + 1];  // 정답(소요 시간) 리스트 배열 초기화

    while (!queue.isEmpty()){
      int now = queue.poll();

      for(int next: nList.get(now)){
        indegree[next]--;
        result[next] = Math.max(result[next], result[now] + selfBuild[now]);

        if(indegree[next] == 0){
          queue.offer(next);
        }
      }
    }

    for(int i = 1; i <= n; i++){
      bw.write(result[i] + selfBuild[i] + "\n");
    }
    
    bw.flush();
    bw.close();
  }
}