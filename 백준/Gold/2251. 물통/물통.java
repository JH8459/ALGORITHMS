import java.io.*;
import java.util.*;

public class Main {
  /*
   * 그래프
   * Do to! 코딩 테스트 274.p
   */
  public static int[] sender = { 0, 0, 1, 1, 2, 2 };  // 6가지 경우를 탐색하기 위한 배열
  public static int[] receiver = { 1, 2, 0, 2, 0, 1 };  // 6가지 경우를 탐색하기 위한 배열
  public static boolean[][] visited;  // 방문 여부 체크 배열
  public static boolean[] answer;  // 정답 배열
  public static int[] now; // 현재 물통 수위 배열

  public static class AB {  // A물통과 B물통만 값을 알면 C물통 수위 확인 가능
    int a;
    int b;

    public AB (int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    now = new int[3];

    now[0] = Integer.parseInt(st.nextToken());
    now[1] = Integer.parseInt(st.nextToken());
    now[2] = Integer.parseInt(st.nextToken());

    visited = new boolean[201][201];
    answer = new boolean[201];

    bfs();

    for(int i = 0; i < answer.length; i++){
      if(answer[i]){
        bw.write( i+ " ");
      }
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }

  public static void bfs(){
    Queue<AB> queue = new LinkedList<>();

    queue.add(new AB(0, 0));
    visited[0][0] = true;
    answer[now[2]] = true;

    while (!queue.isEmpty()){
      AB p = queue.poll();

      int a = p.a;
      int b = p.b;
      int c = now[2] - (a + b);
      // 6가지 경우의 수 판단 (A=>B, A=>C, B=>A, B=>C, C=>A, C=>B)
      for(int i = 0; i < 6; i++){
        int[] next = {a, b, c};
        next[receiver[i]] += next[sender[i]];
        next[sender[i]] = 0;

        if(next[receiver[i]] > now[receiver[i]]){ // 물이 넘치는 경우 => 초과하는 만큼 이전 물통으로 다시 넣는다
          next[sender[i]] = next[receiver[i]] - now[receiver[i]];
          next[receiver[i]] = now[receiver[i]];
        }

        if (!visited[next[0]][next[1]]) {
          visited[next[0]][next[1]] = true;
          queue.add(new AB(next[0], next[1]));

          if(next[0] == 0){
            answer[next[2]] = true;
          }
        }
      }
    }
  }
}