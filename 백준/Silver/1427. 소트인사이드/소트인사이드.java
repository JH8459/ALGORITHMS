import java.io.*;
import java.util.Arrays;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 선택 정렬 => O(n^2)
     * Do to! 코딩 테스트 104.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();
    int[] nArr = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
      nArr[i] = Integer.parseInt(s.split("")[i]);
    }

    for (int i = 0; i < s.length(); i++) {
      int maxIdx = i;

      for (int j = i + 1; j < s.length(); j++) {
        if (nArr[j] > nArr[maxIdx]) {
          maxIdx = j;
        }
      }

      if (nArr[i] < nArr[maxIdx]) {
        int temp = nArr[i];

        nArr[i] = nArr[maxIdx];
        nArr[maxIdx] = temp;
      }
    }

    for (int i = 0; i < s.length(); i++) {
      bw.write(String.valueOf(nArr[i]));
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}