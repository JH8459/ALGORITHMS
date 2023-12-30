import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 나무의 갯수 n
    long m = Integer.parseInt(st.nextToken()); // 가져가야 할 높이 m
    long[] treeArr = new long[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      treeArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(treeArr);

    long start = 0;
    long end = treeArr[n - 1];  // 길이가 가장 긴 나무

    while (start < end) {
      long middle = (start + end) / 2; // 중간 길이의 높이 (= 절단기 높이)
      long sum = 0;

      for (long tree : treeArr) {
        if (tree - middle > 0) {
          sum += (tree - middle);  // 절단기 이상의 나무 길이들의 합을 구한한다
        }
      }

      if (sum < m) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    bw.write(start - 1 + "\n");
    bw.flush();
    bw.close();
  }
}