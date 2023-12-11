import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 투 포인터
     * Do to! 코딩 테스트 56.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());   // 입력된 자연수 N

    int sum = 1; // 연속되는 값을 누적할 변수
    int count = 1; // 경우의 수를 헤아릴 변수 (초기화 1인 이유는 N을 그대로 뽑는 경우 1회는 미리 산정)

    // 투 포인터 IDX
    int startIdx = 1;
    int endIdx = 1;

    while (endIdx != n) {
      if (sum == n) {
        count++;
        endIdx++;
        sum = sum + endIdx;
      } else if (sum > n) {
        sum = sum - startIdx;
        startIdx++;
      } else {
        endIdx++;
        sum = sum + endIdx;
      }
    }

    bw.write(count + "\n");

    bw.flush();
  }
}