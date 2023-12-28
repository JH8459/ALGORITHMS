import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 이진 탐색 => O(logN)
     * Do to! 코딩 테스트 182.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] nArr = new int[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr);  // nArr 배열 오름차순 정렬

    st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int target = Integer.parseInt(st.nextToken());

      int start = 0;
      int end = n - 1;
      int result = 0;

      while (start <= end) {
        int middle = (start + end) / 2;

        if (target > nArr[middle]) {
          start = middle + 1;
        } else if (target < nArr[middle]) {
          end = middle - 1;
        } else {
          result = 1;
          break;
        }
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}