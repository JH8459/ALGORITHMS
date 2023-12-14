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
    int[] nArr = new int[n];  // 수열 배열
    int[] answerArr = new int[n]; // 정답 배열

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>(); // stack 선언
    stack.push(0);

    for (int i = 0; i < n; i++) {
      // 스택이 비어있지 않고 현재 수열의 stack에 쌓인 top값 보다 클 경우
      while (!stack.isEmpty() && nArr[stack.peek()] < nArr[i]) {
        answerArr[stack.pop()] = nArr[i];
      }

      stack.push(i);
    }

    // n번 반복문을 순회하였음에도 스택이 비어있지 않다면 스택이 빌때까지 answer배열을 -1로 채운다.
    while (!stack.isEmpty()) {
      answerArr[stack.pop()] = -1;
    }

    for (int i = 0; i < n; i++) {
      bw.write(answerArr[i] + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}