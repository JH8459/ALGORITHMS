import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 스택과 큐
     * Do to! 코딩 테스트 81.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer bf = new StringBuffer();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // n개의 수
    int[] nArr = new int[n];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>(); // stack 선언

    int num = 1;
    boolean isPossible = true;  // 불가능 경우를 판단하는 변수

    for (int i = 0; i < n; i++) {
      int target = nArr[i];

      if (target >= num) {
        while (target >= num) {
          stack.push(num++);
          bf.append("+\n");
        }

        stack.pop();
        bf.append("-\n");
      } else {
        int temp = stack.pop();

        if (temp > target) {
          System.out.println("NO");
          isPossible = false;
          break;
        } else {
          bf.append("-\n");
        }
      }
    }

    if (isPossible) {
      System.out.println(bf);
    }
  }
}