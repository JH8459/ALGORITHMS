import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 투 포인터
     * Do to! 코딩 테스트 59.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());   // 재료의 개수 N
    int m = Integer.parseInt(br.readLine());   // 갑옷을 만드는데 필요한 수 M
    int[] nArr = new int[n];  // 재료 배열

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr);

    int count = 0; // 경우의 수를 헤아릴 변수

    // 투 포인터 IDX
    int startIdx = 0;
    int endIdx = n - 1;

    while (startIdx < endIdx) {
      int sum = nArr[startIdx] + nArr[endIdx];  // 재료의 합

      if (sum < m) {
        startIdx++;
      } else if (sum > m) {
        endIdx--;
      } else {
        count++;
        startIdx++;
        endIdx--;
      }
    }

    bw.write(count + "\n");

    bw.flush();
  }
}