import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 버블 정렬 => O(n^2)
     * Do to! 코딩 테스트 101.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine()); // 수의 갯수 (1 ~ 1,000)
    int[] nArr = new int[n];

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());

      nArr[i] = num;
    }

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (nArr[j] > nArr[j + 1]) {
          int temp = nArr[j];

          nArr[j] = nArr[j + 1];
          nArr[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      bw.write(nArr[i] + "\n");
    }

    bw.flush();
    bw.close();
  }
}