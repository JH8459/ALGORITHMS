import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 스택과 큐
     * Do to! 코딩 테스트 94.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 연산자 갯수

    // 우선순위 큐 선언
    PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> {
      int firstAbs = Math.abs(x);
      int secondAbs = Math.abs(y);

      if (firstAbs == secondAbs) {
        return x > y ? 1 : -1;  // 절대값이 같으면 음수 우선
      } else {
        return firstAbs - secondAbs;  // 절대값 기준으로 정렬
      }
    });

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());

      int num = Integer.parseInt(st.nextToken());

      if (num == 0) {
        if (queue.isEmpty()) {
          bw.write("0\n");
        } else {
          bw.write(queue.poll() + "\n");
        }
      } else {
        queue.add(num);
      }
    }

    bw.flush();
    bw.close();
  }
}