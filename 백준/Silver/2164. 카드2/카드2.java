import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 스택과 큐
     * Do to! 코딩 테스트 86.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // n개의 수

    Queue<Integer> queue = new LinkedList<>();  // queue 선언
    // queue에 정수 N까지의 카드를 넣는다
    for (int i = 1; i <= n; i++) {
      queue.add(i);
    }
    // queue에 카드가 1장 남을때 까지 반복문 순회
    while (queue.size() > 1) {
      queue.poll();
      queue.add(queue.poll());  // 맨위 카드를 맨 아래로 옮긴다.
    }

    bw.write(queue.poll() + "\n");  // 마지막 남은 카드 출력
    bw.flush();
    bw.close();
  }
}