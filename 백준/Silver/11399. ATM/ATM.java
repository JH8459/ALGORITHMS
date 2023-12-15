import java.io.*;
import java.util.Arrays;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 선택 정렬 => O(n^2)
     * Do to! 코딩 테스트 115.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());  // 사람 수 n
    int sum = 0; // 합 배열의 누적 합을 계산할 변수 sum
    String s = br.readLine(); // 각 사람이 돈을 인출하는데 걸리는 시간

    int[] nArr = new int[n];
    int[] sArr = new int[n];  // 인출 시간 누적을 구할 합 배열

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(s.split(" ")[i]);
    }
    // 삽입 정렬
    for (int i = 0; i < n; i++) {
      int insertIdx = i;
      int insertValue = nArr[i];

      for (int j = i - 1; j >= 0; j--) {
        if (nArr[i] > nArr[j]) {
          insertIdx = j + 1;
          break;
        }

        if (j == 0) {
          insertIdx = 0;
        }
      }

      for (int j = i; j > insertIdx; j--) {
        nArr[j] = nArr[j - 1];
      }

      nArr[insertIdx] = insertValue;
    }

    // 합 배열 만들기
    sArr[0] = nArr[0];
    for (int i = 1; i < n; i++) {
      sArr[i] = sArr[i - 1] + nArr[i];
    }

    for (int i = 0; i < n; i++) {
      sum = sum + sArr[i];
    }

    bw.write(sum + "\n");
    bw.flush();
    bw.close();
  }
}