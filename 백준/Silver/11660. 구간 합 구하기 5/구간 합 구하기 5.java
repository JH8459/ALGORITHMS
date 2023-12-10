import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 구간 합 알고리즘 2
     * Do to! 코딩 테스트 47.p
     * 합 배열을 이용하여 시간 복잡도 개선 O(n) => O(1)
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());   // 2차원 배열의 크기
    int m = Integer.parseInt(st.nextToken());   // 구간 합 질문의 갯수 M

    long[][] nArr = new long[n + 1][n + 1];   // 원본 배열 nArr
    long[][] nSumArr = new long[n + 1][n + 1];   // 합 배열 nSumArr

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());   // 줄에 담긴 수를 받을 문자열

      for (int j = 1; j <= n; j++) {
        nArr[i][j] = Integer.parseInt(st.nextToken());  // 원본 배열
      }
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        nSumArr[i][j] =
            nSumArr[i][j - 1] + nSumArr[i - 1][j] - nSumArr[i - 1][j - 1] + nArr[i][j]; // 구간 합 배열 생성
      }
    }

    for (int cnt = 0; cnt < m; cnt++) {
      st = new StringTokenizer(br.readLine());    // 줄에 담긴 수를 받을 문자열

      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      long result = nSumArr[x2][y2] - nSumArr[x1 - 1][y2] - nSumArr[x2][y1 - 1] + nSumArr[x1 - 1][y1 - 1];

      bw.write(result + "\n");
    }

    bw.flush();
  }
}