import java.io.*;
import java.util.*;

public class Main {

  public static int n;

  public static void main(String args[]) throws IOException {
    /*
     * 탐색 - 깊이 우선 탐색 => O(v + e)  // v는 노드 수, e는 엣지 수
     * Do to! 코딩 테스트 153.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine()); // 자리수 n

    // 깊이 우선 탐색 실시
    dfs(2, 1);  // 일의 자리 소수는 2,3,5,7 이므로 4개 수에서만 시작한다.
    dfs(3, 1);
    dfs(5, 1);
    dfs(7, 1);
  }

  public static void dfs(int number, int digits) {
    // 탈출 조건 (자리수가 n과 같아지는 경우)
    if (digits == n) {
      // 소수라면 출력 후 종료
      if (isPrime(number)) {
        System.out.println(number);
      }

      return;
    }

    for (int i = 1; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }

      if (isPrime(number * 10 + i)) {
        dfs(number * 10 + i, digits + 1);
      }
    }
  }

  public static boolean isPrime(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }
}