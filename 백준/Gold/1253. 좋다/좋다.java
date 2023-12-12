import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 투 포인터
     * Do to! 코딩 테스트 63.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());   // 수의 개수 N
    long[] nArr = new long[n];  // 원본 배열

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr);

    int count = 0; // 경우의 수를 헤아릴 변수

    for (int i = 0; i < n; i++) {
      // 좋은 수 여부를 확인 할 수
      long target = nArr[i];
      // 투 포인터 IDX
      int startIdx = 0;
      int endIdx = n - 1;

      while (startIdx < endIdx) {
        if (nArr[startIdx] + nArr[endIdx] == target) {
          if (startIdx != i && endIdx != i) { // 자기 자신이 "좋은 수"가 될 수 없다
            count++;
            break;
          } else if (startIdx == i) {
            startIdx++;
          } else if (endIdx == i) {
            endIdx--;
          }
        } else if (nArr[startIdx] + nArr[endIdx] < target) {
          startIdx++;
        } else {
          endIdx--;
        }
      }
    }

    bw.write(count + "\n");

    bw.flush();
  }
}