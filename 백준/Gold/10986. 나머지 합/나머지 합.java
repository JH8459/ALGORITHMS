import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 구간 합 알고리즘 3
     * Do to! 코딩 테스트 52.p
     * 합 배열을 이용하여 시간 복잡도 개선 O(n) => O(1)
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());   // 숫자의 갯수 N
    int m = Integer.parseInt(st.nextToken());   // 나머지를 구할 피제수 M

    long[] nSumArr = new long[n];   // 합 배열 nSumArr
    long[] nCntArr = new long[m];  // 같은 나머지값을 카운트하는 배열

    long result = 0;

    st = new StringTokenizer(br.readLine());   // 줄에 담긴 수를 받을 문자열

    nSumArr[0] = Integer.parseInt(st.nextToken());

    for (int i = 1; i < n; i++) {
      nSumArr[i] = nSumArr[i - 1] + Integer.parseInt(st.nextToken());  // 합 배열
    }

    for (int i = 0; i < n; i++) { // 합 배열에 % 연산 수행
      long remain = nSumArr[i] % m;

      if (remain == 0) {
        result++;
      }

      nCntArr[(int) remain]++;
    }

    for (int i = 0; i < m; i++) {
      if (nCntArr[i] > 1) {
        // 2개 이상의 같은 나머지값이 존재하는 경우 경우의 수 산출
        result = result + (nCntArr[i] * (nCntArr[i] - 1) / 2);  // 경우의 수 구하기 (nC2)
      }
    }

    bw.write(result + "\n");

    bw.flush();
  }
}