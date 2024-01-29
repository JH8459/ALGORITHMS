import java.io.*;
import java.util.*;

public class Main {
  static public int n;
  static public int num;
  static public int result;
  static public boolean[] visited;
  static public String[] answerArr;

  // 현재 값과 사용한 계산기 명령어 정보를 저장하는 클래스
  static class Info {
    int num;
    String str;

    public Info(int num, String str) {
      this.num = num;
      this.str = str;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    answerArr = new String[n];

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      num = Integer.parseInt(st.nextToken());
      result = Integer.parseInt(st.nextToken());

      visited = new boolean[10000];
      answerArr[i] = bfs();
    }

    for(String s: answerArr){
      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static String bfs() {
    Queue<Info> queue = new LinkedList<>();
    queue.offer(new Info(num, ""));

    while (!queue.isEmpty()) {
      Info info = queue.poll();
      // 해당 숫자를 방문한적이 있다면 다음 큐 값으로 넘어갑니다.
      if (visited[info.num]) {
        continue;
      }
      visited[info.num] = true;

      // 정답과 일치한다면 명령어 모음을 반환합니다.
      if (info.num == result) {
        return info.str;
      }

      // D 명령어
      queue.offer(new Info((info.num * 2) % 10000, info.str + "D"));

      // S 명령어
      int numS = (info.num == 0) ? 9999 : info.num - 1;
      queue.offer(new Info(numS, info.str + "S"));

      // L 명령어
      int numL = (info.num / 1000) + ((info.num / 100) % 10) * 1000 + ((info.num / 10) % 10) * 100 + (info.num % 10) * 10;
      queue.offer(new Info(numL, info.str + "L"));

      // R 명령어
      int numR = (info.num / 1000) * 100 + ((info.num / 100) % 10) * 10 + (info.num / 10) % 10 + (info.num % 10) * 1000;
      queue.offer(new Info(numR, info.str + "R"));
    }

    return "";
  }
}