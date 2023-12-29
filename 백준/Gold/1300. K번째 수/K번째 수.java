import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 이진 탐색 => O(logN)
     * Do to! 코딩 테스트 190.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());

    long start = 1;
    long end = k;
    long result = 0;

    while (start <= end) {
      long middle = (start + end) / 2;
      long cnt = 0;  // 중앙 값 보다 작은 수를 셀 변수

      for (int i = 1; i <= n; i++) {
        // middle을 i(각 행의 첫번째 값)로 나눈 값과 n 중 작은 값을 더한다
        // 단, 나눈 값이 n보다 크면 n으로 한정한다
        cnt += Math.min(middle / i, n);
      }

      if (cnt < k) {
        start = middle + 1;
      } else {
        end = middle - 1;
        result = middle;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}