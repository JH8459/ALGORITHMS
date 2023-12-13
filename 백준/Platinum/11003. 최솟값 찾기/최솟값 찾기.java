import java.io.*;
import java.util.*;
import org.w3c.dom.Node;

public class Main {

  static class Node {

    public int value;
    public int index;

    Node(int value, int index) {
      this.value = value;
      this.index = index;
    }
  }

  public static void main(String args[]) throws IOException {
    /*
     * 슬라이딩 윈도우
     * Do to! 코딩 테스트 75.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // n개의 수
    int l = Integer.parseInt(st.nextToken()); // 최소값을 구하는 범위
    /*
     * 일반적으로 정렬은 nLog(n)의 시간 복잡도를 가지므로,
     * 해당 문제에서는 정렬 메소드를 사용할 수 없다.
     * 슬라이딩 윈도우를 덱으로 구현하여 정렬 효과를 보게끔 알고리즘 구현
     */
    Deque<Node> myDeque = new LinkedList<>(); // 데이터를 담을 덱 자료구조

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());
      // 새로운 값이 들어올 때 정렬 대신 현재 수 보다 큰 값을 덱에서 제거
      while (!myDeque.isEmpty() && myDeque.getLast().value > num) {
        myDeque.removeLast();
      }

      myDeque.addLast(new Node(num, i));
      // 범위 벗어난 값은 덱에서 제거
      if (myDeque.getFirst().index <= i - l) {
        myDeque.removeFirst();
      }

      bw.write(myDeque.getFirst().value + " ");
    }

    bw.write("\n");
    bw.flush();
  }
}